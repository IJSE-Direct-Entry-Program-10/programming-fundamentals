package type_system;

public class BoxingConversions {

    public static void main(String[] args) {
        final byte b = 10;
        final int i = 10;
        final short s = 10;
        final char c = 10;
        final long l = 10L;

        Byte b1 = i;        // [Constant + Range]
        Byte b2 = s;        // [Constant + Range]
        Byte b3 = c;        // [Constant + Range]
        Byte b4 = 10;       // [Constant + Range]
        Byte b5 = 'c';      // [Constant + Range]

        Short s1 = c;        // [Constant + Range]
        Short s2 = i;        // [Constant + Range]
        Short s3 = 'c';      // [Constant + Range]
        Short s4 = 10;       // [Constant + Range]
        Short s5 = b;

        Character c1 = i;        // [Constant + Range]
        Character c2 = b;
        Character c3 = s;
        Character c4 = 10;
    }
}
