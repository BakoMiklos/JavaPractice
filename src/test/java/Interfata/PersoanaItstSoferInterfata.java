package Interfata;

public class PersoanaItstSoferInterfata extends PersoanaInterfata implements Itst,Sofer{
    public PersoanaItstSoferInterfata(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void scrieCod() {
        System.out.println(getNume()+" "+getPrenume()+" in varsta de "+getVarsta()+" scrie cod.");
    }

    @Override
    public void ruleazaTesteAutomate() {
        System.out.println(getNume()+" "+getPrenume()+" in varsta de "+getVarsta()+" ruleaza teste automate.");
    }

    @Override
    public void conduce() {
        System.out.println(getNume()+" "+getPrenume()+" in varsta de "+getVarsta()+" conduce.");
    }

    @Override
    public void descarca() {
        System.out.println(getNume()+" "+getPrenume()+" in varsta de "+getVarsta()+" descarca.");
    }
}
