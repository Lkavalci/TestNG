package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C03_qualitydemyNegatifLoginTesti {

    @Test
    public void test01(){

        //qualitydemy ana sayfaya gidin
        Driver.getDriver().get("https://www.qualitydemy.com");

        //ilk login linkine tiklayin
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();

        // kullanici adi olarak selenium
qualitydemyPage.emailKutusu.sendKeys("selenium");

        // password olarak heyecandir yaziniz
qualitydemyPage.passwordKutusu.sendKeys("heyacandir");

        //login butonuna tiklayin
        qualitydemyPage.loginButonu.click();

        // giris yapilamadigini test edin
        Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());

        // sayfayi kapatin
        Driver.closeDriver();
    }
}
