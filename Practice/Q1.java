package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

    /*...Exercise1...
    Create a new class under Q1 create main method
    Set Path
    Create chrome driver
    Maximize the window
    Open google home page https://www.google.com/.
    On the same class, Navigate to amazon home page https://www.amazon.com/
    Navigate back to google
    Navigate forward to amazon
    Refresh the page
    Close/Quit the browser
    And last step : print "All Ok" on console
     */

    public static void main(String[] args){

        // Set Path

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_mac_arm64/chromedriver");
        //--> Bu sisteme driveri'mizi tanitiyoruz choredriver i oraya koyup yolunu duzeltin.
        //--> Driver'imizin yolunu gösteriyoruz
        //-->  Create chome driver

        WebDriver driver= new ChromeDriver();

        // Maximize the window

        driver.manage().window().maximize();

        // Open google home page https://www.google.com/.

        driver.get("https://www.google.com");
        //--> Ilk etapda navigate mi yoksa get mi olduguna karar veriyoruz
        //--> Get methodu daha hizli calişir, navigate ise daha çok bağimli senoryalarda  tercih edilir


        // On the same class, Navigate to amazon home page https://www.amazon.com/

        driver.navigate().to("https://www.amazon.com");
        //--> navigate ise daha çok bağimli senoryalarda  tercih edilir

        // Navigate back to google

        driver.navigate().back();

        // Navigate forward to amazon
        driver.navigate().forward();

        // Refresh the page
        driver.navigate().refresh();

       // Close/Quit the browser
        driver.quit();
       //--> Close bulunan son sayfayi,Quit ise tüm sayfayi kapatır

        System.out.println("All ok");

    }

}
