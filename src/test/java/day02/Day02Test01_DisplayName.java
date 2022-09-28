package day02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Day02Test01_DisplayName {

    @Test
    @DisplayName("test parseInt() to chek if it is throwing for non-digit value")//metot ismini uzun yazmaktansa bu annotation ile açıklama yazabiliriz ve çıktıda bu görünür
    void testException(){//bu isim genel oldu. test_parseIn_if_it_is_throwing...bla bla şeklinde isim koymak lazım  bu da zor
        String str = "Merhaba";//int'e çevirmeye çalışırsak numberFormatException atar
        assertThrows(NumberFormatException.class,()->{Integer.parseInt(str);});//dolayısı ile test geçer
    }


}
