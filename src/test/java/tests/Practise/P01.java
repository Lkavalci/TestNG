package tests.Practise;

import org.testng.annotations.Test;

public class P01 {
    @Test (priority = 10)
    public void Didem(){
        System.out.println("Didem");
    }

    @Test (enabled = false) // testin calısmasına engel olmak icin kullanılır @ignore den farkı run tusunuda kaldırır.
    public void Zeynep(){

        System.out.println("Zeynep");
    }

    @Test (priority = 1)
    public void Kadir(){
        System.out.println("Kadir");
    }
    @Test (dependsOnMethods = "Didem") // erdal dan sonra calıstır demektir.
    public void Erdal(){
        System.out.println("Erdal");
    }
}
