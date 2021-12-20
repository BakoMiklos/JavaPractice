package Metode;

import org.junit.Test;

public class Angajat {

    public String Nume;
    public String Prenume;
    public String Adresa;

    //metodele pot sau nu sa contina parametrii
    //Parametrii se declara in interiorul parantezelor de la metoda

    @Test
    public void TestAutomat(){
        DateAngajat("Bako","Miklos","Fabricii");
        DateAngajat("Dorha","Alex","A.Vlaicu");
        DateExtraangajat("Lidl",4.300,1000);
        DateExtraangajat("Kaufland",6.000,2000);
        System.out.println("Bonusul de final este: "+String.format("%.3f", GetSalarCuBonus()));
    }


    public void DateAngajat(String Nume,String Prenume,String Adresa){

        System.out.println("Datele angajatului sunt:");
        System.out.println(Nume);
        System.out.println(Prenume);
        System.out.println(Adresa);
    }

    public void DateExtraangajat(String LocDeMunca,Double Salar,Integer Bonus){

        System.out.println("Datele extra ale angajatului sunt:");
        System.out.println(LocDeMunca);
        System.out.println(String.format("%.3f", Salar));
        System.out.println(Bonus);
    }


    public Double GetSalarCuBonus(){
        Double Salar=4.300;
        Double Bonus=1.000;
        Double SalarFInal=Salar+Bonus;
        return SalarFInal;
    }
}
