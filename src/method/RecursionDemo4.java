package method;

public class RecursionDemo4 {

    public static void main(String[] args) {
        print(0, 0);
    }

    public static void print(int rows, int cols){
        if (rows == 6) return;
        if (cols == (rows + 1)) {
            System.out.println();
            print(++rows, 0);
            return;
        }
        System.out.print("* ");
        print(rows, ++cols);
    }

}
