package Wennerblom;



/**
 * WennerblomModel.java holds the fields and formulas for the model.
 * @author Hannes Kinks
 * @author Robert Kullamaa
 */

public class WennerblomModel  {

    private String B2 = "Kohila, veekogum_1"; //nimi
    private int B3 = 2011;    //aasta
    private double B4 = 399; //Koguvalgla  (km2)
    private double B5 = 4.63; //Äravool, aastakeskmine väärtus (m3/s)
    private double B6; //Äravool (mm/a)
    private double B7 = 200; //Metsamaa pindala (km2)
    private double B8 = 10; //Viljakaid metsamuldi kl. I (%)
    private double B9 = 29; //Viljakaid metsamuldi kl. II (%)
    private double B10 = 0.85; //Lõppraiet aastas (%)
    private double B11 = 0.1; //Kuivendatud metsa aastas (% metsaalast)
    private double B12 = 0; //Väetatud metsa aastas (% metsaalast)
    private double B13 = 42.5; //Soid / märgalasid (km2)
    private double B14 = 0; //Järvi (km2)
    private double B15 = 152.2; //Põllu- ja karjamaid (km2)
    private double B16; //Muid alasid (km2)
    private double B17 = 42.2; //Talikultuuride all (% põllu- ja karjamaast)
    private double B18 = 75; //N-ärakande vähenemine tänu "rohelisele maale"(%)
    private double B19; //jura kuni B34-ni
    private double B20;
    private double B21;
    private double B22;
    private double B23;
    private double B24;
    private double B25;
    private double B26;
    private double B27;
    private double B28;
    private double B29;
    private double B30;
    private double B31;
    private double B32;
    private double B33;
    private double B34 = 40;
    private double B35 = 5435;
    private double B36 = 0;
    private double B37 = 30;
    private double B38 = 60;
    private double B39 = 10;
    private double B40;
    private double B41 = 10;
    private double B42 = 0;
    private double B43 = 10;
    private double B44 = 50;
    private double B45 = 25;
    private double B46;
    private double B47 = 1;
    private double B48 = 1;
    private double B49 = 0;
    private double B50 = 0;
    private double B51 = 0;
    private double B52 = 0;
    private double B53 = 0;
    private double B54 = 0;
    private double B55 = 0;
    private double B56 = 1;
    private double B57 = 15;
    private double B58 = 20;
    private double B59;
    private double B60 = 0.01;
    private double B61 = 0.01;
    private double B62 = 148.5;
    private double B63 = 1.438;
    private double B64 = 0;
    private double B65 = 0;
    private double B66 = 1000;
    //taustandmed (B67)
    private double B68 = 0;
    private double B69 = 0.3;
    private double B70 = 7.6;
    private double B71 = 100;
    private double B72 = 3500;
    private double B73 = 15.4;

    public String getB2() {
        return B2;
    }

    public int getB3() {
        return B3;
    }

    public double getB4() {
        return B4;
    }

    public double getB5() {
        return B5;
    }

    public double getB6() {
        return ((getB5()*60*60*24*365)/(getB4()*1000000))*1000;
    }

    public double getB7() {
        return B7;
    }

    public double getB8() {
        return B8;
    }

    public double getB9() {
        return B9;
    }

    public double getB10() {
        return B10;
    }

    public double getB11() {
        return B11;
    }

    public double getB12() {
        return B12;
    }

    public double getB13() {
        return B13;
    }

    public double getB14() {
        return B14;
    }

    public double getB15() {
        return B15;
    }

    public double getB16() {
        return getB4() - (getB15() + getB14() + getB13() + getB7());
    }

    public double getB17() {
        return B17;
    }

    public double getB18() {
        return B18;
    }

    public double getB19() {
        return B19;
    }

    public double getB20() {
        return B20;
    }

    public double getB21() {
        return B21;
    }

    public double getB22() {
        return B22;
    }

    public double getB23() {
        return B23;
    }

    public double getB24() {
        return B24;
    }

    public double getB25() {
        return B25;
    }

    public double getB26() {
        return B26;
    }

    public double getB27() {
        return B27;
    }

    public double getB28() {
        return B28;
    }

    public double getB29() {
        return B29;
    }

    public double getB30() {
        return B30;
    }

    public double getB31() {
        return B31;
    }

    public double getB32() {
        return B32;
    }

    public double getB33() {
        return B33;
    }

    public double getB34() {
        return B34;
    }

    public double getB35() {
        return B35;
    }

