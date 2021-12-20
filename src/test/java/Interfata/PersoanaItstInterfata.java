package Interfata;

public class PersoanaItstInterfata extends PersoanaInterfata implements Itst{
    public PersoanaItstInterfata(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void scrieCod() {
        System.out.println(getNume()+" "+getPrenume()+" in varsta de "+getVarsta()+" scrie cod. ");
    }

    @Override
    public void ruleazaTesteAutomate() {
        System.out.println(getNume()+" "+getPrenume()+" in varsta de "+getVarsta()+" ruleaza teste automate. ");
    }
}
