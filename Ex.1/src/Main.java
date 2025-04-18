
public class Main {
    public static void main(String[] args) {

        NoGenericMethods ngm1 = new NoGenericMethods("First", "Second", "Third");
        System.out.println(ngm1.getObj1() + ", " + ngm1.getObj2() + ", " + ngm1.getObj3());

        NoGenericMethods ngm2 = new NoGenericMethods("Third", "First", "Second");
        System.out.println(ngm2.getObj1() + ", " + ngm2.getObj2() + ", " + ngm2.getObj3());

        NoGenericMethods ngm3 = new NoGenericMethods("Second", "Third", "First");
        System.out.println(ngm3.getObj1() + ", " + ngm3.getObj2() + ", " + ngm3.getObj3());

        // Also testing with Doubles
        NoGenericMethods ngm4 = new NoGenericMethods(1.1, 2.2, 3.3);
        System.out.println(ngm4.getObj1() + ", " + ngm4.getObj2() + ", " + ngm4.getObj3());

        NoGenericMethods ngm5 = new NoGenericMethods(3.3, 1.1, 2.2);
        System.out.println(ngm5.getObj1() + ", " + ngm5.getObj2() + ", " + ngm5.getObj3());
    }
}
