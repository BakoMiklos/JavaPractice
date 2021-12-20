package Interfata;

import org.junit.Test;

public class InterfaceTest {
    @Test
    public void testInterfata(){
        PersoanaItstInterfata ToTy=new PersoanaItstInterfata("Bako","Miklos",36);
        ToTy.ruleazaTesteAutomate();
        ToTy.scrieCod();
        PersoanaSoferInterfata Andrei=new PersoanaSoferInterfata("Pop","Andrei",30);
        Andrei.conduce();
        Andrei.descarca();
        PersoanaItstSoferInterfata Alex=new PersoanaItstSoferInterfata("Dorha","Alex",30);
        Alex.conduce();
        Alex.descarca();
        Alex.ruleazaTesteAutomate();
        Alex.scrieCod();
    }
}
