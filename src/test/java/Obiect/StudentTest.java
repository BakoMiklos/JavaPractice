package Obiect;

import org.junit.Test;

import java.util.Arrays;

public class StudentTest {

    @Test
    public void TestAutomat(){
        Student Toty=new Student("Bako","Miklos",36,4.500,true, Arrays.asList("Fizica","Chimie","Desen"));
        Toty.InfoStudent();
        Toty.VerificaTaxa();

        Student Alex=new Student("Dorha","Alex",27,6.000,false,Arrays.asList("Fizica","Chimie"));
        Alex.InfoStudent();
        Alex.VerificaTaxa();

        Student Alexandru=new Student("Dorha","Alexandru",28,0.0,false,Arrays.asList("Fizica","Chimie"));
        Alexandru.VerificaTaxa();

        Student Bogdan=new Student("POp","Bogdan",28,9.000,false,Arrays.asList("Fizica","Chimie"));
        Bogdan.VerificaTaxa();

    }
}
