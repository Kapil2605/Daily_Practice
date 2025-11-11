package myapp;

public class AccessDemo {
    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;
    int defaultVar = 40;

    public void showPrivateVar() {
        System.out.println("Private Variable (accessed inside class): " + privateVar);
    }
}
