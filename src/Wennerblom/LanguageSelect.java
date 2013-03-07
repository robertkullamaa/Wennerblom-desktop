package Wennerblom;

import Util.LanguageResourceBundle;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;

/**
 * LanguageSelect.java holds strings in several languages, used to allow the user to choose the programms language.
 * @author Robert Kullamaa
 * @author Hannes Kinks
 */


public class LanguageSelect extends JInternalFrame implements ActionListener {
    private WennerblomMain oParentFrame;

    public LanguageSelect(WennerblomMain oParent) {
        super("Wenner",
                false, //resizable
                false, //closable
                false, //maximizable
                true); //iconifiable
        setSize(450, 200);
        setLocation(100, 100);
        oParentFrame = oParent;
        add(addComponents());
    }

    /**
     * TODO
     * @return
     */
    public JTabbedPane addComponents() {
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.add("Language", getLanguageTab());
        tabbedPane.add("About", getAboutTab());
        tabbedPane.add("Server", getConnectionTab());
        return tabbedPane;
    }

    /**
     * TODO
     * @return
     */
    private JPanel getConnectionTab() {
        JPanel connectionTab = new JPanel();
        connectionTab.add(new JLabel("Server selection"));

        JButton btnLocalBase = new JButton("Local database");
        btnLocalBase.addActionListener(this);
        btnLocalBase.setActionCommand("local");
        connectionTab.add(btnLocalBase);

        JButton btnEwisBase = new JButton("Ewis database");
        btnEwisBase.addActionListener(this);
        btnEwisBase.setActionCommand("ewis");
        connectionTab.add(btnEwisBase);
        return connectionTab;
    }

    /**
     * TODO
     * @return
     */
    private JPanel getAboutTab() {
        JPanel aboutTab = new JPanel();

        //project web page
        JPanel wepPagePanel = new JPanel();
        JLabel infoAboutTheProject = new JLabel("Project web page: http://ewis.era.ee");
        wepPagePanel.add(infoAboutTheProject);
                JButton btnProjSite = new JButton("Copy link");
        btnProjSite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                StringSelection strSel = new StringSelection("http://ewis.era.ee");
                clipboard.setContents(strSel, null);
            }
        });
        wepPagePanel.add(btnProjSite);
        aboutTab.add(wepPagePanel);

        //information about the model
        JLabel infoAboutTheModel = new JLabel("Information about the model: ");
        aboutTab.add(infoAboutTheModel);
        JButton btnModelInfo = new JButton("Copy link");
        btnModelInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                StringSelection strSel = new StringSelection("http://www.balticnest.org/download/18.2beb0a011325eb5811a8000218249/Ennet_Peeter.pdf");
                clipboard.setContents(strSel, null);
            }
        });
        aboutTab.add(btnModelInfo);

        JLabel ContactInfo = new JLabel("Contact information: Project E-mail address - ewis@era.ee");
        aboutTab.add(ContactInfo);

        JButton btnEmail = new JButton("Copy mail address");
        btnEmail.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                StringSelection strSel = new StringSelection("ewis@era.ee");
                clipboard.setContents(strSel, null);
            }
        });
        aboutTab.add(btnEmail);

        return aboutTab;
    }

    /**
     * TODO
     * @return
     */
    private JPanel getLanguageTab() {
        JPanel buttonTab = new JPanel();

        try {
            ImageIcon estIcon = new ImageIcon(ImageIO.read(new FileInputStream(new File("language_img\\Estonia.png"))));
            JButton BEst = new JButton(estIcon);
            BEst.setActionCommand("Est");
            BEst.addActionListener(this);
            BEst.setToolTipText("Eesti keel");
            buttonTab.add(BEst);

            ImageIcon engIcon = new ImageIcon(ImageIO.read(new FileInputStream(new File("language_img\\UK.png"))));
            JButton BEng = new JButton(engIcon);
            BEng.setActionCommand("Eng");
            BEng.addActionListener(this);
            BEng.setToolTipText("English");
            buttonTab.add(BEng);

            ImageIcon rusIcon = new ImageIcon(ImageIO.read(new FileInputStream(new File("language_img\\Russia.png"))));
            JButton BRus = new JButton(rusIcon);
            BRus.setActionCommand("Rus");
            BRus.addActionListener(this);
            BRus.setToolTipText("Pусский язык");
            buttonTab.add(BRus);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return buttonTab;
    }

    /**
     *
     * @param lang
     */
    private void changeLanguageTo(Locale lang) {
        LanguageResourceBundle.setLocale(lang);
    }

    //püütakse event kinni ja tehakse mis vaja
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("ewis")) {
            //PostGreConnection.HOST = "ewis.era.ee:5432";
            return;
        }

        if (e.getActionCommand().equals("local")) {
            //PostGreConnection.HOST = "localhost:5432";
            return;
        }

        Locale lang = LanguageResourceBundle.DEFAULT_LOCALE;
        if (e.getActionCommand().equals("Est")) {
            lang = new Locale("et");
        }
        if (e.getActionCommand().equals("Eng")) {
            lang = new Locale("en");
        }
        if (e.getActionCommand().equals("Rus")) {
            lang = new Locale("ru");
        }

        LanguageResourceBundle.setLocale(lang);
        oParentFrame.createFrame(new MainForm(oParentFrame));
        this.dispose();
    }
}