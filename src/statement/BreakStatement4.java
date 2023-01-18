package statement;

public class BreakStatement4 {

    public static void main(String[] args) {
        loop1:
        for (int i = 0; i < 6; i++) {
            loop2:
            for (int k = 0; k < 6; k++) {
                if (i==3 && k == 3) continue;
                System.out.print("+ ");
                //if (i == 3 && k == 3) break;
            }
            System.out.println();
        }

    }
}
