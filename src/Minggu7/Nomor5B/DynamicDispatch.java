package Minggu7.Nomor5B;

public class DynamicDispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A ref;

        ref = b;
        ref.callThis();
        ref = c;
        ref.callThis();
        ref = a;
        ref.callThis();
    }
}
