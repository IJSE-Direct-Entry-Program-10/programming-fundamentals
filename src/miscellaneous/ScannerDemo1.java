package miscellaneous;

import java.util.Scanner;

public class ScannerDemo1 {

    public static strictfp void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
        scanner.useDelimiter(";");
        String token1 = scanner.next();
        System.out.println(token1);
        String token2 = scanner.nextLine();
        System.out.println(token2);
    }
}
