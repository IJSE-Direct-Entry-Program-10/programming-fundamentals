package miscellaneous;

import java.util.Scanner;

public class StandardStreams {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String input = scanner.nextLine();
        System.out.println("Hi! " + input);
    }
}
