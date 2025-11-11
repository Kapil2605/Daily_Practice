package myapp;

public class TestAccess {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        System.out.println("Accessing from SAME package:");
        System.out.println("Public Var: " + obj.publicVar);
        System.out.println("Protected Var: " + obj.protectedVar);
        System.out.println("Default Var: " + obj.defaultVar);
        obj.showPrivateVar();
    }
}
