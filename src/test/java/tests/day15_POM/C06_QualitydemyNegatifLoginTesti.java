package tests.day15_POM;

import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C06_QualitydemyNegatifLoginTesti {


    //Qualitydemy ana sayfaya gidin
    Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

//log in linkine tiklayin
    QualitydemyPage qualitydemyPage=new QualitydemyPage();
    qualitydemyPage.ilkLoginLinki.click();

//gecersiz username ve grcersiz sifre yi ilgili kutulara yazin

//login butonuna basarak

//basarili olarak giris yapilmadigini test edin

    //sayfayi kapatin
    Driver.closeDriver;
}
