package operators;

public class Operators3 {

    public static void main(String[] args) {

        int x = 10;
        // x = x + 1;
        // x += 1;
        // x = x * 5;
        // x *= 5;

        // x = x + ++x;
        // x += ++x;

        // x = x + (++x * 2)
        // x += (++x * 2);

        // System.out.println(x);

        int a = 5;
        int b = 2;
        int result = 120;

        a += a++ + b + --b + ~a + a * b + 10;
        System.out.printf("a=%s, b=%s\n", a, b);

        b = (a > (a + ++b)) ? a++ : (b = b + 10) + ++b;
        System.out.printf("a=%s, b=%s\n", a, b);

        result %= ((a++ + ++b) * 2);

        System.out.println(result);
    }
}
