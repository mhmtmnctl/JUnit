package Day03;

public class C05_Mock_Okul {

    C05_Mock_Islemler islemler = new C05_Mock_Islemler();

    public void islemler(){//yukarıdaki işlemler ile alaksı yok
        //bu metodu test etmek istiyoruz

        islemler.ekleOgrenci("Ahmet");//bu metod çağırıldı mı diye bakcaz sadece
        islemler.guncelleOgrenci("Mehmet");//aynı şekilde bu metod çağırılmış mı
        islemler.silOgrenci("Ahmet");

    }
}
