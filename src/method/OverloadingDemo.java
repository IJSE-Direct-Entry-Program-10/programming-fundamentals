package method;

import java.util.ArrayList;

public class OverloadingDemo {

    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(5);
//        numbers.add(4);
//        numbers.add(3);
//        numbers.add(2);
//        numbers.add(1);
//
//        numbers.remove(1);
//
//        System.out.println(numbers);

        Integer i = 10;
        myMethod(i);
    }

    public static void myMethod(Byte number){
        System.out.println("Reference");
    }

    public static void myMethod(short number){
        System.out.println("Primitive");
    }

    public static void myMethod(long number){
        System.out.println("Primitive");
    }

    public static void myMethod(int... number){
        System.out.println("Var args");
    }
}
