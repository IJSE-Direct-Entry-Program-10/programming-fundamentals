package method;

public class RecursionDemo2 {

    public static void main(String[] args) {
        print(0);
    }

    public static void print(int iteration){
        if (iteration == (6 * 6)) return;
        if (iteration % 6 == 0) System.out.println();;
        System.out.print("* ");
        print(++iteration);
    }

}
