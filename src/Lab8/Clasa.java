package Lab8;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Clasa {
    public static void main(String[] args) {
        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        data.put("2", new Object[] {"Amit", "Shukla", 9, 8, 7, 5});
        data.put("3", new Object[] {"Lokesh", "Gupta", 8, 9, 6, 7});
        data.put("4", new Object[] {"John", "Adwards", 8, 8, 7, 6});
        data.put("5", new Object[] {"Brian", "Schultz", 7, 6, 8, 9});
        XSSFWorkbook workbook = null;
        try {
            FileInputStream file = new FileInputStream(new
                    File("laborator8_input.xlsx"));

            //Create Workbook instance holding reference to .xlsx file
            workbook = new XSSFWorkbook(file);
            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            //Iterate through each rows one by one
            for (Row row : sheet) {
                //For each row, iterate through all the columns
                for (Cell cell: row){
                    //Check the cell type and format accordingly
                    switch (cell.getCellType()) {
                        case CellType.NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case CellType.STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                    }
                }
                System.out.println();
            }
            file.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
