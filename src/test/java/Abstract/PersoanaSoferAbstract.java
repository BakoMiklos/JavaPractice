package Abstract;

public class PersoanaSoferAbstract extends PersoanaAbstract{

    public String Nume;
    public String Prenume;
    public Integer Varsta;

    public PersoanaSoferAbstract(String nume, String prenume, Integer varsta) {
        Nume = nume;
        Prenume = prenume;
        Varsta = varsta;
    }

    @Override
    public void ScrieCod() {

    }

    @Override
    public void RuleazaTeste() {

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
