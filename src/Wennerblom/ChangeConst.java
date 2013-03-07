package Wennerblom;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChangeConst extends JInternalFrame implements ActionListener {

	WennerblomModel model;

    private JButton b = new JButton("Muuda");
    private JLabel labelConstChange = new JLabel("Konts. muutmine");

    private JLabel labelMEDELQ = new JLabel("MEDELQ");
    private JTextField txtMEDELQ = new JTextField();

    private JLabel labelTOTAL_N = new JLabel("TOTAL_N");
    private JTextField txtTOTAL_N = new JTextField();

    private JLabel labelTOTAL_P = new JLabel("TOTAL_P");
    private JTextField txtTOTAL_P = new JTextField();

    private JLabel labelCOD = new JLabel("COD");
    private JTextField txtCOD = new JTextField();

    /**
     * Klassi constructor
     * @param wModel wennerblomModel
     */
    public ChangeConst(Wennerblom.WennerblomModel wModel) {
        super("Wenner",
                true, //resizable
                false, //closable
                false, //maximizable
                false); //iconifiable
        setSize(300, 200);
        setLocation(100, 100);
        model = wModel;
        add(getPanel());
    }

    private JPanel getPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        //textfieldidele algse väärtuste andmine
        /*txtMEDELQ.setText(Double.toString(model.getMEDELQ()));
        txtTOTAL_N.setText(Integer.toString(model.getTOTAL_N()));
        txtTOTAL_P.setText(Integer.toString(model.getTOTAL_P()));
        txtCOD.setText(Double.toString(model.getCOD()));*/
        b.setActionCommand("change");
        b.addActionListener(this);
        //componentite lisamine
        panel.add(b);
        panel.add(labelConstChange);
        panel.add(labelMEDELQ);
        panel.add(txtMEDELQ);
        panel.add(labelTOTAL_N);
        panel.add(txtTOTAL_N);
        panel.add(labelTOTAL_P);
        panel.add(txtTOTAL_P);
        panel.add(labelCOD);
        panel.add(txtCOD);
        return panel;
    }

    private void fSetValues() {
        /*model.setMEDELQ(Double.parseDouble(txtMEDELQ.getText()));
        model.setTOTAL_N(Integer.parseInt(txtTOTAL_N.getText()));
        model.setTOTAL_P(Integer.parseInt(txtTOTAL_P.getText()));
        model.setCOD(Double.parseDouble(txtCOD.getText()));*/
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("change")){
            fSetValues();
            this.dispose();
            MainForm.openNewConstFrame = true;
        }
    }
}
