package type_system;

public class PrimitiveConversions {

    public static void main(String[] args) {
        System.out.println("Integer (int): " + 10);
        System.out.println("Floating Point Number (double): " + 10.);

        System.out.println("Integer (long): " + 10L);
        System.out.println("Floating Point Number (float): " + 10.f);

        final byte b = 10;
        final int i = 10;
        final short s = 10;
        final char c = 10;
        final long l = 10L;

        byte b1 = i;        // [Constant + Range]
        byte b2 = s;        // [Constant + Range]
        byte b3 = c;        // [Constant + Range]
        byte b4 = 10;       // [Constant + Range]
        byte b5 = 'c';      // [Constant + Range]

        short s1 = c;        // [Constant + Range]
        short s2 = i;        // [Constant + Range]
        short s3 = 'c';      // [Constant + Range]
        short s4 = 10;       // [Constant + Range]
        short s5 = b;

        char c1 = i;        // [Constant + Range]
        char c2 = b;
        char c3 = s;
        char c4 = 10;
    }
}
