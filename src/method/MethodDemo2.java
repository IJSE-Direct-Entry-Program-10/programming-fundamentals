package method;

import java.util.Scanner;

public class MethodDemo2 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        var name = scanner.nextLine();

        int totalMarks = 0;
        for (String subject : new String[]{"pf", "dbms", "oop"}) {
            totalMarks += requestMarks(subject);
        }

        System.out.println(name + "'s Total Marks=" + totalMarks);
        System.out.println(name + "'s Avg. Marks=" + (totalMarks) / 3.0);
    }

    public static int requestMarks(String subject) {
        var scanner = new Scanner(System.in);
        String input;
        boolean validInput;
        do {
            System.out.printf("Enter marks for %s: ", subject);
            input = scanner.nextLine();
            validInput = isValidMarks(input);
            if (!validInput) System.out.println("Invalid marks, try again!");
        } while (!validInput);
        return Integer.parseInt(input);
    }

    public static boolean isValidMarks(String input) {
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (!Character.isDigit(c)) return false;
        }
        int marks = Integer.parseInt(input);
        return marks >= 0 && marks <= 100;
    }

}
