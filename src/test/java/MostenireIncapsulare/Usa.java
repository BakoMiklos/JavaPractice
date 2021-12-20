package MostenireIncapsulare;

import java.util.List;

public class Usa {


    //mostenire = conceptul prin care o clasa mosteneste o alta clasa
    //clasa care este mostenita se numeste clasa parinte
    //clasa care mosteneste se numeste clasa copil
    //se foloseste cuvantul cheie "extends"
    //in java putem mosteni o singura clasa !
    //in momentul in care o clasa mosteneste pe alta rezulta poate folosi toate atributele si metodele
    //din aceasta daca sunt publice
    //incapsulare=conceptul prin care putem tine departe de mediu inconjutrator niste informatii esentiale
    //acces control private=vizibile doar in clasa in care le ai declarat



    private String tipUsa;
    private String culoare;
    private String deschidere;
    private String dimensiuni;
    private Integer pret;

    public Usa(String tipUsa, String culoare, String deschidere, String dimensiuni, Integer pret) {
        this.tipUsa = tipUsa;
        this.culoare = culoare;
        this.deschidere = deschidere;
        this.dimensiuni = dimensiuni;
        this.pret = pret;
    }

    public String getTipUsa() {
        return tipUsa;
    }

    public void setTipUsa(String tipUsa) {
        this.tipUsa = tipUsa;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public String getDeschidere() {
        return deschidere;
    }

    public void setDeschidere(String deschidere) {
        this.deschidere = deschidere;
    }

    public String getDimensiuni() {
        return dimensiuni;
    }

    public void setDimensiuni(String dimensiuni) {
        this.dimensiuni = dimensiuni;
    }

    public Integer getPret() {
        return pret;
    }

    @Override
    public String toString() {
        return "Usa{" +
                "tipUsa='" + getTipUsa() + '\'' +
                ", culoare='" + getCuloare() + '\'' +
                ", deschidere='" + getDeschidere() + '\'' +
                ", dimensiuni='" + getDimensiuni() + '\'' +
                ", pret=" + getPret() +
                '}';
    }
}
