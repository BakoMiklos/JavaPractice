package Structuri;

import org.junit.Test;

public class StructuriAlternative {

    //If (conditie) Then
    //              Else

    @Test
    public void TestAutomat(){
       VerificaDouaNumere(5,3);
       VerificaDouaNumere(3,5);
       VerificaDouaNumere(5,5);
       VerificaDouaNumere(-2,-6);

       VerificaContinutNume("Alexandru","Alex");
       VerificaContinutNume("Alex","Toty");
    }

    //verificam daca primul nr e mai mare decat al 2 lea
    public  void VerificaDouaNumere(Integer Nr1,Integer Nr2){
        if (Nr1>Nr2){
            System.out.println(Nr1+" este mai mare decat "+Nr2);
        }
        else {
            System.out.println(Nr1+" Nu este mai mare decat "+Nr2);
        }
    }

    //verifica daca un nume contine o valoare
    public void VerificaContinutNume(String Nume1,String Nume2){

        if (Nume1.contains(Nume2)){
            System.out.println(Nume1+" contine "+Nume2);
        }
        else {
            System.out.println(Nume1+" NU contine "+Nume2);
        }
    }
}
