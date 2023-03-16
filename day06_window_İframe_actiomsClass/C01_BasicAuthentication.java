package day06_window_İframe_actiomsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C01_BasicAuthentication extends TestBase {

    @Test
    public void test01(){

        // 2- https://the-internet.herokuapp.com/basic_auth sayfasina gidin

        // 3- asağidaki yontem ve test datalarini kullanarak authentication'i yapin
        //
        //  Html komutu :https://username:passwoerd@URL
        //  Username     :admin
        //  password     :admin
        //
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        // 4- Basarili sekilde sayfaya girildiğini doğrulyin
        String actuelGirisYazisi= driver.findElement(By.tagName("p")).getText();
        String expectedIcerik= "Congratulations";

        Assert.assertTrue(actuelGirisYazisi.contains(expectedIcerik));

        bekle(3);


    }

}
