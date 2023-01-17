package type_system;

public class TypeSystem4 {

    public static void main(String[] args) {
        boolean myBoolean = false;
        byte myByte = 10;
        short myShort = 20;
        char myChar = 'A';
        int myInt = 40;
        long myLong = 50;
        float myFloat = 10;
        double myDouble = 20;

        String myString = myBoolean + "";
        System.out.println(myString);
        myString = myByte + "";
        System.out.println(myString);
        myString = myShort + "";
        System.out.println(myString);
        myString = myChar + "";
        System.out.println(myString);
        myString = myInt + "";
        System.out.println(myString);
        myString = myLong + "";
        System.out.println(myString);
        myString = myFloat + "";
        System.out.println(myString);
        myString = myDouble + "";
        System.out.println(myString);
    }
}
