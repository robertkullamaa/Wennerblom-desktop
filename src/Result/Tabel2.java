package Result;

import Wennerblom.WennerblomModel;

import javax.swing.*;

/**
 * Created by IntelliJ IDEA.
 * User: Robert
 * Date: 17.09.11
 * Time: 17:45
 * To change this template use File | Settings | File Templates.
 */
public class Tabel2 extends JPanel {

    WennerblomModel Wnbmodel;

    public Tabel2(WennerblomModel model){
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        Wnbmodel=model;
        add(new JLabel("Tabel 2. Lämmastiku- ja fosforiärakanne järvedesse ja vooluveekogudesse"));
        add(new JLabel("reostusallikate ja põhjuste kaupa (looduslik ja inimlähtene)"));
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
            {"LOODUSLIK ÄRAKANNE", "", "", "", ""},
            {"Metsad", roundToDecimals(Wnbmodel.getN30()), roundToDecimals(Wnbmodel.getN30() * 100 / Wnbmodel.getN36()), roundToDecimals(Wnbmodel.getP30()), roundToDecimals(Wnbmodel.getP30() * 100 / Wnbmodel.getP36())},
            {"Põllumaa", roundToDecimals(Wnbmodel.getN31()), roundToDecimals(Wnbmodel.getN31() * 100 / Wnbmodel.getN36()), roundToDecimals(Wnbmodel.getP31()), roundToDecimals(Wnbmodel.getP31() * 100 / Wnbmodel.getP36())},
            {"Märgalad", roundToDecimals(Wnbmodel.getN32()), roundToDecimals(Wnbmodel.getN32() * 100 / Wnbmodel.getN36()), roundToDecimals(Wnbmodel.getP32()), roundToDecimals(Wnbmodel.getP32() * 100 / Wnbmodel.getP36())},
            {"Muu maa", roundToDecimals(Wnbmodel.getN33()), roundToDecimals(Wnbmodel.getN33() * 100 / Wnbmodel.getN36()), roundToDecimals(Wnbmodel.getP33()), roundToDecimals(Wnbmodel.getP33() * 100 / Wnbmodel.getP36())},
            {"Sadenemine järvede pinnale", roundToDecimals(Wnbmodel.getN34()), roundToDecimals(Wnbmodel.getN34() * 100 / Wnbmodel.getN36()), roundToDecimals(Wnbmodel.getP34()), roundToDecimals(Wnbmodel.getP34() * 100 / Wnbmodel.getP36())},
            {"","","","",""},
            {"Looduslik ärakanne KOKKU", roundToDecimals(Wnbmodel.getN36()),"100", roundToDecimals(Wnbmodel.getP36()),"100"},
            {"osa koguärakandest (%)","", roundToDecimals(Wnbmodel.getN36() * 100 / Wnbmodel.getN58()),"", roundToDecimals(Wnbmodel.getP36() * 100 / Wnbmodel.getP58())},
            {"","","","",""},
            {"INIMLÄHTENE ÄRAKANNE","","","",""},
            {"Järved - sadenemine õhust", roundToDecimals(Wnbmodel.getN40()), roundToDecimals(Wnbmodel.getN40() * 100 / Wnbmodel.getN55()), roundToDecimals(Wnbmodel.getP40()), roundToDecimals(Wnbmodel.getP40() * 100 / Wnbmodel.getP55())},
            {"Metsad tänu õhusaastele", roundToDecimals(Wnbmodel.getN41()), roundToDecimals(Wnbmodel.getN41() * 100 / Wnbmodel.getN55()), roundToDecimals(Wnbmodel.getP41()), roundToDecimals(Wnbmodel.getP41() * 100 / Wnbmodel.getP55())},
            {"Põllumaa tänu õhusaastele", roundToDecimals(Wnbmodel.getN42()), roundToDecimals(Wnbmodel.getN42() * 100 / Wnbmodel.getN55()), roundToDecimals(Wnbmodel.getP42()), roundToDecimals(Wnbmodel.getP42() * 100 / Wnbmodel.getP55())},
            {"Metsandus - lageraie", roundToDecimals(Wnbmodel.getN43()), roundToDecimals(Wnbmodel.getN43() * 100 / Wnbmodel.getN55()), roundToDecimals(Wnbmodel.getP43()), roundToDecimals(Wnbmodel.getP43() * 100 / Wnbmodel.getP55())},
            {"Metsandus - kuivendamine", roundToDecimals(Wnbmodel.getN44()), roundToDecimals(Wnbmodel.getN44() * 100 / Wnbmodel.getN55()), roundToDecimals(Wnbmodel.getP44()), roundToDecimals(Wnbmodel.getP44() * 100 / Wnbmodel.getP55())},
            {"Metsandus - väetamine", roundToDecimals(Wnbmodel.getN45()), roundToDecimals(Wnbmodel.getN45() * 100 / Wnbmodel.getN55()), roundToDecimals(Wnbmodel.getP45()), roundToDecimals(Wnbmodel.getP45() * 100 / Wnbmodel.getP55())},
            {"Põllumajandus", roundToDecimals(Wnbmodel.getN46()), roundToDecimals(Wnbmodel.getN46() * 100 / Wnbmodel.getN55()), roundToDecimals(Wnbmodel.getP46()), roundToDecimals(Wnbmodel.getP46() * 100 / Wnbmodel.getP55())},
            {"Lüpsikojad", roundToDecimals(Wnbmodel.getN47()), roundToDecimals(Wnbmodel.getN47() * 100 / Wnbmodel.getN55()), roundToDecimals(Wnbmodel.getP47()), roundToDecimals(Wnbmodel.getP47() * 100 / Wnbmodel.getP55())},
            {"Sõnnikuhoidlad", roundToDecimals(Wnbmodel.getN48()), roundToDecimals(Wnbmodel.getN48() * 100 / Wnbmodel.getN55()), roundToDecimals(Wnbmodel.getP48()), roundToDecimals(Wnbmodel.getP48() * 100 / Wnbmodel.getP55())},
            {"Omapuhastid", roundToDecimals(Wnbmodel.getN49()), roundToDecimals(Wnbmodel.getN49() * 100 / Wnbmodel.getN55()),roundToDecimals(Wnbmodel.getP49()), roundToDecimals(Wnbmodel.getP49() * 100 / Wnbmodel.getP55())},
            {"Reoveepuhastid (v.a. otsevool)", roundToDecimals(Wnbmodel.getN50()), roundToDecimals(Wnbmodel.getN50() * 100 / Wnbmodel.getN55()), roundToDecimals(Wnbmodel.getP50()), roundToDecimals(Wnbmodel.getP50() * 100 / Wnbmodel.getP55())},
            {"Otsevoolu- ja sademevesi", roundToDecimals(Wnbmodel.getN51()), roundToDecimals(Wnbmodel.getN51() * 100 / Wnbmodel.getN55()), roundToDecimals(Wnbmodel.getP51()), roundToDecimals(Wnbmodel.getP51() * 100 / Wnbmodel.getP55())},
            {"Tööstuse otseheide suublasse", roundToDecimals(Wnbmodel.getN52()), roundToDecimals(Wnbmodel.getN52() * 100 / Wnbmodel.getN55()), roundToDecimals(Wnbmodel.getP52()), roundToDecimals(Wnbmodel.getP52() * 100 / Wnbmodel.getP55())},
            {"Kalakasvatus", roundToDecimals(Wnbmodel.getN53()), roundToDecimals(Wnbmodel.getN53() * 100 / Wnbmodel.getN55()), roundToDecimals(Wnbmodel.getP53()), roundToDecimals(Wnbmodel.getP53() * 100 / Wnbmodel.getP55())},
            {"","","","",""},
            {"Inimlähtene ärakanne KOKKU", roundToDecimals(Wnbmodel.getN55()),"100", roundToDecimals(Wnbmodel.getP55()),"100"},
            {"osa koguärakandest","", roundToDecimals(Wnbmodel.getN55() * 100 / Wnbmodel.getN58()),"", roundToDecimals(Wnbmodel.getP55() * 100 / Wnbmodel.getP58())},
            {"","","","",""},
            {"KOKKU", roundToDecimals(Wnbmodel.getN36() + Wnbmodel.getN55()),"100", roundToDecimals(Wnbmodel.getP36() + Wnbmodel.getP55()),"100"},
        };
        String[] column = {" ","Lämmastik"," ","Fosfor"," "};
        JTable table = new JTable(values, column);
        table.setEnabled(false);
        return table;
    }
}
