package Util;

import java.text.Format;

/**
 * Created by IntelliJ IDEA.
 * User: Robert
 * Date: 29.08.11
 * Time: 7:50
 * To change this template use File | Settings | File Templates.
 */
public class UsefulMethods {

    public static Boolean bIsNumeric(String text){
        for(char c : text.toCharArray()){
            if(!Character.isDigit(c)){
                if(c != ',' || c != '.'){
                    return false;
                }
            }
        }
        return true;
    }
}
