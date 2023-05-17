package tests.day14_TestNGFrameworkOlusturma;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class C02_Ignore {
    @Test
    public void youtubeTesti(){
        System.out.println("Youtube");
    }

    @Test (priority = 3) @Ignore
    public void wiseTesti(){
        System.out.println("Wise Quarter");
    }
    @Test
    public void amazonTesti(){
        System.out.println("Amazon");
    }
}
