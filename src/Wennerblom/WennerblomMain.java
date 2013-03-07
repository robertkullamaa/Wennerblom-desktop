package Wennerblom;

import javax.swing.*;
import java.awt.*;
 
public class WennerblomMain extends JFrame {

    public static JDesktopPane desktop;

    public static final int INSET = 50;

    public static void main(String[] args) {
        createAndShowGUI();
    }

    /*public JInternalFrame getAnswer(String kkr) {
        WennerblomModel m = new WennerblomModel();
        m.setB2(kkr);
        return new AnswerWindow(m);
    }*/

    /**
     *
     */
    public WennerblomMain() {
        super("Wennerblom");
        setVisible(true);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(INSET, INSET, screenSize.width - INSET * 2, screenSize.height - INSET * 2);
        desktop = new JDesktopPane(); //a specialized layered pane
        createFrame(new Wennerblom.LanguageSelect(this)); //create Language selection window
        add(desktop);

        //Make dragging a little faster but perhaps uglier.
        desktop.setDragMode(JDesktopPane.LIVE_DRAG_MODE);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    /**
     * TODO
     * @param frame
     */
    public void createFrame(JInternalFrame frame) {
        frame.setVisible(true);
        desktop.add(frame);
        try {
            frame.setSelected(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
     /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    public static void createAndShowGUI() {
        //Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);
 
        //Create and set up the window.
        new WennerblomMain();
    }
}