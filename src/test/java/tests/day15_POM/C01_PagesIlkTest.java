package tests.day15_POM;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C01_PagesIlkTest {

    @Test
    public  void  amazonTest(){

        //amazon sayfasina gidelim

        Driver.getDriver().get("https://www.amazon.com");
        // Nutella icin arama yapalim
        //arama kutusunun locate i page sayfasinda
        //POM'de pages sayfaindaki locatelere erismek icin
        // pages sayfalarinden bir obje olusturulur.
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramakutusu.sendKeys("Nutella"+ Keys.ENTER);

        //sonuclarin Nutella icerdigini test edelim
        String expectedIcerik = "Nutella";
        String actualAramaSonucYazisi=amazonPage.aramaSonucuelementi.getText();

        Assert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik));


        // sayfayı kapatalim
        Driver.closeDriver();

    }
}