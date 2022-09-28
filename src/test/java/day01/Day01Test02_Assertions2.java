package day01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day01Test02_Assertions2 {
    @Test
    public void testToFindMin(){
        assertTrue(Math.min(4,10)==4);//içine bir şart koycaz true ise test geçer değilse kalır
        assertFalse(Math.min(4,10)==10);//sonuç false old için testi geçer

    }

    @Test
    public void testArrays(){
        String str = "Test işlemi çok kolay";
        String[] anlikDizi= str.split(" ");
        String[] beklenenDizi= {"Test","işlemi","çok","kolay"};

        assertTrue(Arrays.equals(beklenenDizi,anlikDizi));//parantez içindeki değer boolean döndürüyor ve true old için test geçiyor


    }
}
