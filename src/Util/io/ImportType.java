package Util.io;

import javax.swing.*;
import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Robert
 * Date: 5.02.13
 * Time: 13:35
 * To change this template use File | Settings | File Templates.
 */
public enum ImportType {

    /**
     * Error
     */
    UNKNOWN,

    /**
     * Microsoft Excel worksheet
     */
    EXCEL,

    /**
     * XML Document
     */
    XML;


    /**
     *
     * @param file
     * @return
     */
    public static ImportType getTypeFromFile(File file) {
        String fileMimeType = new JFileChooser().getTypeDescription(file);

        if (fileMimeType.contains("Microsoft Excel")) {
            return EXCEL;
        } else if (fileMimeType.contains("XML")) {
            return XML;
        } else {
            return UNKNOWN;
        }
    }

}
