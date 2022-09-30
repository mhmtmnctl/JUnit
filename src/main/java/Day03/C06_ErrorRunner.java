package Day03;

public class C06_ErrorRunner {
    public static void main(String[] args) {
        //divide metodu 5 ve 0 parametreleri ile çağırınca exception fırlatır
        C06_Error obj = new C06_Error();
        obj.divide(5,0);
    }
}