    public double getB36() {
        return B36;
    }

    public double getB37() {
        return B37;
    }

    public double getB38() {
        return B38;
    }

    public double getB39() {
        return B39;
    }

    public double getB40() {
        return 100 - ( getB39() + getB38() + getB37());
    }

    public double getB41() {
        return B41;
    }

    public double getB42() {
        return B42;
    }

    public double getB43() {
        return B43;
    }

    public double getB44() {
        return B44;
    }

    public double getB45() {
        return getB44() / 2;
    }

    public double getB46() {
        return 100 - (getB44() + getB45());
    }

    public double getB47() {
        return B47;
    }

    public double getB48() {
        return B48;
    }

    public double getB49() {
        return B49;
    }

    public double getB50() {
        return B50;
    }

    public double getB51() {
        return B51;
    }

    public double getB52() {
        return B52;
    }

    public double getB53() {
        return B53;
    }

    public double getB54() {
        return B54;
    }

    public double getB55() {
        return B55;
    }

    public double getB56() {
        return B56;
    }

    public double getB57() {
        return B57;
    }

    public double getB58() {
        return B58;
    }

    public double getB59() {
        return B59;
    }

    public double getB60() {
        return B60;
    }

    public double getB61() {
        return B61;
    }

    public double getB62() {
        return B62;
    }

    public double getB63() {
        return B63;
    }

    public double getB64() {
        return B64;
    }

    public double getB65() {
        return B65;
    }

    public double getB66() {
        return B66;
    }

    public double getB68() {
        return B68;
    }

    public double getB69() {
        return B69;
    }

    public double getB70() {
        return B70;
    }

    public double getB71() {
        return B71;
    }

    public double getB72() {
        return B72;
    }

    public double getB73() {
        return B73;
    }

    public void setB2(String b2) {
        B2 = b2;
    }

    public void setB3(int b3) {
        B3 = b3;
    }

    public void setB4(double b4) {
        B4 = b4;
    }

    public void setB5(double b5) {
        B5 = b5;
    }

    public void setB6(double b6) {
        B6 = b6;
    }

    public void setB7(double b7) {
        B7 = b7;
    }

    public void setB8(double b8) {
        B8 = b8;
    }

    public void setB9(double b9) {
        B9 = b9;
    }

    public void setB10(double b10) {
        B10 = b10;
    }

    public void setB11(double b11) {
        B11 = b11;
    }

    public void setB12(double b12) {
        B12 = b12;
    }

    public void setB13(double b13) {
        B13 = b13;
    }

    public void setB14(double b14) {
        B14 = b14;
    }

    public void setB15(double b15) {
        B15 = b15;
    }

    public void setB16(double b16) {
        B16 = b16;
    }

    public void setB17(double b17) {
        B17 = b17;
    }

    public void setB18(double b18) {
        B18 = b18;
    }

    public void setB19(double b19) {
        B19 = b19;
    }

    public void setB20(double b20) {
        B20 = b20;
    }

    public void setB21(double b21) {
        B21 = b21;
    }

    public void setB22(double b22) {
        B22 = b22;
    }

    public void setB23(double b23) {
        B23 = b23;
    }

    public void setB24(double b24) {
        B24 = b24;
    }

    public void setB25(double b25) {
        B25 = b25;
    }

    public void setB26(double b26) {
        B26 = b26;
    }

    public void setB27(double b27) {
        B27 = b27;
    }

    public void setB28(double b28) {
        B28 = b28;
    }

    public void setB29(double b29) {
        B29 = b29;
    }

    public void setB30(double b30) {
        B30 = b30;
    }

    public void setB31(double b31) {
        B31 = b31;
    }

    public void setB32(double b32) {
        B32 = b32;
    }

    public void setB33(double b33) {
        B33 = b33;
    }

    public void setB34(double b34) {
        B34 = b34;
    }

    public void setB35(double b35) {
        B35 = b35;
    }

    public void setB36(double b36) {
        B36 = b36;
    }

    public void setB37(double b37) {
        B37 = b37;
    }

    public void setB38(double b38) {
        B38 = b38;
    }

    public void setB39(double b39) {
        B39 = b39;
    }

    public void setB40(double b40) {
        B40 = b40;
    }

    public void setB41(double b41) {
        B41 = b41;
    }

    public void setB42(double b42) {
        B42 = b42;
    }

    public void setB43(double b43) {
        B43 = b43;
    }

    public void setB44(double b44) {
        B44 = b44;
    }

