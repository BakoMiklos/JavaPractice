package Interfata;

public class PersoanaInterfata {
    private String Nume;
    private String Prenume;
    private Integer Varsta;

    public PersoanaInterfata(String nume, String prenume, Integer varsta) {
        Nume = nume;
        Prenume = prenume;
        Varsta = varsta;
    }

    public String getNume() {
        return Nume;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public String getPrenume() {
        return Prenume;
    }

    public void setPrenume(String prenume) {
        Prenume = prenume;
    }

    public Integer getVarsta() {
        return Varsta;
    }

    public void setVarsta(Integer varsta) {
        Varsta = varsta;
    }


}
