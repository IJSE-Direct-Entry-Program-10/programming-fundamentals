public class TypeSystem5 {

    public static void main(String[] args) {
        boolean myBoolean = false;
        byte myByte = 10;
        short myShort = 20;
        char myChar = 'A';
        int myInt = 40;
        long myLong = 50;
        float myFloat = 10;
        double myDouble = 20;

        // Java 8
        String myString = new Boolean(myBoolean).toString();
        System.out.println(myString);
        myString = new Byte(myByte).toString();
        System.out.println(myString);
        myString = new Short(myShort).toString();
        System.out.println(myString);
        myString = new Character(myChar).toString();
        System.out.println(myString);
        myString = new Integer(myInt).toString();
        System.out.println(myString);
        myString = new Long(myLong).toString();
        System.out.println(myString);
        myString = new Float(myFloat).toString();
        System.out.println(myString);
        myString = new Double(myDouble).toString();
        System.out.println(myString);
    }
}
