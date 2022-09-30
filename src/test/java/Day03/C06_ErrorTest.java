package Day03;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class C06_ErrorTest {
    @Test
    void test(){//hata fırlattığı önemli değil. bu metod çağırıldıysa geçecek
        //ErrorRonner clasında diveide metodu 5 ve 0 parametrelei ile hata fırlatırken aynı metodu mocklanan
        //obje üzerinden çaırdığımızda hata fırlatmaz. Obje sahte olduğu için metod gerçekten çalışmaz
        C06_Error testObj = Mockito.mock(C06_Error.class);
        testObj.divide(5,0);
    }
}
