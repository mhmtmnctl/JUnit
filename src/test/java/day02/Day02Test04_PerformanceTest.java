package day02;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Day02Test04_PerformanceTest {
    //testin belli bir süre içerisinde bitmsini istiyoruz. örneğin max 2sn içinde sonuç vermeli
    //yazdığımız metod sonsuz döngüye giriyorsa süre kısıtlaması koyarsak sonsuz döngüye girdiğini anlıyoruz.

    @Test
    void testPrintPerformans(){

        assertTimeout(Duration.ofSeconds(3),()-> IntStream.rangeClosed(1,100000).forEach(System.out::println));//1-100.000 arası sayıların akışını aldım
        //3sn de bitmesini söyledik
        //2 parametre alıyor, ilki saniye, ikincisi lambdadan akış verdik
    }

    //2.örnek
    @Test
    void testPrintPerformans2(){
        assertTimeout(Duration.ofSeconds(1),()->IntStream.rangeClosed(1,50000).reduce((x,y)->Math.addExact(x,y)));
        //
    }

}
