package utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public static String getCellData(int row, int col) {

        try {

            FileInputStream fis =
                new FileInputStream("testdata/LoginData.xlsx");

            XSSFWorkbook wb = new XSSFWorkbook(fis);

            XSSFSheet sheet = wb.getSheet("Sheet1");

            String data =
                sheet.getRow(row).getCell(col).getStringCellValue();

            wb.close();

            return data;

        } catch(Exception e) {

            return "";
        }
	}
}
