package Variabile;

import org.junit.Test;

public class Cursant {

    //ca sa fac un comentariu in java trebuie sa pun //
    //clasa = o colectie de variabile si metode
    //identificam o clasa dupa cuvantul cheie "class"
    //intr un fisier java putem avea mai multe clase insa cel mai bine e sa avem numai una intr un fisier
    //numele claselor trebuie sa fie unic
    //variabila = atributul general al unei clase
    //doua tipuri de variabile : Global si Local
    //variabila globala = e vizibila peste tot in clasa
    //structura variabila globala=acces control(public)+tip variabila+nume variabila
    //numele variabilei trebuie sa fie unic
    //o variabila poate sau nu sa primeasca o valoare
    //o variabila locala = este vizibila doar in locul unde am definit o
    //structura variabila locala= tip variabila + nume variabila
    //metodele pot sa fie de 2 tipuri = Void si Return
    //structura metoda Void= acces control(public)+ void + nume metoda(){}

    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public Character Gen;
    public Double Inaltime;
    public Float Greutate;
    public Boolean EsteAngajat;

    @Test
    public void initializeazaVariabile(){
        //initializam variabile globale
        Nume="Bako";
        Prenume="Miklos";
        Varsta=36;
        Gen='M';
        Inaltime=1.73;
        Greutate=78.5f;
        EsteAngajat=false;

        //print = printeaza si ramane pe acelasi rand
        //pintln = printeaza si merge la randul urmator
        System.out.print(Nume+" ");
        System.out.print(Prenume);
        System.out.println(" "+Varsta);
        System.out.println(Gen);
        System.out.println(Inaltime);
        System.out.println("Greutatea ta corporala este"+" "+Greutate);
        System.out.println("Este cursantul angajat? "+EsteAngajat);

    }
}