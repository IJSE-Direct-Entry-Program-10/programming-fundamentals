public class TypeSystem6 {

    public static void main(String[] args) {
        boolean myBoolean = false;
        byte myByte = 10;
        short myShort = 20;
        char myChar = 'A';
        int myInt = 40;
        long myLong = 50;
        float myFloat = 10;
        double myDouble = 20;

        // Java 11
        String myString = Boolean.toString(myBoolean);
        System.out.println(myString);
        myString = Byte.toString(myByte);
        System.out.println(myString);
        myString = Short.toString(myShort);
        System.out.println(myString);
        myString = Character.toString(myChar);
        System.out.println(myString);
        myString = Integer.toString(myInt);
        System.out.println(myString);
        myString = Long.toString(myLong);
        System.out.println(myString);
        myString = Float.toString(myFloat);
        System.out.println(myString);
        myString = Double.toString(myDouble);
        System.out.println(myString);
    }
}
