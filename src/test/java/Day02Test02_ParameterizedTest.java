import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day02Test02_ParameterizedTest {
    @Test
    void testLength(){
        assertTrue("Mirac".length()>0);
        assertTrue("Tarık".length()>0);
        assertTrue("Mehmet".length()>0);
        assertTrue("Taha".length()>0);
    }
    //yukarıdaki metodu daha kolay yazmak için parametreli testler kullanırız.
    //@ParameterizedTest


}
