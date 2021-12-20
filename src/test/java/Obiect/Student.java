package Obiect;

import java.util.List;
import java.util.Objects;

public class Student {

    //obiect=instanta unei clase
    //putem recunoaste un obiect dupa cuvantul cheie new
    //dintr o clasa poti creea o multime de obiecte care se diferentiaza prin Nume
    //in momentul in care declari un obiect rezulta = poti accesa orice variabila si metoda din clasa
    //structura obiect=nume clasa , nume obiect = new nume clasa (se apeleaza constructorul clasei)(se vor da valori pentru variabile)
    //constructor=are ca rol sa initializeze atributele unei clase
    //constructorul este de doua feluri - cu parametri si fara parametri
    //constructorul unei clase trebuie sa fie tot timpul public
    //structura constructor=public NumeClasa(daca are sau nu parametrii)
    //intr o clasa poti sa ai o multime de constructori care se diferentiaza prin tipul de valori sau numarul de valori
    //in cazul in care nu definim nici un constructor = exista unul bydefault fara parametrii , gol.

    public String nume;
    public String prenume;
    public Integer varsta;
    public Double taxa;
    public Boolean buget;
    public List<String> optionale;

    public Student(String nume, String prenume, Integer varsta, Double taxa, Boolean buget, List<String> optionale) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.taxa = taxa;
        this.buget = buget;
        this.optionale = optionale;
    }

    public void InfoStudent(){
        System.out.println("Numel studentului este "+nume);
        System.out.println("Prenumele studentului este "+prenume);
        System.out.println("Varsta studentului este "+varsta);
        System.out.println("Taxa de achitat este "+String.format("%.3f", taxa));
        if (buget){
            System.out.println("Studentul este la buget");
        }
        else {
            System.out.println("Studentul e la taxa");

        }
        System.out.println("Optionalele sunt:");
        for (Integer Index=0;Index<optionale.size();Index++){
            System.out.println(optionale.get(Index));
        }
    }

    public void VerificaTaxa(){
        Double taxaFinala=6.000;
        if (taxa<taxaFinala){
            Double diferenta=taxaFinala-taxa;
            System.out.println("Studentul "+nume+" "+prenume+" mai are de achitat: "+String.format("%.3f", diferenta));
        }
        if (Objects.equals(taxa, taxaFinala)) {
            System.out.println("Studentul "+nume+" "+prenume+" a achitat toata taxa ");
        }
        if (Objects.equals(taxa, 0.0)) {
            System.out.println("Studentul "+nume+" "+prenume+" nu a achitat deloc taxa ");
        }
        if (taxa>taxaFinala){
            Double diferenta=taxa-taxaFinala;
            System.out.println("Studentul "+nume+" "+prenume+" are de primit inapoi suma de: "+String.format("%.3f", diferenta));
        }
   }
}
