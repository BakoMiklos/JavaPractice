package MostenireIncapsulare;

public class Leroy extends Usa{

    private Integer adaos=10;

    public Leroy(String tipUsa, String culoare, String deschidere, String dimensiuni, Integer pret) {
        super(tipUsa, culoare, deschidere, dimensiuni, pret);
    }

    public Integer getAdaos() {
        return adaos;
    }

    public void CalculPretFinal(){
        Integer pretFinal = getPret()+(getPret()*getAdaos())/100;
        System.out.println("Pretul final al usii de tip:"+getTipUsa()+" "+getCuloare()+" de la Leroy este: "+pretFinal);
    }
}
