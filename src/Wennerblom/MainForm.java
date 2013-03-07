package Wennerblom;

import Result.AnswerWindow;
import Util.LanguageResourceBundle;
import Util.io.FileImporter;
import Util.io.TextInput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedHashMap;

//TODO: textarea tab key eventi peale vahetada inputi
//TODO: scrollPane focus

//TODO:  võimalus valida jõge, veekogum, jõelõik, järved(seireveekogud)

public class MainForm extends JInternalFrame implements ActionListener {

    /**
     * Parent frame
     */
    private WennerblomMain oParentFrame;

    /**
     *
     */
    WennerblomModel model = new WennerblomModel();

    /**
     *
     */
    public static boolean openNewConstFrame = true;

    /**
     * LinkedHashMap that holds inputs and the fields where the data will be stored (dictionary)
     */
    private LinkedHashMap<String, TextInput> inputHashMap = new LinkedHashMap<String, TextInput>();

    private JButton btnBack = new JButton(LanguageResourceBundle.getBundle().getString("back"));
    private JButton btnImport = new JButton(LanguageResourceBundle.getBundle().getString("import"));
    private JButton btnCalculate = new JButton(LanguageResourceBundle.getBundle().getString("calculate"));
    private JButton btnChangeConst = new JButton(LanguageResourceBundle.getBundle().getString("changeConst"));

    /* THE DECLARATIONS OF DATA INPUT FIELDS */
    private TextInput txtVer;
    private TextInput txtB2;
    private TextInput txtB3;
    private TextInput txtB4;
    private TextInput txtB5;
    private TextInput txtB7;
    private TextInput txtB8;
    private TextInput txtB9;
    private TextInput txtB10;
    private TextInput txtB11;
    private TextInput txtB12;
    private TextInput txtB13;
    private TextInput txtB14;
    private TextInput txtB15;
    private TextInput txtB17;
    private TextInput txtB18;
    private TextInput txtB34;
    private TextInput txtB35;
    private TextInput txtB36;
    private TextInput txtB37;
    private TextInput txtB38;
    private TextInput txtB39;
    private TextInput txtB41;
    private TextInput txtB42;
    private TextInput txtB43;
    private TextInput txtB44;
    private TextInput txtB47;
    private TextInput txtB48;
    private TextInput txtB49;
    private TextInput txtB50;
    private TextInput txtB51;
    private TextInput txtB52;
    private TextInput txtB53;
    private TextInput txtB54;
    private TextInput txtB55;
    private TextInput txtB56;
    private TextInput txtB57;
    private TextInput txtB58;
    private TextInput txtB60;
    private TextInput txtB61;
    private TextInput txtB62;
    private TextInput txtB63;
    private TextInput txtB64;
    private TextInput txtB65;
    private TextInput txtB66;
    private TextInput txtB68;
    private TextInput txtB69;
    private TextInput txtB70;
    private TextInput txtB71;
    private TextInput txtB72;

