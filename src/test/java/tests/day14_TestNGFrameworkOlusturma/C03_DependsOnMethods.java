package tests.day14_TestNGFrameworkOlusturma;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_DependsOnMethods {

    /*
    Dependsonmethods oncelik sirasina karimaz
    Dependsonmethods bir test methodun calismasini baska bir methodun calisip
    passed olmasına baglar.
    Baglanilan method calismaz veya calisir ama failed olursa
    baglanan method hic calişmaz.
        @Test methodu sayesinde her test bagımsız olarak calıstırılabilir.
        Ancak bir test dependsOnmethods ile baska bir method'a baglanmıs ise
        tek basına calışması istendiginde, once baglı oldugu test method'unu calıstırı.
        o method calisip passed olursa asil calistirmak istedigimiz methodda calisir.

            Bu baglanti 3 veya daha fazla method arasinda olursa yani calistirmak
        istedigimiz method baska bir method'a o da baska bir methoda bagli ise 3 'u birden calismaz.
        "No tests were found" yazar ve hic bir test methodu calismaz
     */
    @Test (dependsOnMethods = "wiseTesti")

    public void youtubeTesti(){
        System.out.println("Youtube");

    }

    @Test (priority = 3)
    public void wiseTesti(){
        System.out.println("Wise Quarter");
    }
    @Test (dependsOnMethods = "youtubeTesti")
    public void amazonTesti(){ // priority yazilmazsa 0 degeri alir.
        System.out.println("Amazon");
    }
}