    public void setB45(double b45) {
        B45 = b45;
    }

    public void setB46(double b46) {
        B46 = b46;
    }

    public void setB47(double b47) {
        B47 = b47;
    }

    public void setB48(double b48) {
        B48 = b48;
    }

    public void setB49(double b49) {
        B49 = b49;
    }

    public void setB50(double b50) {
        B50 = b50;
    }

    public void setB51(double b51) {
        B51 = b51;
    }

    public void setB52(double b52) {
        B52 = b52;
    }

    public void setB53(double b53) {
        B53 = b53;
    }

    public void setB54(double b54) {
        B54 = b54;
    }

    public void setB55(double b55) {
        B55 = b55;
    }

    public void setB56(double b56) {
        B56 = b56;
    }

    public void setB57(double b57) {
        B57 = b57;
    }

    public void setB58(double b58) {
        B58 = b58;
    }

    public void setB59(double b59) {
        B59 = b59;
    }

    public void setB60(double b60) {
        B60 = b60;
    }

    public void setB61(double b61) {
        B61 = b61;
    }

    public void setB62(double b62) {
        B62 = b62;
    }

    public void setB63(double b63) {
        B63 = b63;
    }

    public void setB64(double b64) {
        B64 = b64;
    }

    public void setB65(double b65) {
        B65 = b65;
    }

    public void setB66(double b66) {
        B66 = b66;
    }

    public void setB68(double b68) {
        B68 = b68;
    }

    public void setB69(double b69) {
        B69 = b69;
    }

    public void setB70(double b70) {
        B70 = b70;
    }

    public void setB71(double b71) {
        B71 = b71;
    }

    public void setB72(double b72) {
        B72 = b72;
    }

    public void setB73(double b73) {
        B73 = b73;
    }

    private double H52=0.4;
    private double F25=0.0;
    private double G12=0.0;
    private double G11=0.15;
    private double F21=0.0;
    private double F22=0.0;
    private double F26=0.0;
    private double G36=0.0;
    private double G37=0.0;
    private double G40=0.0;
    private double G41=0.0;
    private double F57=120;
    private double L15=12;
    private double K15=75;
    private double E62=1500;
    private double D62=0;
    private double E64=2600;
    private double E66=3000;
    private double E71=3000;
    private double E72=5000;
    private double E74=5000;
    private double E68=400;
    private double E70=900;
    private double E69=900;
    private double F62=40;
    private double F64=17;
    private double F66=52;
    private double F71=17;
    private double F72=40;
    private double F74=17;
    private double E8=0.03945;
    private double F63=40;
    private double F65=17;
    private double F67=52;
    private double F68=40;
    private double F69=10;
    private double F70=52;
    private double F73=40;
    private double F75=17;
    private double E58=8;
    private double E33=0.03945;
    private double L18=2.1/1000*365;
    private double K19=1*365/1000;
    private double L19=0.6*365/1000;
    private double K5=0.1/1000*365;
    private double L5=1.11/1000*365;
    private double L6=0.11/1000*365;


    private double getE63() {
        return 0.5*E62;
    }
    private double getE65() {
        double value = 0.5*E64;
        return value;
    }
    private double getE67() {
        double value = 0.5*E66;
        return value;
    }
    private double getE73() {
        double value =0.25*E72;
        return value;
    }
    private double getE75() {
        double value = 0.25*E74;
        return value;
    }
    private double getG45() {
        double value = 1.3*(0.06121*getB6()*0.55+0.7974);
        return value;
    }

    private double getE78() {
        double value = ((E62*(D62-getB21()))+(E64*(getB22()-getB23()))+(E66*(getB24()-getB25()))+(E71*getB29())+(E72*(getB30()-getB31()))+(E74*(getB32()-getB33())))/1000;
        return value;
    }
    private double getE79() {
        double value = ((getE63()*getB21())+(getE65()*getB23())+(getE67()*getB25())+(E68*getB26())+(E69*getB27())+(E70*getB28())+(getE73()*getB31())+(getE75()*getB33()))/1000;
        return value;
    }
    private double getE80() {
        double value = getE78() + getE79();
        return value;
    }
    private double getF78() {
        double value = (F62 * (D62 - getB21())) + (F64 * (getB22() - getB23())) + (F66 * (getB24() - getB25())) + (F71 * getB29()) + (F72 * (getB30() - getB31())) + (F74 * (getB32() - getB33()));
        return value;
    }
    private double getF79() {
        double value = (F63 * getB21()) + (F65 * getB23()) + (F67 * getB25()) + (F68 * getB26()) + (F69 * getB27()) + (F70 * getB28()) + (F73 * getB31()) + (F75 * getB33());
        return value;
    }
    private double getF80() {
        double value = getF78() + getF79();
        return value;
    }

