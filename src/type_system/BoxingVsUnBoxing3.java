package type_system;

public class BoxingVsUnBoxing3 {

    public static void main(String[] args) {
        Integer i = 10; // Auto-Boxing

        Character c = 10;
        Short s = 10;
        Byte b = 10;

        // Failed to auto-box
//        Long l = 10;
//        Float f = 10;
//        Double d = 10;

//        Long l = 10L;
//        Float f = 10L;
//        Double d = 10L;

//        Integer i2 = c;
//        Integer i3 = s;
//        Integer i4 = b;

//        short s2 = 10;
//        int i2 = s2;

//        Short s2 = 10;
//        Integer i2 = s2;

        Short s2 = 10;
        int i2 = s2;
        long l = s2;

        Number n = 10;
        Object o = 10;
        //Character c5 = new Integer(50);
    }
}
