import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter an integer greater than 25: ");
        int number = scanner.nextInt();
        if (number > 25) System.out.println("Integer is greater than 25");
        else if (number > 15) System.out.println("Integer is greater than 15");
        else if (number > 10) System.out.println("Integer is greater than 10");
        else if (number > 5) System.out.println("Integer is greater than 5");
        else System.out.println("Invalid number");
    }
}
