package statement.demos;

public class WhileDemo2 {

    public static void main(String[] args) {

        var k = 0;
        while (k < 6) {
            var i = 0;
            while (i < (6 - k)) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            k++;
        }

    }
}
