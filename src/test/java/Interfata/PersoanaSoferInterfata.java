package Interfata;

public class PersoanaSoferInterfata extends PersoanaInterfata implements Sofer{
    public PersoanaSoferInterfata(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void conduce() {
        System.out.println(getNume()+" "+getPrenume()+"in varsta de "+getVarsta()+" conduce.");
    }

    @Override
    public void descarca() {
        System.out.println(getNume()+" "+getPrenume()+"in varsta de "+getVarsta()+" descarca.");
    }
}
