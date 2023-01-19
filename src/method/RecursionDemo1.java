package method;

public class RecursionDemo1 {

    public static void main(String[] args) {
        print(0);
    }

    public static void print(int iteration){
        if (iteration == 6) return;
        printStar(0);
        System.out.println();
        print(++iteration);
    }

    public static void printStar(int iteration){
        if (iteration == 6) return;
        System.out.print("* ");
        printStar(++iteration);
    }

}
