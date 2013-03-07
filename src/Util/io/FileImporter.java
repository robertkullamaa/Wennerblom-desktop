package Util.io;

import Wennerblom.WennerblomModel;
import jxl.Sheet;
import jxl.Workbook;

import javax.swing.*;
import java.io.File;

public class FileImporter {

    private File sourceFile;

    private ImportType fileType;

    /**
     *
     * @param file
     * @param type
     */
    public FileImporter(File file, ImportType type) {
        sourceFile = file;
        fileType = type;
    }

    public FileImporter() {
        sourceFile = chooseFile();
        fileType = ImportType.getTypeFromFile(sourceFile);
    }

    private File chooseFile() {
        JFileChooser fileChooser = new JFileChooser();
        int returnVal = fileChooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile();
        }
        return null;
    }


    public WennerblomModel getModelFromFile() {
        if (sourceFile != null) {
            WennerblomModel model = new WennerblomModel();
            /*switch (fileType) {
                case EXCEL:
                    break;
                case XML:
                    break;
                case UNKNOWN:
                    break;
            }*/

            Workbook w;
            try {
                w = Workbook.getWorkbook(sourceFile);
                // Get the first sheet
                Sheet sheet = w.getSheet(2);
                String tmp = "";

                //NB! cell(col, row)

                //NIMI B2
                model.setB2(String.valueOf(sheet.getCell(1, 1).getContents()));

                // AASTA B3  ??
                //model.setB3(Integer.parseInt(sheet.getCell(?, ?).getContents()));

                // KOGUVALGLA PINDALA B4
                tmp = sheet.getCell(3, 22).getContents();
                model.setB4(getDoubleFromString(tmp));

                //ÄRAVOOL AASTAKESKMINE B5
                //model.setB5(Double.parseDouble(sheet.getCell(1, 4).getContents().replace(",", ".")));

                //METS B7
                tmp = sheet.getCell(4, 12).getContents();
                model.setB7(getDoubleFromString(tmp));

                //SOOD B13
                tmp = sheet.getCell(4, 17).getContents();
                model.setB13(getDoubleFromString(tmp));

                //PÕLLUMAA
                tmp = sheet.getCell(4, 20).getContents();
                model.setB15(getDoubleFromString(tmp));

                //Loomühikud
                double animalUnit = 0;
                //kitsed 1/10 LÜ
                tmp = sheet.getCell(2, 28).getContents();
                animalUnit += getDoubleFromString(tmp) / 10;
                //sead 1/2 LÜ
                tmp = sheet.getCell(2, 29).getContents();
                animalUnit += getDoubleFromString(tmp) / 2;
                //lambad 1/10 LÜ
                tmp = sheet.getCell(2, 31).getContents();
                animalUnit += getDoubleFromString(tmp) / 10;
                model.setB34(Math.round(animalUnit));

                //PIIMALEHMI
                tmp = sheet.getCell(2, 30).getContents();
                model.setB35(getDoubleFromString(tmp));

                ////Nüld
                //tmp = sheet.getCell(2, 30).getContents();
                //model.setB35(getDoubleFromString(tmp));
                //
                ////Püld
                //tmp = sheet.getCell(2, 30).getContents();
                //model.setB35(getDoubleFromString(tmp));



            } catch (Exception e2) {
                e2.printStackTrace();
                JOptionPane.showMessageDialog(null,
                        "Palun kontrollige, et õige fail on valitud",
                        "Failist lugemine ebaõnnestus",
                        JOptionPane.INFORMATION_MESSAGE);
            }

            return model;
        }
        return null;
    }


    private static final String DOUBLE_PARSE_ERR = "VALUE COULD NOT BE PARSED INTO A DOUBLE";
    private static final String INT_PARSE_ERR = "VALUE COULD NOT BE PARSED INTO AN INTEGER";
    private static final String GEN_PARSE_ERR = "PARSE ERROR";

    /**
     *
     * @return
     */
    private double getDoubleFromString(String cell) {
        double value = 0;
        try{
            cell = cell.replace(",", ".");
            value = Double.parseDouble(cell);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                    DOUBLE_PARSE_ERR + " (" + cell + ")",
                    GEN_PARSE_ERR,
                    JOptionPane.INFORMATION_MESSAGE);
        }
        return value;
    }

}
