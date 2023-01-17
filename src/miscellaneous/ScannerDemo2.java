package miscellaneous;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("====== STUDENT MANAGEMENT SYSTEM ======");
        System.out.println("=======================================");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your contact number: ");
        String contact = scanner.nextLine();
        System.out.print("Enter your batch no: ");
        int batchNumber = scanner.nextInt();
        System.out.println();

        //System.out.println("Welcome " + name + " (" + contact + ") to batch " + batchNumber);
        System.out.printf("Welcome %s (%s) to batch %s", name, contact, batchNumber);
    }
}
