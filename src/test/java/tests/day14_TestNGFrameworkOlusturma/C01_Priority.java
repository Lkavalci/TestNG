package tests.day14_TestNGFrameworkOlusturma;

import org.testng.annotations.Test;

public class C01_Priority {
    /*


     */
    @Test (priority = 57)
    public void youtubeTesti(){
        System.out.println("Youtube");
    }

    @Test (priority = -3)
    public void wiseTesti(){
        System.out.println("Wise Quarter");
    }
    @Test
    public void amazonTesti(){
        System.out.println("Amazon");
    }
}
