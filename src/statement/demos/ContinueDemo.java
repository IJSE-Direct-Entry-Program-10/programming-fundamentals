package statement.demos;

import java.util.Scanner;

public class ContinueDemo {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter your contact number: ");
        var contact = scanner.nextLine();

        if (contact.length() != 11 || contact.charAt(3) != '-'){
            System.out.println("Invalid contact number");
        }else{
            char[] chars = contact.toCharArray();
            boolean validContact = true;
            for (int i = 0; i < chars.length; i++) {
                if (i == 3) continue;
                char c = chars[i];
                validContact = validContact && Character.isDigit(c);
            }
            if (validContact){
                System.out.println("Valid Contact Number");
            }else{
                System.out.println("Invalid Contact Number");
            }
        }
    }
}