    private double getE10() {
        double value = 0.00279 * getB6() + 0.00893;
        return value;
    }
    private double getE9() {
        double value = 0.000445 * getB6() + 0.00551;
        return value;
    }
    private double getE11() {
        double value = E8 + getE9() + getE10();
        return value;
    }
    private double getF11() {
        double value = getE11() - 0.15;
        return value;
    }

    private double getG15() {
        double value = 8 * getE9();
        return value;
    }

    private double getE12() {
        double value = 0.00014 * getB6() - 0.00383;
        return value;
    }

    private double getE21() {
        double value = 4 * getE11();
        return value;
    }

    private double getG18() {
        double value = 4 * getE9();
        return value;
    }

    private double getE25() {
        double value = 2 * getE11();
        return value;
    }

    private double getE22() {
        double value = 2 * getE12();
        return value;
    }

    private double getE34() {
        double value = 0.000445 * getB6() + 0.00551;
        return value;
    }
    private double getE35() {
        double value = 2 * getE10();
        return value;
    }
    private double getE36() {
        double value = E33 + getE34() + getE35();
        return value;
    }

    private double getE26() {
        double value = 2 * getE12();
        return value;
    }

    private double getE37() {
        double value = 2 * getE12();
        return value;
    }

    private double getG47() {
        double value = getF11() + getE9();
        return value;
    }

    private double getG48() {
        double value = G11 + getG15();
        return value;
    }

    private double getG57() {
        double value = getB66() - F57;
        return value;
    }

    private double getF58() {
        double value = 0.33 * E58;
        return value;
    }

    private double getG58() {
        double value = E58 - getF58();
        return value;
    }

    private double getK18() {
        double value = 13.5 / 1000 * 365;
        return value;
    }

    private double getK29() {
        double value = (100 - B58) / 100 * getK18();
        return value;
    }

    private double getL29() {
        double value = (100 - getB57()) / 100 * L18;
        return value;
    }

    private double getK20() {
        double value = (100 - getB43()) / 100 * getK18();
        return value;
    }
    private double getK21() {
        double value = getB43() / 100 * K19;
        return value;
    }

    private double getK24() {
        double value = getB46() / 100 * (getK20() + getK21()) * 0.75;
        return value;
    }

    private double getK23() {
        double value = getB45() / 100 * (getK20() + getK21()) * 0.7;
        return value;
    }

    private double getG49() {
        double value = getG45() - getG47() - getG48();
        return value;
    }
    private double getK22() {
        double value = B44 / 100 * (getK20() + getK21()) * 0.85;
        return value;
    }
    private double getG50() {
        double value = (100 - B18) / 100 * getG49();
        return value;
    }
    private double getK25() {
        double value = getK24() + getK23() + getK22();
        return value;
    }
    private double getL20() {
        double value = (100-B43)/100*L18;
        return value;
    }
    private double getL21() {
        double value = getB43()/100*L19;
        return value;
    }
    private double getL24() {
        double value = getB46() / 100 * (getL20() + getL21()) * 0.5;
        return value;
    }
    private double getL23() {
        double value = getB45() / 100 * (getL20() + getL21()) * 0.05;
        return value;
    }
    private double getL22() {
        double value = getB44() / 100 * (getL20() + getL21()) * 0.85;
        return value;
    }
    private double getL25() {
        double value = getL24() + getL23() + getL22();
        return value;
    }
    private double getK8() {
        double value = (100 - getB36()) / 100 * K5;
        return value;
    }

