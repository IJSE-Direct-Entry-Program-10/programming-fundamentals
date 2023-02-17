package type_system;

public class BoxingVsUnBoxing {

    public static void main(String[] args) {
        Integer myInt = new Integer(10);    // Boxing
        int x = 10;
        myInt = new Integer(x); // Boxing

        Integer myInt2 = 20; // new Integer(20);    -> Auto Boxing

        int y = myInt2.intValue();  // Unboxing
        int z = myInt2; // myInt2.intValue() -> Auto Unboxing
    }
}
