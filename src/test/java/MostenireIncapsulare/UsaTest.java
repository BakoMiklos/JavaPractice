package MostenireIncapsulare;

import org.junit.Test;

public class UsaTest {

    @Test
    public void TestAutomat(){
        Dedeman usaBaie=new Dedeman("De Baie","Alba","Dreapta","Lungime:200,Latime:80",600,15);
        usaBaie.CalculPretFinal();
        usaBaie.CalculPretFinal();

        Dedeman usaBucatarie=new Dedeman("De Bucatarie","Mare","Stanga","Lungime:200,Latime:80",600,23);
        usaBucatarie.CalculPretFinal();

        Leroy usaDormitor=new Leroy("De Dormitor","Gri","Stanga","Lungime:200,Latime:80",700);
        usaDormitor.CalculPretFinal();
    }
}
