import java.util.Scanner;

public class CliApp2 {

    public static strictfp void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        var name = scanner.nextLine();
        System.out.print("Enter the marks for pf: ");
        var marks1 = scanner.nextInt();
        System.out.print("Enter the marks for dbms: ");
        var marks2 = scanner.nextInt();
        System.out.print("Enter the marks for oop: ");
        var marks3 = scanner.nextInt();
        System.out.print("Enter the marks for networking: ");
        var marks4 = scanner.nextInt();

        int totalMarks = marks1 + marks2 + marks3 + marks4;
        double avgMarks = totalMarks / 4;

        System.out.printf("%s's total marks: %s \n", name, totalMarks);
        System.out.printf("%s's avg. marks: %s", name, avgMarks);

    }
}
