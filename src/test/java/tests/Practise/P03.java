package tests.Practise;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class P03 {

    /*
Navigate to https://www.saucedemo.com/---https://www.saucedemo.com/ adresine gidin
Enter the username as standard_user ---- Kullanıcı adını standart_kullanıcı olarak girin
Enter the password as secret_sauce --- Parolayı secret_sauce olarak girin
Click on login button --- Giriş düğmesine tıklayın
Test 1: Choose price Iow to high --- Test 1: Düşükten yükseğe doğru fiyat seçin
Test 2:Verify item prices are sorted from Iow to high with soft Assert ---Test 2: Ürün fiyatlarının yumuşak Assert ile düşükten yükseğe doğru sıralandığını doğrulayın
 */


@Test
    public void suceDemo(){

    Driver.getDriver().get(ConfigReader.getProperty("sauceDemourl"));
    Driver.getDriver().findElement(By.id("user-name")).sendKeys("standartUser");
}


}
