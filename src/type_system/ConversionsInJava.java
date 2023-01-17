package type_system;

public class ConversionsInJava {

    public static void main(String[] args) {
        /* Identity type_system.Conversion */
        boolean flag1 = true;
        boolean flag2 = flag1;

        /* Identity type_system.Conversion */
        int i1 = 10;
        int i2 = i1;

        /* Identity type_system.Conversion */
        double d1 = 10.2;
        double d2 = d1;

        /* Identity type_system.Conversion */
        char c1 = 'a';
        char c2 = c1;

        /* Identity type_system.Conversion */
        String str1 = "IJSE";
        String str2 = str1;

        char myChar = 'a';

        byte myByte = 10;       // Narrowing type_system.Conversion
        short myShort = 10;     // Narrowing type_system.Conversion

        int myInt = 10;         // Identity type_system.Conversion

        long myLong = 10;       // Widening type_system.Conversion
        float myFloat = 10;     // Widening type_system.Conversion
        double myDouble = 10;   // Widening type_system.Conversion
        myDouble = myLong;      // Widening type_system.Conversion
        myDouble = myInt;       // Widening type_system.Conversion
        myFloat = myLong;       // Widening type_system.Conversion
        myInt = myChar;         // Widening type_system.Conversion
        myLong = myChar;        // Widening type_system.Conversion
        myDouble = myChar;      // Widening type_system.Conversion
        myFloat = myChar;       // Widening type_system.Conversion

        double num2 = 0.3;
        double num3 = 0.2;
        double result = num2 - num3;
        System.out.println(result);

        int myInt2 = 200;
        byte myByte2 = (byte) myInt2;
        System.out.println(myByte2);
    }
}
