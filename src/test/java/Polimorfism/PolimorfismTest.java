package Polimorfism;

import org.junit.Test;

public class PolimorfismTest {

    @Test
    public void testAutomat(){
        StudentFF Bako=new StudentFF("Bako","Miklos",36);
        Bako.infoStudent();
        Bako.calculMedie();
        Bako.calculMedie(4.5,6.5);
        Bako.calculMedie(6,8);
        Bako.calculMedie(6.5,8.5,7.5);


    }
}
