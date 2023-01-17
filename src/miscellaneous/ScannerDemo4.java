package miscellaneous;

import java.util.Scanner;

public class ScannerDemo4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int[] marks = new int[5];
        System.out.print("Enter your marks (split via ,): ");
        scanner.useDelimiter(",");
        marks[0] = scanner.nextInt();
        marks[1] = scanner.nextInt();
        marks[2] = scanner.nextInt();
        marks[3] = scanner.nextInt();
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

        scanner.useDelimiter("");
        System.out.println(scanner.next());
        System.out.println(scanner.nextLine());

//        scanner.useDelimiter("");
//        scanner.next();
//        marks[4] = Integer.parseInt(scanner.nextLine());
//        int total = marks[0] + marks[1] + marks[2] + marks[3] + marks[4];
//        double avgMarks = total / marks.length;
//        System.out.println("Total marks: " + total);
//        System.out.println("Avg. marks: " + avgMarks);
    }
}
