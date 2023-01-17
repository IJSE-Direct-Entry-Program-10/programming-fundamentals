public class LoopDemo7 {

    public static void main(String[] args) {

        var i = 0;
        while (i < 12) {
            var k = 0;
            while (k <= (i < 6 ? i : (12 - i))) {
                System.out.print("❌ ");
                k++;
            }
            i++;
            System.out.println();
        }
    }
}