    private double getK7() {
        double value = getB36() / 100 * K5;
        return value;
    }
    private double getK12() {
        double value = getB40() / 100 * (getK8() + getK7());
        return value;
    }
    private double getK11() {
        double value = getB39() / 100 * (getK8() + getK7()) * 0;
        return value;
    }
    private double getK10() {
        double value = getB38() / 100 * (getK8() + getK7()) * 0.7;
        return value;
    }
    private double getK9() {
        double value = getB37() / 100 * (getK7() + getK8()) * 0.85;
        return value;
    }
    private double getK13() {
        double value = getK12() + getK11() + getK10() + getK9();
        return value;
    }
    private double getL8() {
        double value = (100 - getB36()) / 100 * L5;
        return value;
    }
    private double getL7() {
        double value = getB36() / 100 * L6;
        return value;
    }
    private double getL12() {
        double value = getB40() / 100 * (getL8() + getL7());
        return value;
    }
    private double getL11() {
        double value = getB39()/100*(getL8()+getL7())*0;
        return value;
    }
    private double getL10() {
        double value = getB38()/100*(getL8()+getL7())*0.7;
        return value;
    }
    private double getL9() {
        double value = getB37()/100*(getL7()+getL8())*0.85;
        return value;
    }
    private double getL13() {
        double value = getL12() + getL11() + getL10() + getL9();
        return value;
    }
    private double getL16() {
        double value = getB41() / 100 * L15 * 0.3;
        return value;
    }
    private double getK16() {
        double value = getB41()/100*K15;
        return value;
    }
    private double getG53() {
        double value = getE12();
        return value;
    }

    private double getE29() {
        double value = 2*getE11();
        return value;
    }

    private double getG54() {
        double value = H52-getG53();
        return value;
    }


    //Tabel 1
    public double getN9() {
        double value = 0.0;
        if(getE80() == 0){
            double var1 = getB17();
            double var2 = getB15();
            double var3 = getG47();
            double var4 = getG48();
            double var5 = getG49();
            double var6 = getG50();
            //((100-B17)/100*B15*100*(H47+H48+G49)+(B17/100*B15*100*(G50+H47+H48)))/1000
            value = (((100 - getB17()) / 100 * getB15() * 100 * (getG47() + getG48() + getG49()) + (getB17() / 100 * getB15() * 100 * (getG50() + getG47() + getG48()))) / 1000);
        } else {
            value = getE80();
        }
        return value;
    }

    public double getP9() {
        if(getF80() == 0){
            return getB15()*100*H52;
        } else {
            return getF80();
        }
    }

    public double getN10() {
        double value = (((getB7() * 100 * (getF11() + G11)) + ((getB8() / 100 * getB7() * 100) * (getE9() + getG15())) + ((getB9() / 100 * getB7() * 100) * (getE9() + getG18()))) / 1000);
        return value;
    }

    public double getP10() {
        return getB7() * 100 * (getE12() + G12);
    }

    public double getN11() {
        return ((((getB10() / 100 * getB7() * 100 * (getE21() + F21)) * 8) + ((getB11() / 100 * getB7() * 100 * (F25 + getE25())) * 5) + ((getB12() / 100 * getB7() * 100 * (F25 + getE25())) * 3)) / 1000);
    }

    public double getP11() {
        return (((getB10()/100*getB7()*100*(F22+getE22()))*3)+((getB11()/100*getB7()*100*(F26+getE26()))*1));
    }

    public double getN12() {
        return (getB13()*100*(getE36()+G36))/1000;
    }

    public double getP12() {
        return getB13()*100*(getE37()+G37);
    }

    public double getN13() {
        return (getB16()*100*(getE11()+G40))/1000;
    }

    public double getP13() {
        return getB16() * 100 * (getE12() + G41);
    }

    public double getN14() {
        return (getB14() * (F57 + getG57()))/1000;
    }

    public double getP14() {
        return getB14() * (getF58() + getG58());
    }

    public double getN15() {
        return (getB47()+getB49()+getB51()+getB53()+(getK29()/1000*getB56()))+(getB61()/100*(getB47()+getB49()+getB51()+getB53()+(getK29()/1000*getB56())));
    }

    public double getP15() {
        return (getB48()+getB50()+getB52()+getB54()+(getL29() * getB56()))+(getB60()/100*(getB48()+getB50()+getB52()+getB52()+(getL29() * getB56())));
    }

    public double getN16() {
        return getK25() / 1000 * getB42();
    }

    public double getP16() {
        return getL25() * getB42();
    }

    public double getN17() {
        return getK13() / 1000 * getB35();
    }

    public double getP17() {
        return getL13() * getB35();
    }

    public double getN18() {
        return getK16() / 1000 * getB34();
    }

    public double getP18() {
        return getL16() * getB34();
    }

    public double getN19() {
        return getB65()*78/1000;
    }

    public double getP19() {
        return getB64();
    }

    public double getN20() {
        return getB63();
    }

    public double getP20() {
        return getB62();
    }

    public double getN21() {
        return getN9() + getN10() + getN11() + getN12() + getN13() + getN14() + getN15() + getN16() + getN17() + getN18() + getN19() + getN20();
    }

