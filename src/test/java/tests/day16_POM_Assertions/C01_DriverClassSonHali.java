package tests.day16_POM_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_DriverClassSonHali {

    // 3 tane test methodu oluşturalım
// 1. methodda amazona gidip URL'in amazon içerdiğini test edin
    @Test
    public void amazonTest(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        String expectedIcerik="amazon";
        String actualUrl= Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedIcerik));
        Driver.closeDriver();
    }

// 2. methodda Wise Quarter ana sayfaya gidip title'ın wise quarter içerdiğini test edin
    @Test
    public void wiseTest(){

        Driver.getDriver().get(ConfigReader.getProperty("wiseUrl"));
        String expectedIcerik="Wise Quarter";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedIcerik));
        Driver.closeDriver();
    }

// 3. methodda Facebook ana sayfaya gidip, title'ın facebook içerdiğini test edin.
    @Test
    public void facebookTest(){
        Driver.getDriver().get(ConfigReader.getProperty("faceUrl"));
        String expectedIcerik="Facebook";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedIcerik));
        Driver.closeDriver();
    }
// her methodda yeni driver oluşturup method sonunda driver ı kapatın


}