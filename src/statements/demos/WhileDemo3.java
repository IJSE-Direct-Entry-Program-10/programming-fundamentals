package statements.demos;

public class WhileDemo3 {

    public static void main(String[] args) {

        var k = 0;
        while (k < 6) {
            var i = 0;
            while (i <= k) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            k++;
        }

    }
}
