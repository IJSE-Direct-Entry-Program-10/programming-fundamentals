public class TypeSystem7 {

    public static void main(String[] args) {
        String myStr = "true";
        boolean myBool = new Boolean(myStr);    // Java 8
        System.out.println(myBool);
        myBool = Boolean.valueOf(myStr);        // Java 11
        System.out.println(myBool);

        myStr = "10";
        byte myByte = new Byte(myStr);          // Java 8
        System.out.println(myByte);
        myByte = Byte.valueOf(myStr);           // Java 11
        System.out.println(myByte);

        short myShort = new Short(myStr);       // Java 8
        System.out.println(myShort);
        myShort = Short.valueOf(myStr);         // Java 11
        System.out.println(myShort);

        int myInt = new Integer(myStr);         // Java 8
        System.out.println(myInt);
        myInt = Integer.valueOf(myStr);         // Java 11
        System.out.println(myInt);

        long myLong = new Long(myStr);          // Java 8
        System.out.println(myLong);
        myLong = Long.valueOf(myStr);           // Java 11
        System.out.println(myLong);

        myStr = "10.25";
        float myFloat = new Float(myStr);       // Java 8
        System.out.println(myFloat);
        myFloat = Float.valueOf(myFloat);       // Java 11
        System.out.println(myFloat);

        double myDouble = new Double(myStr);    // Java 8
        System.out.println(myDouble);
        myDouble = Double.valueOf(myStr);       // Java 11
        System.out.println(myDouble);

        myStr = "ijse";
        char myChar = myStr.charAt(2);
        System.out.println(myChar);
//        char myChar = Character.valueOf(myStr);
//        char myChar = Character.parse(myStr);
//        char myChar = new Character(myStr);     // Java 8
//        myChar = Character.valueOf(myStr);      // Java 11
    }
}
