package Util.io;

import Util.LanguageResourceBundle;
import Wennerblom.WennerblomModel;
import jxl.CellView;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.format.UnderlineStyle;
import jxl.write.*;
import jxl.write.Number;

import java.io.File;
import java.io.IOException;

public class ModelToExcel {

    WennerblomModel model;

    /**
     * constructor wennerblomi mudeli jaoks.
     * @param model
     */
    public ModelToExcel(WennerblomModel model) {
        this.model = model;
    }
    
	private WritableCellFormat timesBoldUnderline;
	private WritableCellFormat times;
	private String inputFile;

    public void setOutputFile(String inputFile) {
	    this.inputFile = inputFile;
	}

	public void write() throws IOException, WriteException {
		File file = new File(inputFile);
		WorkbookSettings wbSettings = new WorkbookSettings();

		WritableWorkbook workbook = Workbook.createWorkbook(file, wbSettings);
		workbook.createSheet("Wennerblom", 0);
		WritableSheet excelSheet = workbook.getSheet(0);
		createLabel(excelSheet);
		createContent(excelSheet);

		workbook.write();
		workbook.close();
	}

	private void createLabel(WritableSheet sheet) throws WriteException {
		// Lets create a times font
		WritableFont times10pt = new WritableFont(WritableFont.TIMES, 10);
		// Define the cell format
		times = new WritableCellFormat(times10pt);
		// Lets automatically wrap the cells
		times.setWrap(true);

		// Create create a bold font with underlines
		WritableFont times10ptBoldUnderline = new WritableFont(
				WritableFont.TIMES, 10, WritableFont.BOLD, false,
				UnderlineStyle.SINGLE);
		timesBoldUnderline = new WritableCellFormat(times10ptBoldUnderline);
		// Lets automatically wrap the cells
		timesBoldUnderline.setWrap(true);

		CellView cv = new CellView();
		cv.setFormat(times);
		cv.setFormat(timesBoldUnderline);
		cv.setAutosize(true);
	}

