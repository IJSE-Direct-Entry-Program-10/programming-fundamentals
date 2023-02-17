package type_system;

public class AutoBoxingInAssignments {

    /* Assignment Context */
    public static void main(String[] args) {
        Boolean b = true;       // Autoboxing

        byte myByte2 = 10;
        short myShort2 = 10;
        char myChar = 'a';

        Byte myByte3 = myByte2;         // Autoboxing
        Short myShort3 = myShort2;      // Autoboxing
        Character myChar3 = myChar;     // Autoboxing

        /* A narrowing primitive conversion followed by a boxing conversion  */
        Byte myByte = 10;   // int -> [byte > Byte]
        Short s = 10;       // int -> [short -> Short]
        Character c2 = 10;  // int -> [char -> Character]

//        Long l2 = 10;
//        Float f2 = 10;
//        Double d2 = 10;

        Character c = 'c';      // Autoboxing
        Integer i = 10;         // Autoboxing
        Long l = 10L;           // Autoboxing
        Float f = 10.0f;        // Autoboxing
        Double d = 10.0;        // Autoboxing

        /* a boxing conversion followed by a widening reference conversion */
        Number n1 = 10;         // [int -> Integer] -> Number
        Number n2 = 10L;        // [long -> Long] -> Number
        Number n3 = 10.0f;      // [float -> Float] -> Number
        Number n4 = 10.0;       // [double -> Double] -> Number

        Object o1 = 10;         // [int -> Integer] -> Object
        Object o2 = 10L;        // [long -> Long] -> Object
        Object o3 = 10.0f;      // [float -> Float] -> Object
        Object o4 = 10.0;       // [double -> Double] -> Object

        Object o5 = true;       // [boolean -> Boolean] -> Object
        Object o6 = 'c';        // [char -> Character] -> Object
    }
}
