package tests.Practise;

import org.testng.annotations.Test;

public class P01 {
    @Test (priority = 10)
    public void Didem(){
        System.out.println("Didem");
    }

    @Test
    public void Zeynep(){

        System.out.println("Zeynep");
    }

    @Test (priority = 1)
    public void Kadir(){
        System.out.println("Kadir");
    }

}
