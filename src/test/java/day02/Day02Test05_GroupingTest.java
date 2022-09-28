package day02;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day02Test05_GroupingTest {
    //birbiriyle ilişkili testleri gruplamak için kullanıyoruz.
    //aynı sınıfın içinde 2 parametreli test yazarak gruplamak istiyoruz.

    @Nested
    class MultiplyTest{//inner class oluşturduk

       @ParameterizedTest
       @CsvSource(value = {"-12,-4,3","-12,4,-3","12,-4,-3"})
       void testMultiplyWithNonZero(int rs,int x, int y){//rs= result gibi düşünebiliriz
           assertEquals(rs,Math.multiplyExact(x,y));
       }

       @ParameterizedTest
        @CsvSource(value = {"0,-4,0","0,4,0","0,0,4"})
        void testMultplyWithZero(int rs,int x,int y){
           assertEquals(rs,Math.multiplyExact(x,y));
       }
    }
    //1.grup testin sonu....
    //aşağısı 2.grup testler olcak

    @Nested
    class AddTest{
        @ParameterizedTest
        @CsvSource(value = {"-1,-4,3","1,4,-3","-7,-4,-3"})
        void testAddWithNonZero(int rs,int x ,int y){//parametreler içinde 0 yoksa
            assertEquals(rs,Math.addExact(x,y));
        }


        @ParameterizedTest
        @CsvSource(value = {"9,0,9","2,2,0","4,4,0"})
        void testAddWithZero(int rs,int x,int y){
            assertEquals(rs,Math.addExact(x,y));
        }
    }
    //2.grup testin sonu




}