    /**
     *
     */
    public void initInputs() {
        // Versioon
        txtVer = new TextInput(TextInput.enInputType.TEXTSTRING, "");

        txtB2 = new TextInput(TextInput.enInputType.TEXTSTRING, model.getB2());
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B2"), txtB2);

        txtB3 = new TextInput(TextInput.enInputType.INTEGERNUMBER, Integer.toString(model.getB3()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B3"), txtB3);

        txtB4 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB4()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B4"), txtB4);

        txtB5 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB5()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B5"), txtB5);

        txtB7 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB7()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B7"), txtB7);

        txtB8 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB8()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B8"), txtB8);

        txtB9 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB9()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B9"), txtB9);

        txtB10 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB10()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B10"), txtB10);

        txtB11 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB11()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B11"), txtB11);

        txtB12 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB12()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B12"), txtB12);

        txtB13 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB13()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B13"), txtB13);

        txtB14 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB14()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B14"), txtB14);

        txtB15 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB15()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B15"), txtB15);

        txtB17 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB17()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B17"), txtB17);

        txtB18 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB18()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B18"), txtB18);

        txtB34 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB34()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B34"), txtB34);

        txtB35 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB35()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B35"), txtB35);

        txtB36 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB36()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B36"), txtB36);

        txtB37 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB37()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B37"), txtB37);

        txtB38 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB38()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B38"), txtB38);

        txtB39 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB39()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B39"), txtB39);

        txtB41 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB41()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B41"), txtB41);

        txtB42 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB42()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B42"), txtB42);

        txtB43 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB43()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B43"), txtB43);

        txtB44 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB44()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B44"), txtB44);

        txtB47 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB47()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B47"), txtB47);

        txtB48 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB48()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B48"), txtB48);

        txtB49 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB49()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B49"), txtB49);

        txtB50 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB50()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B50"), txtB50);

        txtB51 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB51()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B51"), txtB51);

        txtB52 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB52()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B52"), txtB52);

        txtB53 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB53()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B53"), txtB53);

        txtB54 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB54()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B54"), txtB54);

        txtB55 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB55()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B55"), txtB55);

        txtB56 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB56()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B56"), txtB56);

        txtB57 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB57()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B57"), txtB57);

        txtB58 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB58()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B58"), txtB58);

        txtB60 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB60()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B60"), txtB60);

        txtB61 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB61()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B61"), txtB61);

        txtB62 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB62()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B62"), txtB62);

        txtB63 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB63()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B63"), txtB63);

        txtB64 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB64()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B64"), txtB64);

        txtB65 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB65()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B65"), txtB65);

        txtB66 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB66()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B66"), txtB66);

        txtB68 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB68()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B68"), txtB68);

        txtB69 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB69()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B69"), txtB69);

        txtB70 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB70()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B70"), txtB70);

        txtB71 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB71()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B71"), txtB71);

        txtB72 = new TextInput(TextInput.enInputType.FLOATNUMBER, Double.toString(model.getB72()));
        inputHashMap.put(LanguageResourceBundle.getBundle().getString("B72"), txtB72);
    }

    private JScrollPane scrollPane;

    public MainForm(WennerblomMain oParrent){
        super("Andmed", true, //resizable
                        false, //closable
                        true, //maximizable
                        true);//iconifiable
        oParentFrame = oParrent;

        setSize(600, 400);
        setMinimumSize(new Dimension(450, 300));
        setLocation(100, 100);
        initInputs();
        oParentFrame.createFrame(new RiverTree(txtB2, oParrent));
        this.add(addComponents());
    }

    public JPanel addComponents(){
        JPanel componentPanel = new JPanel();
        componentPanel.setLayout(new BorderLayout());

        JPanel titlePanel = new JPanel();
        //back button (returns to the last window)
        btnBack.setActionCommand("back");
        btnBack.addActionListener(this);
        titlePanel.add(btnBack);

        //allows the user to use a different set or create a new set of costants
        btnChangeConst.setActionCommand("change");
        btnChangeConst.addActionListener(this);
        titlePanel.add(btnChangeConst);

        //allows the user to import a previously saved run of the model
        titlePanel.add(btnImport);
        btnImport.addActionListener(this);
        btnImport.setActionCommand("import");

        //Calculate button
        titlePanel.add(btnCalculate);
        btnCalculate.addActionListener(this);
        btnCalculate.setActionCommand("calc");

        JPanel commentPanel = new JPanel();
        commentPanel.setLayout(new BorderLayout());
        commentPanel.add(titlePanel, BorderLayout.NORTH);

        commentPanel.add(getVerPanel(), BorderLayout.CENTER);

        //add the title panel
        componentPanel.add(commentPanel, BorderLayout.NORTH);

        //gets the input panel (since there are around 50 inputs, the inputs were placed inside a JScrollPane
        scrollPane = new JScrollPane(getDataPanel());

        componentPanel.add(scrollPane, BorderLayout.CENTER);

        return componentPanel;
    }

    //kommentaari osa on loll hetkel veel
    private JPanel getVerPanel() {
        JPanel p = new JPanel(new BorderLayout());
        p.setPreferredSize(new Dimension(100, 100));
        txtVer.setPreferredSize(new Dimension(200, 20));
        JPanel panel = new JPanel();
        panel.add(new JLabel("Version"));
        panel.add(txtVer);

        p.add(panel, BorderLayout.NORTH);
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        p.add(scrollPane, BorderLayout.CENTER);
        return p;
    }

    private void setNextRow() {
        txtCellConstraints.gridy++;
        lblCellConstraints.gridy++;
    }

    GridBagConstraints lblCellConstraints;
    GridBagConstraints txtCellConstraints;

    /**
     * dataPanel displays all the labels and textFields
     * @return
     */
    private JPanel getDataPanel() {
        JPanel dataPanel = new JPanel(new GridBagLayout());
        lblCellConstraints = new GridBagConstraints();
        lblCellConstraints.fill = GridBagConstraints.HORIZONTAL;
        lblCellConstraints.ipady = 3;
        lblCellConstraints.ipadx = 100;
        lblCellConstraints.anchor = GridBagConstraints.NORTH;
        lblCellConstraints.gridx = 1;
        lblCellConstraints.gridy = 0;
        lblCellConstraints.insets = new Insets(5, 5, 0, 0);

        txtCellConstraints = new GridBagConstraints();
        txtCellConstraints.fill = GridBagConstraints.HORIZONTAL;
        txtCellConstraints.ipady = 3;
        txtCellConstraints.ipadx = 215;
        txtCellConstraints.anchor = GridBagConstraints.NORTH;
        txtCellConstraints.gridx = 2;
        txtCellConstraints.weightx = 1;
        txtCellConstraints.gridy = 0;

        for (String key : inputHashMap.keySet()) {
            dataPanel.add(new JLabel(key), lblCellConstraints);
            dataPanel.add(inputHashMap.get(key), txtCellConstraints);
            inputHashMap.get(key).addFocusListener(new FocusAdapter() {
                public void focusGained(FocusEvent evt) {
                    jTextFieldFocusGained(evt);
                }
            });
            setNextRow();
        }

        return dataPanel;
    }

    /**
     *  fills the inputs from the model object
     */
    public void updateAllFields(){
        txtB2.setText(model.getB2());
        txtB3.setText(Integer.toString(model.getB3()));
        txtB4.setText(Double.toString(model.getB4()));
        txtB5.setText(Double.toString(model.getB5()));
        txtB7.setText(Double.toString(model.getB7()));
        txtB8.setText(Double.toString(model.getB8()));
        txtB9.setText(Double.toString(model.getB9()));
        txtB10.setText(Double.toString(model.getB10()));
        txtB11.setText(Double.toString(model.getB11()));
        txtB12.setText(Double.toString(model.getB12()));
        txtB13.setText(Double.toString(model.getB13()));
        txtB14.setText(Double.toString(model.getB14()));
        txtB15.setText(Double.toString(model.getB15()));
        txtB17.setText(Double.toString(model.getB17()));
        txtB18.setText(Double.toString(model.getB18()));
        txtB34.setText(Double.toString(model.getB34()));
        txtB35.setText(Double.toString(model.getB35()));
        txtB36.setText(Double.toString(model.getB36()));
        txtB37.setText(Double.toString(model.getB37()));
        txtB38.setText(Double.toString(model.getB38()));
        txtB39.setText(Double.toString(model.getB39()));
        txtB41.setText(Double.toString(model.getB41()));
        txtB42.setText(Double.toString(model.getB42()));
        txtB43.setText(Double.toString(model.getB43()));
        txtB44.setText(Double.toString(model.getB44()));
        txtB47.setText(Double.toString(model.getB47()));
        txtB48.setText(Double.toString(model.getB48()));
        txtB49.setText(Double.toString(model.getB49()));
        txtB50.setText(Double.toString(model.getB50()));
        txtB51.setText(Double.toString(model.getB51()));
        txtB52.setText(Double.toString(model.getB52()));
        txtB53.setText(Double.toString(model.getB53()));
        txtB54.setText(Double.toString(model.getB54()));
        txtB55.setText(Double.toString(model.getB55()));
        txtB56.setText(Double.toString(model.getB56()));
        txtB57.setText(Double.toString(model.getB57()));
        txtB58.setText(Double.toString(model.getB58()));
        txtB60.setText(Double.toString(model.getB60()));
        txtB61.setText(Double.toString(model.getB61()));
        txtB62.setText(Double.toString(model.getB62()));
        txtB63.setText(Double.toString(model.getB63()));
        txtB64.setText(Double.toString(model.getB64()));
        txtB65.setText(Double.toString(model.getB65()));
        txtB66.setText(Double.toString(model.getB66()));
        txtB68.setText(Double.toString(model.getB68()));
        txtB69.setText(Double.toString(model.getB69()));
        txtB70.setText(Double.toString(model.getB70()));
        txtB71.setText(Double.toString(model.getB71()));
        txtB72.setText(Double.toString(model.getB72()));

    }

    /**
     *  writes the user input into the model object
     */
    public void SetAllFields(){
        model.setB2(txtB2.getFixedText());
        model.setB3(Integer.parseInt(txtB3.getFixedText()));
        model.setB4(Double.parseDouble(txtB4.getFixedText()));
        model.setB5(Double.parseDouble(txtB5.getFixedText()));
        model.setB7(Double.parseDouble(txtB7.getFixedText()));
        model.setB8(Double.parseDouble(txtB8.getFixedText()));
        model.setB9(Double.parseDouble(txtB9.getFixedText()));
        model.setB10(Double.parseDouble(txtB10.getFixedText()));
        model.setB11(Double.parseDouble(txtB11.getFixedText()));
        model.setB12(Double.parseDouble(txtB12.getFixedText()));
        model.setB13(Double.parseDouble(txtB13.getFixedText()));
        model.setB14(Double.parseDouble(txtB14.getFixedText()));
        model.setB15(Double.parseDouble(txtB15.getFixedText()));
        model.setB17(Double.parseDouble(txtB17.getFixedText()));
        model.setB18(Double.parseDouble(txtB18.getFixedText()));
        model.setB34(Double.parseDouble(txtB34.getFixedText()));
        model.setB35(Double.parseDouble(txtB35.getFixedText()));
        model.setB36(Double.parseDouble(txtB36.getFixedText()));
        model.setB37(Double.parseDouble(txtB37.getFixedText()));
        model.setB38(Double.parseDouble(txtB38.getFixedText()));
        model.setB39(Double.parseDouble(txtB39.getFixedText()));
        model.setB41(Double.parseDouble(txtB41.getFixedText()));
        model.setB42(Double.parseDouble(txtB42.getFixedText()));
        model.setB43(Double.parseDouble(txtB43.getFixedText()));
        model.setB44(Double.parseDouble(txtB44.getFixedText()));
        model.setB47(Double.parseDouble(txtB47.getFixedText()));
        model.setB48(Double.parseDouble(txtB48.getFixedText()));
        model.setB49(Double.parseDouble(txtB49.getFixedText()));
        model.setB50(Double.parseDouble(txtB50.getFixedText()));
        model.setB51(Double.parseDouble(txtB51.getFixedText()));
        model.setB52(Double.parseDouble(txtB52.getFixedText()));
        model.setB53(Double.parseDouble(txtB53.getFixedText()));
        model.setB54(Double.parseDouble(txtB54.getFixedText()));
        model.setB55(Double.parseDouble(txtB55.getFixedText()));
        model.setB56(Double.parseDouble(txtB56.getFixedText()));
        model.setB57(Double.parseDouble(txtB57.getFixedText()));
        model.setB58(Double.parseDouble(txtB58.getFixedText()));
        model.setB60(Double.parseDouble(txtB60.getFixedText()));
        model.setB61(Double.parseDouble(txtB61.getFixedText()));
        model.setB62(Double.parseDouble(txtB62.getFixedText()));
        model.setB63(Double.parseDouble(txtB63.getFixedText()));
        model.setB64(Double.parseDouble(txtB64.getFixedText()));
        model.setB65(Double.parseDouble(txtB65.getFixedText()));
        model.setB66(Double.parseDouble(txtB66.getFixedText()));
        model.setB68(Double.parseDouble(txtB68.getFixedText()));
        model.setB69(Double.parseDouble(txtB69.getFixedText()));
        model.setB70(Double.parseDouble(txtB70.getFixedText()));
        model.setB71(Double.parseDouble(txtB71.getFixedText()));
        model.setB72(Double.parseDouble(txtB72.getFixedText()));
    }

    private ChangeConst constFrame;
    //ActionListener osa
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("back")){
            oParentFrame.createFrame(new LanguageSelect(oParentFrame));
            this.dispose();
        }

        if(e.getActionCommand().equals("change")){
            if (openNewConstFrame){
                constFrame = new ChangeConst(model);
                oParentFrame.createFrame(constFrame);
                openNewConstFrame = false;
            }
            else {
                constFrame.dispose();
                openNewConstFrame = true;
            }
        }

        if(e.getActionCommand().equals("calc")){
            SetAllFields();
            oParentFrame.createFrame(new AnswerWindow(model));
            AnswerWindow.counter++;
        }

        if(e.getActionCommand().equals("import")){
            FileImporter importer = new FileImporter();
            model = importer.getModelFromFile();
            updateAllFields();
        }
    }

    /**
     *
     * @param evt
     */
    private void jTextFieldFocusGained(FocusEvent evt) {
        java.awt.Component focusedComponent = evt.getComponent();
        scrollPane.scrollRectToVisible(focusedComponent.getBounds(null));
    }

}