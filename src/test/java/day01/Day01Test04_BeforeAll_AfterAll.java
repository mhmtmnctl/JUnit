package day01;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Day01Test04_BeforeAll_AfterAll {
    //her seferinde before each after each yapmak mantıklı değil
    //45 kişi anahtar kilit örneği

    @BeforeAll
    static void beforeAll(TestInfo info){//statik olması şart değil ama dosya okuma olduğu için static yaptık.aslında dosya okuma da yok da varmış gibi düşündük
        System.out.println(info.getDisplayName()+" open a file");
    }

    @AfterAll
    static void afterAll(TestInfo info){
        System.out.println(info.getDisplayName()+" close a file");
    }

    @Test
    void testWithArrays(TestInfo info){
        String str = "Unit test with JUnit";
        String[] anlikDeger = str.split(" ");
        String[] beklenenDeger = {"Unit","test","with","JUnit"};
        System.out.println(info.getDisplayName()+" çalıştı");

        assertArrayEquals(beklenenDeger,anlikDeger);//bu metod is dizileri kontrol edebiliyor
    }

}
