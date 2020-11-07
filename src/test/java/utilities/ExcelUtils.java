package utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtils {

	public HashMap<String, String> getData(String sheetName) throws Exception {
		ConfigUtils configUtils = new ConfigUtils();
		HashMap<String, String> hm = getData(configUtils.getTestDataFilePath(), sheetName);
		return hm;
	}

	public HashMap<String, String> getData(String testDataFilePath, String testDataSheetName) {
		HashMap<String, String> hm = new HashMap<String, String>();

		try {
			// Get the workbook instance for XLS file
			Workbook workbook = WorkbookFactory.create(new File(testDataFilePath));

			// Get first sheet from the workbook
			Sheet sheet = workbook.getSheet(testDataSheetName);

			// Iterate through each rows from first sheet
			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				// For each row, iterate through each columns
				Iterator<Cell> cellIterator = row.cellIterator();
				ArrayList<String> cellData = new ArrayList<String>();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					cellData.add(cell.getStringCellValue());

					System.out.print(cell.getStringCellValue() + "\t\t");

				}
				hm.put(cellData.get(0), cellData.get(1));
				cellData = null;
				System.out.println("");
			}

			workbook.close();
			return hm;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return hm;
	}

}
