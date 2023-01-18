package statement;

public class BreakStatement1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration start: " + i);

//            if (i == 3) continue;
            if (i == 3) break;

            System.out.println("Iteration end: " + i);
        }
        System.out.println("After the for loop");
    }
}
