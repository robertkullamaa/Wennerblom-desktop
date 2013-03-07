package Result;
import Wennerblom.WennerblomModel;
import javax.swing.*;

public class Tabel1 extends JPanel {

    WennerblomModel Wnbmodel;

    public Tabel1(WennerblomModel model){
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        Wnbmodel=model;
        add(new JLabel("Tabel 1. Lämmastiku- ja fosforiärakanne järvedesse ja vooluveekogudesse"));
        add(new JLabel("reostusallikate kaupa (looduslik ja inimlähtene)"));
        add(getTable());
    }

    public static double roundToDecimals(double d) {
        int temp=(int)((d*Math.pow(10, 2)));
        return (((double)temp)/Math.pow(10, 2));
    }

    private JTable getTable() {
        Object[][] values = {
            {"", "Lämmastik", "", "Fosfor", ""},
            {"", "t/a", "%", "kg/a", "%"},
            {"Ärakanne põllumaalt", roundToDecimals(Wnbmodel.getN9()), roundToDecimals(Wnbmodel.getN9() * 100 / Wnbmodel.getN21()), roundToDecimals(Wnbmodel.getP9()), roundToDecimals(Wnbmodel.getP9() * 100 / Wnbmodel.getP21())},
            {"Ärakanne metsadest", roundToDecimals(Wnbmodel.getN10()), roundToDecimals(Wnbmodel.getN10() * 100 / Wnbmodel.getN21()), roundToDecimals(Wnbmodel.getP10()), roundToDecimals(Wnbmodel.getP10() * 100 / Wnbmodel.getP21())},
            {"Metsamajandus", roundToDecimals(Wnbmodel.getN11()), roundToDecimals(Wnbmodel.getN11() * 100 / Wnbmodel.getN21()), roundToDecimals(Wnbmodel.getP11()), roundToDecimals(Wnbmodel.getP11() * 100 / Wnbmodel.getP21())},
            {"Ärakanne märgaladelt", roundToDecimals(Wnbmodel.getN12()), roundToDecimals(Wnbmodel.getN12() * 100 / Wnbmodel.getN21()), roundToDecimals(Wnbmodel.getP12()), roundToDecimals(Wnbmodel.getP12() * 100 / Wnbmodel.getP21())},
            {"Ärakanne muudelt maadelt", roundToDecimals(Wnbmodel.getN13()), roundToDecimals(Wnbmodel.getN13() * 100 / Wnbmodel.getN21()), roundToDecimals(Wnbmodel.getP13()), roundToDecimals(Wnbmodel.getP13() * 100 / Wnbmodel.getP21())},
            {"Sadenemine järvede pinnale", roundToDecimals(Wnbmodel.getN14()), roundToDecimals(Wnbmodel.getN14() * 100 / Wnbmodel.getN21()), roundToDecimals(Wnbmodel.getP14()), roundToDecimals(Wnbmodel.getP14() * 100 / Wnbmodel.getP21())},
            {"RP (s.h. otsevool ja sademevesi)", roundToDecimals(Wnbmodel.getN15()), roundToDecimals(Wnbmodel.getN15() * 100 / Wnbmodel.getN21()), roundToDecimals(Wnbmodel.getP15()), roundToDecimals(Wnbmodel.getP15() * 100 / Wnbmodel.getP21())},
            {"Omapuhastid", roundToDecimals(Wnbmodel.getN16()), roundToDecimals(Wnbmodel.getN16() * 100 / Wnbmodel.getN21()), roundToDecimals(Wnbmodel.getP16()), roundToDecimals(Wnbmodel.getP16() * 100 / Wnbmodel.getP21())},
            {"Lüpsikojad", roundToDecimals(Wnbmodel.getN17()), roundToDecimals(Wnbmodel.getN17() * 100 / Wnbmodel.getN21()), roundToDecimals(Wnbmodel.getP17()), roundToDecimals(Wnbmodel.getP17() * 100 / Wnbmodel.getP21())},
            {"Sõnnikuhoidlad", roundToDecimals(Wnbmodel.getN18()), roundToDecimals(Wnbmodel.getN18() * 100 / Wnbmodel.getN21()), roundToDecimals(Wnbmodel.getP18()), roundToDecimals(Wnbmodel.getP18() * 100 / Wnbmodel.getP21())},
            {"Kalakasvatus", roundToDecimals(Wnbmodel.getN19()), roundToDecimals(Wnbmodel.getN19() * 100 / Wnbmodel.getN21()), roundToDecimals(Wnbmodel.getP19()), roundToDecimals(Wnbmodel.getP19() * 100 / Wnbmodel.getP21())},
            {"Tööstuse otseheide suublasse", roundToDecimals(Wnbmodel.getN20()), roundToDecimals(Wnbmodel.getN20() * 100 / Wnbmodel.getN21()) , roundToDecimals(Wnbmodel.getP20()), roundToDecimals(Wnbmodel.getP20() * 100 / Wnbmodel.getP21())},
            {"Kokku", roundToDecimals(Wnbmodel.getN21()), "100", roundToDecimals(Wnbmodel.getP21()),"100"},
        };
        String[] column = {" ","Lämmastik"," ","Fosfor"," "};
        JTable table = new JTable(values, column);
        table.setEnabled(false);
        return table;
    }
}
