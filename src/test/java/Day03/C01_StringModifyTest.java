package Day03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C01_StringModifyTest {
    C01_StringModifiy strModifier;//before each ve after each kullanmak için atama yapmadık


    @BeforeEach
    void setUp(){
        strModifier = new C01_StringModifiy(); // burada oluşturduk çünkü aftereach ile silcez.
        System.out.println("beforeEach çalıştı");
    }

    @AfterEach
    void tearDown(){
        strModifier=null;
        System.out.println("afterEach çalıştı");
    }

    @ParameterizedTest
    @CsvSource(value = {"BC,AABC","BC,ABC","BC,BAC"})
    void deleteAIfITIsInFirstIntoPositionTest (String expected,String param){
        assertEquals(expected,strModifier.deleteAIfITIsInFirstIntoPosition(param));//test edeceğimiz metodu yazdık. içinede paramı verdik
    }

}
