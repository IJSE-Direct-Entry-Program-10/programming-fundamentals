package type_system;

public class AutoBoxingInInovacations {

    /* Inovacations Context */
    public static void main(String[] args) {
       final byte b = 10;
       final short s = 10;
       final int i = 10;
       final char c = 'c';

        myMethodByte(b);
//        myMethodByte(s);
//        myMethodByte(c);
//        myMethodByte(i);

        myMethodShort(s);
//        myMethodShort(c);
//        myMethodShort(i);
//        myMethodShort(b);

        myMethodCharacter(c);
//        myMethodCharacter(b);
//        myMethodCharacter(s);
//        myMethodCharacter(i);
    }

    public static void myMethodBoolean(Boolean b) {
        System.out.println("myMethodBoolean");
    }
    public static void myMethodByte(Byte b) {
        System.out.println("myMethodByte");
    }
    public static void myMethodShort(Short s){
        System.out.println("myMethodShort");
    }
    public static void myMethodCharacter(Character c){
        System.out.println("myMethodCharacter");
    }
    public static void myMethodInteger(Integer i){
        System.out.println("myMethodInteger");
    }
    public static void myMethodLong(Long l){
        System.out.println("myMethodLong");
    }
    public static void myMethodFloat(Float f){
        System.out.println("myMethodFloat");
    }
    public static void myMethodDouble(Double d){
        System.out.println("myMethodDouble");
    }
    public static void myMethodNumber(Number n){
        System.out.println("myMethodNumber");
    }
    public static void myMethodObject(Object o){
        System.out.println("myMethodObject");
    }
}
