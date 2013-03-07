package Result;

import Util.io.ModelToExcel;
import Wennerblom.WennerblomModel;
import jxl.write.WriteException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class AnswerWindow extends JInternalFrame implements ActionListener {

    /**
     *
     */
    WennerblomModel model;

    /**
     *
     */
    public static int counter = 0;  //counter on loendur, mida kasutatakse uute tulemuste akende avamisel

    /**
     *
     * @param model
     */
    public AnswerWindow(WennerblomModel model){
        super(model.getB2(),
                true, //resizable
                true, //closable
                true, //maximizable
                true); //iconifiable
        this.model = model;
        setSize(700, 520);
        setLocation(100, counter * 40);
        //if(counter * 50>=(int)height){counter = 0;}

        add(getPanel());
    }

    /**
     *
     * @return
     */
    public JPanel getPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JTabbedPane tabPane = new JTabbedPane();

        tabPane.add("Tabel1", new JScrollPane(new Tabel1(model)));
        tabPane.add("Tabel2", new JScrollPane(new Tabel2(model)));
        tabPane.add("Nitrogen chart", new NChart(model).getChartPanel());
        tabPane.add("Phosphorus chart", new PChart(model).getChartPanel());
        tabPane.add("Nitrogen pie chart", new NPieChart(model).getChartPanel());
        tabPane.add("Phosphorus pie chart", new NPieChart(model).getChartPanel());
        panel.add(tabPane);

        JButton btnExport = new JButton("Export");
        btnExport.setActionCommand("export");
        btnExport.addActionListener(this);

        panel.add(btnExport);
        return panel;
    }

    /**
     *
     * @param model
     * @throws IOException
     * @throws WriteException
     */
    public void writeExcel(WennerblomModel model) throws IOException, WriteException {
        ModelToExcel test = new ModelToExcel(model);
        JFileChooser fileChooser = new JFileChooser();
        int returnVal = fileChooser.showDialog(this, "Save");
        String path = "";
        if (returnVal == JFileChooser.OPEN_DIALOG) {
            path = fileChooser.getCurrentDirectory().getAbsolutePath();
            try {

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                        "Palun kontrollige, et õige fail on valitud",
                        "Failist lugemine ebaõnnestus",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
        test.setOutputFile(fileChooser.getSelectedFile().getAbsolutePath() + ".xls");
        test.write();
    }

    /**
     *
     * @param e
     */
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("export")) {
            try {
                writeExcel(this.model);
            } catch (IOException e1) {
                e1.printStackTrace();
                System.out.println("Esines viga faili kirjutamisel");
            } catch (WriteException e1) {
                e1.printStackTrace();
                System.out.println("Esines viga faili kirjutamisel");
            }
        }
    }
}