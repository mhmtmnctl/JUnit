package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Day01Test01_Assertions {//tüm class'ı çalıştırmak istiyorsak buraya sağ tık run diyoruz

    @Test
    public void test(){//bu metodu çalıştırmak için tam buraya sağ tık run diyoruz

        //main metodu yokken nasıl çalıştı?
        //Junit içinde gömülü gelen main metodu var,onu çağırıyor.

        //Class boş olduğu için test geçti

    }
    @Test
    public void testLength(){
        String cumle ="Merhaba Dünya";//13 karakter
        int anlikDeger=cumle.length();
        int beklenenDeger=13;
     // assertEquals(beklenenDeger,anlikDeger);//iki değeri karşılaştırıyor, eşitse test geçer değilse fail
        //ilk parametre beklenen değer, ikinci parametre anlık değer olmalı

        //test hata verdiğinde mesaj vermek istiyorsak ne yapmalıyız
        assertEquals(beklenenDeger,anlikDeger,"Uzunluklar uyuşmadı");

    }
    //farklı bir örnek yapalım

    @Test
    public void testUpperCase(){

        String anlikDeger = "Merhaba".toUpperCase();
        String beklenenDeger = "MERHABA";
        assertEquals(beklenenDeger,anlikDeger,"UpperCase metodu düzgün çalışmıyor");//test fail olursa mesajı yazcak değilse yazmıycaz

    }

    //toplama işlemini test edelim
    @Test
    public void testToplama(){
        int sayi1=10;
        int sayi2=5;
        int anlikDeger = Math.addExact(sayi1,sayi2);
        int beklenenDeger = 15;
        assertEquals(beklenenDeger,anlikDeger,"addExact metodu doğru çalışmıyor");
    }

    //contains metodunu test edelim
    @Test
    public void testContains(){
        assertEquals(false,"Mirac".contains("z"));//z harfini içermediği için false gelcek ve false beklediğimiz için testi geçecek

    }














}
