package Structuri;

import org.junit.Test;

public class StructuriRepetitive {

    //structuri repetitive = for si while

    @Test
    public void TestAutomat(){
     //  PrintNumereFor(100);
       PrintNumereWhile(60);
 //       NumerePare(50);
 //       PrintNumereWhile(30);
 //       PrintNumereFor(50);
 //       NumerePare(10);
        NumereImpare(35);
    }

    //Printam primele 50 de numere

    public void PrintNumereFor(Integer Numar){
        for (Integer Index=0;Index<Numar+1;Index++){
            System.out.println(Index);
        }
    }

    public void PrintNumereWhile(Integer Numar){
        Integer Index=0;
        while (Index<Numar+1){
            System.out.println(Index);
            Index++;
        }
    }

    //afisam numerele pare pana la 50

    public void NumerePare(Integer Numar){
        for (Integer Index=1;Index<=Numar;Index++){
            if (Index%2==0){
                System.out.println(Index);
            }
        }
    }
    public void NumereImpare(Integer Numar){
        for (Integer Index=0;Index<=Numar;Index++){
            if (Index%2==1){
                System.out.println(Index);
            }
        }
    }
}
