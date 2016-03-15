
public class MacJni {

    public native void sayHello();

    static {
        System.loadLibrary("macjni");
    }

    public static void main(String[] args) {
        MacJni macJni = new MacJni();
        macJni.sayHello();

    }
}