package operators;

public class Operators2 {

    public static void main(String[] args) {
        int result = 10 % 3;
        System.out.println(result);

        int a = 10;
        int b = 5;
        if (a++ > 5 | b++ > 2){
            System.out.println("Working");
        }
        System.out.println(a);
        System.out.println(b);

        System.out.println("-------------");
        a = 10;
        String value = a < 5 ? "ijse" + (10 + 15) : "something" + (2 * 5);
        System.out.println(value);

        int a2 = true ? 10+15 : 15;
    }
}
