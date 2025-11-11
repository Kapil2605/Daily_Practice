import myapp.AccessDemo;

public class OutsideTest extends AccessDemo {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        System.out.println("Accessing from OUTSIDE package:");
        System.out.println("Public Var: " + obj.publicVar);

        OutsideTest test = new OutsideTest();
        System.out.println("Protected Var (via inheritance): " + test.protectedVar);
    }
}