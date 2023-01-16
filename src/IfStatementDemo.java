import java.util.Scanner;

public class IfStatementDemo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        var name = scanner.nextLine();
        var age = scanner.nextInt();
        var valid = true;

        if (age <= 18) {
            System.err.println("Invalid age");
            valid = false;
        }
        if (age > 40) {
            System.err.println("Invalid age");
            valid = false;
        }
        if (valid) System.out.println("Successfully added!");

    }
}
