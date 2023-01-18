package statement.demos;

import java.util.Scanner;

public class DoDemo {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int input = 0;

//        while (input <= 0){
//            System.out.print("Enter a positive number: ");
//            input = scanner.nextInt();
//            if (input <= 0){
//                System.out.println("Invalid number, try again!");
//            }
//        }
//        System.out.println("Number: " + input);

        do {
            System.out.print("Enter a positive number: ");
            input = scanner.nextInt();
            if (input <= 0) System.out.println("Invalid number, try again!");
        } while (input <= 0);
        System.out.println("Number: " + input);

    }
}
