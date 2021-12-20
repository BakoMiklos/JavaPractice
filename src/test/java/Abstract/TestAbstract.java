package Abstract;

import org.junit.Test;

public class TestAbstract {
    @Test
    public void TestAutomat(){
        PesroanaItstAbstract Alex=new PesroanaItstAbstract("Dorha","Alex",30);
        Alex.ScrieCod();
        Alex.RuleazaTeste();
        PersoanaSoferAbstract ToTy=new PersoanaSoferAbstract("Bako","Miklos",36);
        ToTy.Conduce();
        ToTy.Descarca();
        PersoanaItstSoferAbstract Andrei=new PersoanaItstSoferAbstract("Pop","Andrei",28);
        Andrei.RuleazaTeste();
        Andrei.ScrieCod();
        Andrei.Conduce();
        Andrei.Descarca();
    }
}
