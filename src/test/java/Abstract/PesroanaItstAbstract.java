package Abstract;

public class PesroanaItstAbstract extends PersoanaAbstract{
    public String Nume;
    public String Prenume;
    public Integer Varsta;

    public PesroanaItstAbstract(String nume, String prenume, Integer varsta) {
        Nume = nume;
        Prenume = prenume;
        Varsta = varsta;
    }

    @Override
    public void ScrieCod() {
        System.out.println(Nume+" "+Prenume+" in varsta de "+Varsta+" scrie cod. ");
    }

    @Override
    public void RuleazaTeste() {
        System.out.println(Nume+" "+Prenume+" in varsta de "+Varsta+" ruleaza teste automate. ");
    }

    @Override
    public void Conduce() {

    }

    @Override
    public void Descarca() {

    }
}