    public double getP21() {
        return getP9() + getP10() + getP11() + getP12() + getP13() + getP14() + getP15() + getP16() + getP17() + getP18() + getP19() + getP20();
    }

    //Tabel 2
    //Looduslik ärakanne
    public double getN30() {
        return (getB7() * 100 * getF11() + getB8() / 100 * getB7() * 100 * getE9() + getB9() / 100 * getB7() * 100 * getE9()) / 1000;
    }

    public double getP30() {
        return getB7() * 100 * getE12();
    }

    public double getN31() {
        return (getB15()*100*getG47())/1000;
    }

    public double getP31() {
        return getB15()*100*getG53();
    }

    public double getN32() {
        return (getB13()*100*getE36())/1000;
    }

    public double getP32() {
        return getB13()*100*getE37();
    }

    public double getN33() {
        return (getB16()*100*getE11())/1000;
    }

    public double getP33() {
        return getB16() * 100 * getE12();
    }

    public double getN34() {
        return (getB14()*F57)/1000;
    }

    public double getP34() {
        return getB14() * getF58();
    }

    public double getN36() {
        return getN30() + getN31() + getN32() + getN33() + getN34();
    }

    public double getP36() {
        return getP30() + getP31() + getP32() + getP33() + getP34();
    }

    //Inimlähtene ärakanne

    public double getN40() {
        return (getB14() * getG57()) / 1000;
    }

    public double getP40() {
        return getB14() * getG58();
    }

    public double getN41() {
        return (getB7()*100*G11+getB8()/100*getB7()*100*getG15()+getB9()/100*getB7()*100*getG18())/1000;
    }

    public double getP41() {
        return 0;
    }

    public double getN42() {
        return (getB15()*100*(G11+getG15()))/1000;
    }

    public double getP42() {
        return 0;
    }

    public double getN43() {
        return getB10()/100*getB7()*100*getE21()*8/1000;
    }

    public double getP43() {
        return getB10()/100*getB7()*getE22()*100*3;
    }

    public double getN44() {
        return getB11()/100*getB7()*getE25()*5*100/1000;
    }

    public double getP44() {
        return getB11() / 100 * getB7() * 100 * getE26();
    }

    public double getN45() {
        return getB12() / 100 * getB7() * getE29() * 3 * 100 / 1000;
    }

    public double getP45() {
        return 0;
    }

    public double getN46() {
        return getF80() == 0 ? (100-getB17())/100*getB15()*getG49()*100/1000+getB17()/100*getB15() * getG50() * 100 / 1000 : getE80()-getN31()-getN42();
    }

    public double getP46() {
        return getF80() == 0 ? getB15()*getG54()*100 : getF80()-getP31();
    }

    public double getN47() {
        return getB35() * getK13() / 1000;
    }

    public double getP47() {
        return getB35() * getL13();
    }

    public double getN48() {
        return getN18();
    }

    public double getP48() {
        return getP18();
    }

    public double getN49() {
        return getN16();
    }

    public double getP49() {
        return getP16();
    }

    public double getN50() {
        return getN15()-(getB61()/100*(getB47()+getB49()+getB51()+getB53()+(getK29() / 1000 * getB56())));
    }

    public double getP50() {
        return getP15()-(getB60()/100*(getB48()+getB50()+getB52()+getB54()+(getL29() * getB56())));
    }

    public double getN51() {
        return getB61() / 100 * (getB47() + getB49() + getB51() + getB53() + (getK29() / 1000 * getB56()));
    }

    public double getP51() {
        return getB60()/100*(getB48()+getB50()+getB52()+getB54()+(getL29() * getB56()));
    }

    public double getN52() {
        return getN20();
    }

    public double getP52() {
        return getP20();
    }

    public double getN53() {
        return getN19();
    }

    public double getP53() {
        return getP19();
    }

    public double getN55() {
        return getN40() + getN41() + getN42() + getN43() + getN44() + getN45() + getN46() + getN47() + getN48()
                 + getN49() + getN50() + getN51() + getN52() + getN53();
    }

    public double getP55() {
        return getP40() + getP41() + getP42() + getP43() + getP44() + getP45() + getP46() + getP47() + getP48()
                 + getP49() + getP50() + getP51() + getP52() + getP53();
    }

    public double getN58() {
        return getN36() + getN55();
    }

    public double getP58() {
        return getP36() + getP55();
    }

}



