package day05_assertions_dropdownMenü;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Checkbox {

    // Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
    //  a. Verilen web sayfasına gidin.
    //       https://the-internet.herokuapp.com/checkboxes
    //  b. Checkbox1 ve checkbox2 elementlerini locate edin.
    //  c. Checkbox1 seçili değilse onay kutusunu tıklayın
    //  d. Checkbox2 seçili değilse onay kutusunu tıklayın

    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void teardown() {
        driver.close();
        }

    @Test
    public void test01() throws InterruptedException {
        //  a. Verilen web sayfasına gidin.
      driver.get("https://the-internet.herokuapp.com/checkboxes");

        //  b. Checkbox1 ve checkbox2 elementlerini locate edin.
       WebElement cb1= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
       WebElement cb2= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        Thread.sleep(3000);
        //  c. Checkbox1 seçili değilse onay kutusunu tıklayın
        if (!cb1.isSelected()){
            cb1.click();
        }

        //  d. Checkbox2 seçili değilse onay kutusunu tıklayın
        if (!cb2.isSelected()){
            cb2.click();
        }

        // e. checkbox1 ve checkbox2'nin secili oldugunu test edin

        Assert.assertTrue(cb1.isSelected());

        Assert.assertTrue(cb2.isSelected());

    }
}
