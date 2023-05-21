package tests.day15_POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.animation.model.KeyframeStyle;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.IOException;

public class C04_ConfigurationDosyasiKullanma {

    /*
    POM'de hedef test class'inda
manuel olarak hic bir Test Data'si GIRMEMEKTIR

Test datalari :
1- Kullanacagimiz WebDriver : Driver class'indan dinamik olarak kullaniyoruz
2- Locate : Locate'leri pages sayfalarindan dinamik olarak kullaniyoruz
3- kullanilan Url, aranan kelime, expected icerik, dogru kullanici adi,
   yanlis kullanici adi, yanlis sifre... gibi datalar
     */
    @Test
    public void test01(){

      Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramakutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+ Keys.ENTER);

        String expectedicerik = ConfigReader.getProperty("amazonexpectedIcerik");
        String actualSonucYazisi = amazonPage.aramaSonucuelementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedicerik));

        Driver.closeDriver();

    }


}
