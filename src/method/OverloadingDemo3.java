package method;

public class OverloadingDemo3 {

    public static void main(String[] args) {
        byte x = 10;
        short y = 15;
        float z = 10.0f;
         myMethod(x,y,z);
    }

    public static void myMethod(int x, short y, float z){
        System.out.println("A. myMethod(int, short, double)");
    }

    public static void myMethod(long x, int y, float f){
        System.out.println("B. myMethod(long, int, float)");
    }

    public static void myMethod(long x, short y, float f){
        System.out.println("C. myMethod(long, int, float)");
    }

//    public static void myMethod(short x, int y, double d){
//        System.out.println("C. myMethod(short, int, double)");
//    }
//
//    public static void myMethod(int x, long y, double d){
//        System.out.println("D. myMethod(int, long, double)");
//    }
}
