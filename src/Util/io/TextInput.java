package Util.io;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


public class TextInput extends JTextField implements FocusListener {

	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = -1063430183097902419L;

	public void focusGained(FocusEvent e) {}

    public void focusLost(FocusEvent e) {
        //this.setText(this.getFixedText());
    }

    
    
    /**
     * text <=> string
     * floatingNumber <=> double,float
     * integerNumber <=> int
     */
    public enum enInputType {
        TEXTSTRING,
        FLOATNUMBER,
        INTEGERNUMBER
    }

    private enInputType inputType;

    public TextInput(enInputType inputType, String sText) {
        this.inputType = inputType;
        this.setText(sText);
        this.addFocusListener(this);

    }

    /**
     * Returns the text typed into the text field.
     * Returns empty string in case of a empty text field
     * @param txt the JTextField
     */
    public String CheckAndSetString(JTextField txt){
                if(txt.getText() != null){
                    return txt.getText();
                }
                else{
                    return "";
                }
    }

    /**
     * Tries to parse the text typed into the text field info a double
     * @param txt the JTextField
     * @return if the parsing was successful, then a double else 0.
     * TODO: uurida miks f ja d on lubatud sümbolid double parsimisel
     */
    public double CheckAndSetDouble(JTextField txt){
            double value;
            try {
                txt.setText(txt.getText().replace(",","."));
                value = Double.parseDouble(txt.getText());
                return value;
            }
            catch(NumberFormatException e) {
                return (double)0;
            }
    }

    /**
     * Tries to parse the text typed into the text field info an integer
     * @param txt the JTextField
     * @return if the parsing was successful, then an integer else 0.
     */
    public int CheckAndSetInt(JTextField txt){
            int value;
            try {
                value = Integer.parseInt(txt.getText());
                return value;
            }
            catch(NumberFormatException e) {
                return 0;
            }
    }

    /**
     * returns the JTextField's text after checking input
     * @return  JTextFields text as a string
     */
    public String getFixedText() {
        switch (inputType){
            case TEXTSTRING: return CheckAndSetString(this);
            case FLOATNUMBER: return Double.toString(CheckAndSetDouble(this));
            case INTEGERNUMBER: return Integer.toString(CheckAndSetInt(this));
        }
        return "";
    }

}
