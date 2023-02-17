package type_system;

public class BoxingVsUnBoxing2 {

    // Assignment Context   (Autoboxing/Auto-unboxing)
    // Invocation Context   (Autoboxing/Auto-unboxing)
    // Numeric Context      (Auto-unboxing)

    public static void main(String[] args) {
        Integer i = 10;     // Auto boxing
        int a = i;          // Auto unboxing

        printValue(new Integer(10));    // Boxing
        printValue(10);     // Auto boxing

        printValue2(20);
        printValue2(i.intValue());  // Unboxing
        printValue2(i);             // Auto unboxing

        Integer num1 = 10;
        Integer num2 = 20;
        int result = num1.intValue() + num2.intValue() + 20;
        result = num1 + num2 + 20;  // Auto Unboxing

        Short s = 10;   // Auto boxing
        printValue3(s);
//        printValue3(10);    // Auto Boxing?
//        printValue4(10);
    }

    public static void printValue3(Short s){

    }

    public static void printValue4(Long l){

    }

    public static void printValue(Integer i){
        System.out.println("printValue: " + i);
    }

    public static void printValue2(int i){
        System.out.println("printValue2: " + i);
    }
}
