package statements;

public class ContinueStatement {

    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("-----------");
//            System.out.println(i + "-IJSE");
//
//            if (i == 3) continue;
//
//            System.out.println(i + "-ABC");
//        }

        label1:
        System.out.println("Nested Loops");

        forLoop:
        for (int i = 0; i < 5; i++) {
            label2:
            System.out.printf("For loop: iteration (%s) start \n", i);

            int k = 0;
            whileLoop:
            while(k++ < 3){
                if (k == 2) continue forLoop;
                System.out.printf("While loop: iteration (%s) start \n", k);
                System.out.printf("While loop: iteration (%s) end \n", k);
            }

            //if (true) continue whileLoop;
            System.out.printf("For loop: iteration (%s) end \n", i);
            System.out.println();
        }
    }
}