	private void createContent(WritableSheet sheet) throws WriteException {
		// Write a few headers
		addCaption(sheet, 0, 0, "Param.");
		addCaption(sheet, 1, 0, "Väärtused");
        // input-data from the model
        addLabel(sheet, 0, 1, LanguageResourceBundle.getBundle().getString("B2"));
        addLabel(sheet, 1, 1, model.getB2());
        addLabel(sheet, 0, 2, LanguageResourceBundle.getBundle().getString("B3"));
        addNumber(sheet, 1, 2, model.getB3());
        addLabel(sheet, 0, 3, LanguageResourceBundle.getBundle().getString("B4"));
        addNumber(sheet, 1, 3, model.getB4());
        addLabel(sheet, 0, 4, LanguageResourceBundle.getBundle().getString("B5"));
        addNumber(sheet, 1, 4, model.getB5());
        addLabel(sheet, 0, 5, LanguageResourceBundle.getBundle().getString("B6"));
        addNumber(sheet, 1, 5, model.getB6());
        addLabel(sheet, 0, 6, LanguageResourceBundle.getBundle().getString("B7"));
        addNumber(sheet, 1, 6, model.getB7());
        addLabel(sheet, 0, 7, LanguageResourceBundle.getBundle().getString("B8"));
        addNumber(sheet, 1, 7, model.getB8());
        addLabel(sheet, 0, 8, LanguageResourceBundle.getBundle().getString("B9"));
        addNumber(sheet, 1, 8, model.getB9());
        addLabel(sheet, 0, 9, LanguageResourceBundle.getBundle().getString("B10"));
        addNumber(sheet, 1, 9, model.getB10());
        addLabel(sheet, 0, 10, LanguageResourceBundle.getBundle().getString("B11"));
        addNumber(sheet, 1, 10, model.getB11());
        addLabel(sheet, 0, 11, LanguageResourceBundle.getBundle().getString("B12"));
        addNumber(sheet, 1, 11, model.getB12());
        addLabel(sheet, 0, 12, LanguageResourceBundle.getBundle().getString("B13"));
        addNumber(sheet, 1, 12, model.getB13());
        addLabel(sheet, 0, 13, LanguageResourceBundle.getBundle().getString("B14"));
        addNumber(sheet, 1, 13, model.getB14());
        /*addLabel(sheet, 0, 14, resourceBundle.getString("B15"));
        addNumber(sheet, 1, 14, model.getB15());
        addLabel(sheet, 0, 15, resourceBundle.getString("B16"));
        addNumber(sheet, 1, 15, model.getB16());
        addLabel(sheet, 0, 16, resourceBundle.getString("B17"));
        addNumber(sheet, 1, 16, model.getB17());
        addLabel(sheet, 0, 16, resourceBundle.getString("B18"));
        addNumber(sheet, 1, 16, model.getB18());
        addLabel(sheet, 0, 17, resourceBundle.getString("B34"));
        addNumber(sheet, 1, 17, model.getB34());
        addLabel(sheet, 0, 18, resourceBundle.getString("B35"));
        addNumber(sheet, 1, 18, model.getB35());
        addLabel(sheet, 0, 19, resourceBundle.getString("B36"));
        addNumber(sheet, 1, 19, model.getB36());
        addLabel(sheet, 0, 20, resourceBundle.getString("B37"));
        addNumber(sheet, 1, 20, model.getB37());
        addLabel(sheet, 0, 21, resourceBundle.getString("B38"));
        addNumber(sheet, 1, 21, model.getB38());
        addLabel(sheet, 0, 22, resourceBundle.getString("B39"));
        addNumber(sheet, 1, 22, model.getB39());
        addLabel(sheet, 0, 23, resourceBundle.getString("B40"));
        addNumber(sheet, 1, 23, model.getB40());
        addLabel(sheet, 0, 24, resourceBundle.getString("B41"));
        addNumber(sheet, 1, 24, model.getB41());
        addLabel(sheet, 0, 25, resourceBundle.getString("B42"));
        addNumber(sheet, 1, 25, model.getB42());
        addLabel(sheet, 0, 26, resourceBundle.getString("B43"));
        addNumber(sheet, 1, 26, model.getB43());
        addLabel(sheet, 0, 27, resourceBundle.getString("B44"));
        addNumber(sheet, 1, 27, model.getB44());
        addLabel(sheet, 0, 28, resourceBundle.getString("B45"));
        addNumber(sheet, 1, 28, model.getB45());
        addLabel(sheet, 0, 29, resourceBundle.getString("B46"));
        addNumber(sheet, 1, 29, model.getB46());
        addLabel(sheet, 0, 30, resourceBundle.getString("B47"));
        addNumber(sheet, 1, 30, model.getB47());
        addLabel(sheet, 0, 31, resourceBundle.getString("B48"));
        addNumber(sheet, 1, 31, model.getB48());
        addLabel(sheet, 0, 32, resourceBundle.getString("B49"));
        addNumber(sheet, 1, 32, model.getB49());
        addLabel(sheet, 0, 33, resourceBundle.getString("B50"));
        addNumber(sheet, 1, 33, model.getB50());
        addLabel(sheet, 0, 34, resourceBundle.getString("B51"));
        addNumber(sheet, 1, 34, model.getB51());
        addLabel(sheet, 0, 35, resourceBundle.getString("B52"));
        addNumber(sheet, 1, 35, model.getB52());
        addLabel(sheet, 0, 36, resourceBundle.getString("B53"));
        addNumber(sheet, 1, 36, model.getB53());
        addLabel(sheet, 0, 37, resourceBundle.getString("B54"));
        addNumber(sheet, 1, 37, model.getB54());
        addLabel(sheet, 0, 38, resourceBundle.getString("B55"));
        addNumber(sheet, 1, 38, model.getB55());
        addLabel(sheet, 0, 39, resourceBundle.getString("B56"));
        addNumber(sheet, 1, 39, model.getB56());
        addLabel(sheet, 0, 40, resourceBundle.getString("B57"));
        addNumber(sheet, 1, 40, model.getB57());
        addLabel(sheet, 0, 41, resourceBundle.getString("B58"));
        addNumber(sheet, 1, 41, model.getB58());
        addLabel(sheet, 0, 42, resourceBundle.getString("B59"));
        addNumber(sheet, 1, 42, model.getB59());
        addLabel(sheet, 0, 43, resourceBundle.getString("B60"));
        addNumber(sheet, 1, 43, model.getB60());
        addLabel(sheet, 0, 44, resourceBundle.getString("B61"));
        addNumber(sheet, 1, 44, model.getB61());
        addLabel(sheet, 0, 45, resourceBundle.getString("B62"));
        addNumber(sheet, 1, 45, model.getB62());
        addLabel(sheet, 0, 46, resourceBundle.getString("B63"));
        addNumber(sheet, 1, 46, model.getB63());
        addLabel(sheet, 0, 47, resourceBundle.getString("B64"));
        addNumber(sheet, 1, 47, model.getB64());
        addLabel(sheet, 0, 48, resourceBundle.getString("B65"));
        addNumber(sheet, 1, 48, model.getB65());
        addLabel(sheet, 0, 49, resourceBundle.getString("B66"));
        addNumber(sheet, 1, 49, model.getB66());
        addLabel(sheet, 0, 50, resourceBundle.getString("B67"));
        addNumber(sheet, 1, 50, model.getB67());
        addLabel(sheet, 0, 51, resourceBundle.getString("B68"));
        addNumber(sheet, 1, 51, model.getB68());
        addLabel(sheet, 0, 52, resourceBundle.getString("B69"));
        addNumber(sheet, 1, 52, model.getB69());
        addLabel(sheet, 0, 53, resourceBundle.getString("B70"));
        addNumber(sheet, 1, 53, model.getB70());
        addLabel(sheet, 0, 54, resourceBundle.getString("B71"));
        addNumber(sheet, 1, 54, model.getB71());
        addLabel(sheet, 0, 55, resourceBundle.getString("B72"));
        addNumber(sheet, 1, 55, model.getB72());
        */





		}

	private void addCaption(WritableSheet sheet, int column, int row, String s)
			throws WriteException {
		Label label;
		label = new Label(column, row, s, timesBoldUnderline);
		sheet.addCell(label);
	}

	private void addNumber(WritableSheet sheet, int column, int row, double dbl) throws WriteException {
		Number number;
		number = new Number(column, row, dbl, times);
		sheet.addCell(number);
	}

	private void addLabel(WritableSheet sheet, int column, int row, String s) throws WriteException {
		Label label;
		label = new Label(column, row, s, times);
		sheet.addCell(label);
	}
}


