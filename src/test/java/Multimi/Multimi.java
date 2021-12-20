package Multimi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {
    @Test
    public void TestAutomat(){
 //      NumeArray();
       NumeList();
 //      HashMap();
 //      TariOrase();
 //       HashMap();
    }

    public  void NumeArray(){
        String[] Nume=new String[4];
        Nume[0]="Andrei";
        Nume[1]="Gheorghe";
        Nume[2]="Alina";
        Nume[3]="Alex";
        for (Integer Index=0;Index<Nume.length;Index++){
            System.out.println(Nume[Index]);
        }
    }

    public void NumeList(){
        List<String> Nume=new ArrayList<>();
        Nume.add("Andrei");
        Nume.add("Gheorghe");
        Nume.add("Alina");
        Nume.add("Alex");
        Nume.add("Toty");
        for (Integer Index=0;Index<Nume.size();Index++){
            System.out.println(Nume.get(Index));
        }
    }

    public void HashMap(){
        HashMap<String,String> Obiecte=new HashMap<>();
        Obiecte.put("Fruct","Mar");
        Obiecte.put("Leguma","Morcov");
        Obiecte.put("Haina","Bluza");

        for (String Key:Obiecte.keySet()){
            System.out.println("Cheia este "+Key);
            System.out.println("Valoarea pe baza cheii este "+Obiecte.get(Key));
        }
    }

    public void TariOrase(){
        List<String> OraseRomania=new ArrayList<>();
        OraseRomania.add("Cluj");
        OraseRomania.add("Timisoara");
        OraseRomania.add("Sibiu");

        List<String> OraseItalia=new ArrayList<>();
        OraseItalia.add("Roma");
        OraseItalia.add("Geneva");

        List<String> OraseFranta=new ArrayList<>();
        OraseFranta.add("Paris");
        OraseFranta.add("Monaco");

        HashMap<String,List<String>> TariOrase=new HashMap<>();
        TariOrase.put("Romania",OraseRomania);
        TariOrase.put("Italia",OraseItalia);
        TariOrase.put("Franta",OraseFranta);

        for (String Key:TariOrase.keySet()){
            System.out.println("Cheia este "+Key);
            System.out.println("Valoarea pe baza cheii este "+TariOrase.get(Key));
        }
    }
}