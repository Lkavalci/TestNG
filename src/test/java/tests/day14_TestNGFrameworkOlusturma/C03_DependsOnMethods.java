package tests.day14_TestNGFrameworkOlusturma;

import org.testng.annotations.Test;

public class C03_DependsOnMethods {

    @Test (dependsOnMethods = "wiseTesti")
    public void youtubeTesti(){
        System.out.println("Youtube");
    }

    @Test (priority = 3)
    public void wiseTesti(){
        System.out.println("Wise Quarter");
    }
    @Test (dependsOnMethods = "youtubeTesti")
    public void amazonTesti(){
        System.out.println("Amazon");
    }
}
