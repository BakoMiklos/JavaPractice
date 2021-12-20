package Protected;

public class Copil {

    //public=vizibil peste tot in proiect
    //private=vizibil doar in clasa declarata
    //protected=vizibil in clasa parinte+clasa copil
    //default=vizibil in clasa parinte+clasa copil / e vizibil daca declaram un obiect
    // intr o alta clasa si f important din acelasi pachet
    //protected = e vizibil daca declaram un obiect intr o alta clasa si f important din acelasi pachet
    //protected = nu e vizibil daca declaram un obiect intr o alta clasa si f important dintr un pachet diferit
    //default = nu e vizibil daca declaram un obiect intr o alta clasa si f important dintr un pachet diferit
    //protected = vizibil in clasa copil daca face parte dintr un pachet diferit
    //default = nu e vizibil in clasa copil daca face parte dintr un pachet diferit

    public void MetodaPublica(){
        System.out.println("Public");
    }

    private void MotedaPrivata(){
        System.out.println("Privat");
    }

    protected void MetodaProtected(){
        System.out.println("Protected");
    }

    void MetodaDefault(){
        System.out.println("Default");
    }


}
