package method;

public class Recursions {

    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("IJSE");
//        }
        printIJSE(0);
        System.out.println("Abc");
    }

    public static void printIJSE(int iteration){
        if (iteration == 3) return;
        System.out.println("IJSE");
        printIJSE(++iteration);
        //System.out.println(iteration);
    }
}
