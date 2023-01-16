public class Operators {

    public static void main(String[] args) {
        var a = 10;
        System.out.println(++a);    // 10
        System.out.println(a);      // 11

        var b = 20;
        System.out.println(--a);    // 19
        System.out.println(a);      // 19

        // a = 11, b = 19
        var c = a++ + b--;
        System.out.println(a);      // 12
        System.out.println(b);      // 18
        System.out.println(c);      // 30

        a = 10; b = 5;
        int result = a++ + b++ + b - a-- + a - b-- + ++a + a + b-- + ++b;
        System.out.println(result);

        a = 10; int x = 2, y = 5;
        result = a + x++ - y + a + y++ - --x + ++y + x + --a;
        System.out.println(result);

        System.out.println("---------------");

        a = 15;
        result = ~a + a++;
        System.out.println(result);

        b = 8;
        a = 4;
        result = b++ + ~a + ~b + a++;
        System.out.println(result);

        System.out.println("--------------");
        //result = 5 - 2 * 2;
        //System.out.println(result);

        a = 8;
        b = 2;
        c = 4;
        result = ~a + b + c++ + ~b + ++b + ~++a;
        System.out.println(result);

    }
}
