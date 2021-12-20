package Polimorfism;

public class StudentFF extends Student{

    public StudentFF(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    //polimorfism dinamic
    @Override
    public void infoStudent(){
        System.out.println("Detaliile despre studentul FF sunt:");
        super.infoStudent();
    }

    //polimorfismul static
    public void calculMedie(){
        System.out.println("Studentul FF nu a intrat in sesiune.");

    }

    public void calculMedie(Integer nota1,Integer nota2){
        Integer medie=(nota1+nota2)/2;
        System.out.println("Media este: "+medie);
    }

    public void calculMedie(Double nota1,Double nota2){
        Double medie=(nota1+nota2)/2;
        System.out.println("Media este: "+medie);
    }
    public void calculMedie(Double nota1,Double nota2,Double nota3) {
        Double medie = (nota1 + nota2 + nota3) / 3;
        System.out.println("Media este: " + medie);
    }

}
