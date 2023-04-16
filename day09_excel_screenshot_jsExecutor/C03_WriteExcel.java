package day09_excel_screenshot_jsExecutor;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C03_WriteExcel {

    @Test
    public void test01() throws IOException {

        // 2) Yeni bir test method olusturalım writeExcelTest()

        String doyaYolu="src/test/java/day09_excel_screenshot_jsExecutor/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(doyaYolu);
        Workbook workbook= WorkbookFactory.create(fis);
        Sheet sayfa1= workbook.getSheet("Sayfa1");

        // 3) Aimlari takip ederek 1.satira kadar gidelim
        // 4) 4. hücreye yeni bir cell olusturalim
        // 5) Olusturdugumuz hucreye "Nufus" yazdiralim
        sayfa1.getRow(0).createCell(4).setCellValue("Nufus");

        // 6) 2.satir nufus kolonuna 1500000 yazdırakim
        sayfa1.getRow(1).createCell(4).setCellValue("1500000");

        // 7) 10.satir nufus kolonuna 250000 yazdiralim
        sayfa1.getRow(9).createCell(4).setCellValue("250000");

        // 8) 15.satir nufus kolonuna 54000 yazdiralim
        sayfa1.getRow(14).createCell(4).setCellValue("54000");

        // 9) Dosyayi kaydedelim
        FileOutputStream fos = new FileOutputStream(doyaYolu);
        workbook.write(fos);

        // 10) Dosyayi kapatalim

        fis.close();
        fos.close();
        workbook.close();
    }
}
