package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Day01Test05_TestingExceptions {
    //test ettiğimiz metodun, bekediğimiz exception fırlattı mı?

    @Test
    public void testException(){//nullPointer fırlatmadığı için kaldı
        String str = "Merhaba Dünya";
        assertThrows(NullPointerException.class,()->{//ikinci parametre olarak lambda verdik
            System.out.println("testException is run");
            str.length();//içinde bişey olsun diye yazdık. amaç içinde bişeyler olsun
        });
    }

    //bölme işlemi için exception kontrolü
    @Test
    public void testException2(){//aritmetik exception fırlatacağı için test geçiyor
        int sayi1=1;
        int sayi2=0;
        //exception'ın parentı da yazılabilir. : RunTimeException
        assertThrows(ArithmeticException.class,()->{
            System.out.println(sayi1/sayi2);
        });
    }

    //yukardaki soruyu method ekleyerek yapalım
    @Test
    void testException3(){//aritmetik exception fırlattığı için geçti
        int sayi1=1;
        int sayi2=0;
        assertThrows(ArithmeticException.class,()->{//aşağıdaki divide metodunu test edelm
            divide(sayi1,sayi2);
        });

    }
    private int divide (int a,int b){//bu metodu yukardaki 3 te kullancaz. bunu test etcez

        return a/b;
    }






}
