import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelSheet {

        public static void main(String[] args) throws IOException {



    File file = new File("C:\\Users\\Vaibhav\\IdeaProjects\\TestSheet.xlsx");
    FileInputStream fis = new FileInputStream(file);
    XSSFWorkbook workBook = new XSSFWorkbook(fis);
    XSSFSheet workSheet = workBook.getSheetAt(0);
    String workSheetName = workSheet.getSheetName();
    System.out.println(workSheetName);
    System.out.println("Data: " + workSheet.getRow(0).getCTRow());

    fis.close();
}


}
