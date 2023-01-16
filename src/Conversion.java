public class Conversion {

    public static void main(String[] args) {
        /* Identity Conversion */
        boolean flag1 = true;
        boolean flag2 = flag1;

        /* Identity Conversion */
        int i1 = 10;
        int i2 = i1;

        /* Identity Conversion */
        double d1 = 10.2;
        double d2 = d1;

        /* Identity Conversion */
        char c1 = 'a';
        char c2 = c1;

        /* Identity Conversion */
        String str1 = "IJSE";
        String str2 = str1;

        char myChar = 'a';

        byte myByte = 10;       // Narrowing Conversion
        short myShort = 10;     // Narrowing Conversion

        int myInt = 10;         // Identity Conversion

        long myLong = 10;       // Widening Conversion
        float myFloat = 10;     // Widening Conversion
        double myDouble = 10;   // Widening Conversion
        myDouble = myLong;      // Widening Conversion
        myDouble = myInt;       // Widening Conversion
        myFloat = myLong;       // Widening Conversion
        myInt = myChar;         // Widening Conversion
        myLong = myChar;        // Widening Conversion
        myDouble = myChar;      // Widening Conversion
        myFloat = myChar;       // Widening Conversion

        double num2 = 0.3;
        double num3 = 0.2;
        double result = num2 - num3;
        System.out.println(result);

        int myInt2 = 200;
        byte myByte2 = (byte) myInt2;
        System.out.println(myByte2);
    }
}
