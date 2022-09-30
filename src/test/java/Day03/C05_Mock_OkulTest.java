package Day03;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class C05_Mock_OkulTest {

    @Test
    void testIslemler(){
        C05_Mock_Islemler  dummyObject = Mockito.mock(C05_Mock_Islemler.class);  //mockitodan gösterdik...artık C05_Mock_Islemler türünde fake bi objemiz var
        dummyObject.ekleOgrenci("Ahmet");
        dummyObject.guncelleOgrenci("Mehmet");
        dummyObject.silOgrenci("çiçek abbas");//zaten fake olduğu için parametreyi istediğimizi yazdık

        //test burada başlıyor... acaba metodlar çağırıldı mı?
        verify(dummyObject).ekleOgrenci("Ahmet");//test geçti... yani bu metodlar çağırılmış
        verify(dummyObject).guncelleOgrenci("Mehmet");//bu metod gerçekte doğru çalışıp çalışmadığı umurumuzda değil burada sadece çağırıldımı ona baktık
        verify(dummyObject).silOgrenci("çiçek abbas");


    }

    //methodlar kaç kere çağırıldığını test edelim.
    @Test
    void testKacKereCagirildi(){
        C05_Mock_Islemler  dummyObject2 = Mockito.mock(C05_Mock_Islemler.class);
        dummyObject2.ekleOgrenci("Ahmet");
        dummyObject2.ekleOgrenci("Ahmet");
        dummyObject2.ekleOgrenci("Mehmet");
        //toplamda 3 kere ekle metodunu çağırmış olduk...
        //acaba ahmet parametresi ile ekleme metodu 2 defa çaığıldımı bunu test edelim
        verify(dummyObject2,times(2)).ekleOgrenci("Ahmet");//2 defa çağırıldı ise test geçer.
        verify(dummyObject2,times(0)).ekleOgrenci("Buse");//Ekle metodunu buse parametresi ile çağırılıp çağırılmadığını test ediyoruz
        verify(dummyObject2,times(1)).ekleOgrenci("Mehmet");//mehmet 1 kere mi çağırıldı ekle metodunda? evet...passed
        verify(dummyObject2,never()).silOgrenci(anyString());//herhangi bir parametre ile hiç çağrılmayan metodu test etmek istersek
        verify(dummyObject2,atLeast(2)).ekleOgrenci("Ahmet");//metodun en az 2 defa çağırıldığını test etmek istiyorsak atMost()'da da ençok 'a bakıyoruz



    }

    @Test
    void testSirasiniKontrolEt() {
        C05_Mock_Islemler dummyObject2 = Mockito.mock(C05_Mock_Islemler.class);

        dummyObject2.ekleOgrenci("Ahmet");
        dummyObject2.ekleOgrenci("Hüseyin");
        dummyObject2.silOgrenci("Ahmet");

        InOrder inOrder = inOrder(dummyObject2);
        inOrder.verify(dummyObject2).ekleOgrenci("Ahmet");
        inOrder.verify(dummyObject2).ekleOgrenci("Hüseyin");
        inOrder.verify(dummyObject2).silOgrenci("Ahmet");

    }

    @Test
    void testSiralama(){//metodların çağırılma sırasını test etmek için
        C05_Mock_Islemler dummyObject3 = Mockito.mock(C05_Mock_Islemler.class);
        dummyObject3.ekleOgrenci("Ahmet");
        dummyObject3.ekleOgrenci("Mehmet");
        dummyObject3.silOgrenci("Ahmet");
        //InOrder class'ını sıralama için kullanıyoruz

        InOrder inOrder = inOrder(dummyObject3);
        inOrder.verify(dummyObject3).ekleOgrenci("Ahmet");
        inOrder.verify(dummyObject3).ekleOgrenci("Mehmet");
        inOrder.verify(dummyObject3).silOgrenci("Ahmet");
    }


}
