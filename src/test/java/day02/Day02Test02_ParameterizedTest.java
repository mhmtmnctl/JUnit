package day02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day02Test02_ParameterizedTest {
    @Test
    void testLength(){//bu şekilde yapmak iyi değil aşağıda daha iyisi var
        assertTrue("Mirac".length()>0);
        assertTrue("Tarık".length()>0);
        assertTrue("Mehmet".length()>0);
        assertTrue("Taha".length()>0);
    }
    //yukarıdaki metodu daha kolay yazmak için parametreli testler kullanırız.

    @ParameterizedTest
    @ValueSource(strings={"Mirac","Tarık","Mehmet","Taha"})//buraya kontrol edeceğimiz parametreleri giriyoruz
    void testLengt2(String str){
        assertTrue(str.length()>0);//assertTrue bir kere yazdık. yukarda 4 kere yazmıştık
    }

    @Test
    void testUpperCase(){// bu eski usüldü
        String str1="Merhaba";
        String str2="Java";
        String str3="Test";

        assertEquals("MERHABA",str1.toUpperCase());
        assertEquals("JAVA",str2.toUpperCase());
        assertEquals("TEST",str3.toUpperCase());
    }

    //yukarıdakini parametreli yapalım

    @ParameterizedTest//okunabilirlik olarak daha iyi ve iki parametre alıyorsak
    @CsvSource(value = {"MERHABA,merhaba","JAVA,java","TEST,test"})//key value mantığı ile çalışıyor.
    void testUpperCase2(String str1,String str2){//ikinci ifadeyi yani value'yi alıp upperCase yapıyor. ilk girilern değer beklenen değer,ikincisi ise anlık değer oluyor
        assertEquals(str1,str2.toUpperCase());//burada assertTrue kullanmadık
    }

    //3.örnek
    @ParameterizedTest
    @CsvSource(value = {"true,java,a","true,junit,u","false,hello,a"})//java içinde a varmı true dönüyor mu şeklinde
    void testContains(boolean b1,String str1,String str2){

        assertEquals(b1,str1.contains(str2));

    }




}
