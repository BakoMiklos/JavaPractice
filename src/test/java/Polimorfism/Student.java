package Polimorfism;

public class Student {

    //polimorfismul=conceptul prin care o metoda poate avea forme diferite
    //este de doua feluri: dinamic(Override) si static (Overloading)
    //polimorfism dinamic=intr o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
    //polimorfismul static=putem diferentia mai multe metode care au acelasi nume prin numarul sau tipul parametrilor

    private String nume;
    private String prenume;
    private Integer varsta;

    public Student(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public void infoStudent(){

        System.out.println(nume);
        System.out.println(prenume);
        System.out.println(varsta);
    }


    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
