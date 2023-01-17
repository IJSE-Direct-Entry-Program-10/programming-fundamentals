package statements;

public class WhileStatement {

    public static void main(String[] args) {

        int x = 0;
        while (x < 5){
            System.out.println("IJSE");
            x++;
        }

//        while (true);     /* Loop with no body */
//        while (true) System.out.println("IJSE");  /* Loop with a single statement */

        // Unreachable statements
        // System.out.println("IJSE");
    }
}
