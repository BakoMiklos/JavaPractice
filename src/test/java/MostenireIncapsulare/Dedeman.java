package MostenireIncapsulare;

public class Dedeman extends Usa{

    private Integer adaos;

    public Dedeman(String tipUsa, String culoare, String deschidere, String dimensiuni, Integer pret,Integer adaos) {
        super(tipUsa, culoare, deschidere, dimensiuni, pret);
        this.adaos = adaos;
    }

    public Integer getAdaos() {
        return adaos;
    }

    public void CalculPretFinal(){
        Integer pretFinal = getPret()+(getPret()*getAdaos())/100;
        System.out.println("Pretul final al usii de tip:"+getTipUsa()+" de la Dedeman este: "+pretFinal);
    }
}
