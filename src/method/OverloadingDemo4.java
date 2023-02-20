package method;

public class OverloadingDemo4 {

    public static void main(String[] args) {
        byte x = 10;
        short y = 20;
        int z = 30;
        float f = 10.0f;
        myMethod(y, f, f, f);
    }

    public static void myMethod(short x, float y, Number z, float d){
        System.out.println("A. myMethod(short, Short, float, double)");
    }

//    public static void myMethod(int x, float y, Double z, float d){
//        System.out.println("B. myMethod(int, float, Double, float)");
//    }

    public static void myMethod(short x, float y, Float z, float d){
        System.out.println("C. myMethod(short, Float, double, float)");
    }

//    public static void myMethod(short x, Short y, int z, float d){
//        System.out.println("D. myMethod(short, Short, int, float)");
//    }

    //    public static void myMethod(Byte x, Short y, Integer z, Float d){
//        System.out.println("E. myMethod(Byte, Short, Integer, Float)");
//    }
}
