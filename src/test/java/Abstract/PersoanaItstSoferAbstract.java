package Abstract;

public class PersoanaItstSoferAbstract extends PersoanaAbstract{
    public String Nume;
    public String Prenume;
    public Integer Varsta;

    public PersoanaItstSoferAbstract(String nume, String prenume, Integer varsta) {
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
        System.out.println(Nume+" "+Prenume+"in varsta de "+Varsta+" conduce.");
    }

    @Override
    public void Descarca() {
        System.out.println(Nume+" "+Prenume+"in varsta de "+Varsta+" descarca.");
    }
}
