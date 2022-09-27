import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day01Test03_BeforeEach_AfterEach {

    String str;
    @BeforeEach//teste girmeden str a değeri atıcak
    void beforeEach() {

        str="JUnit5 is better than JUnit4";
        System.out.println("beforeEach metodu çalıştı");

    }

    @AfterEach//test bittikten sonra str 'ı temizlicek
    void afterEach(){
        str =null;
        System.out.println("afterEach metodu çalıştı");
    }

    @Test
    void testArrays(TestInfo info){//hangi testin çalıştığını anlamak için TestInfo parametresi girildi
        String[] anlikDizi = str.split(" ");
        String[] beklenenDizi = {"JUnit5","is","better","than","JUnit4"};
        System.out.println(info.getDisplayName()+" çalıştı");
        assertTrue(Arrays.equals(beklenenDizi,anlikDizi));
    }


    @Test
    public void testStringLength(TestInfo info){
        int anlikDeger=str.length();
        int beklenenDeger = 28;
        assertEquals(beklenenDeger,anlikDeger);
        System.out.println(info.getDisplayName()+" çalıştı");

    }






}
