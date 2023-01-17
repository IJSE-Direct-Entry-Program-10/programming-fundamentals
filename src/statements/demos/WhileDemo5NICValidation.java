package statements.demos;

import java.util.Scanner;

public class WhileDemo5NICValidation {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Enter a NIC: ");
        var nic = scanner.nextLine();

//        if (nic.isBlank()){
//            System.err.println("Invalid NIC");
//        }
//
//        nic = nic.trim();
//        if (nic.length() != 10) System.err.println("Invalid NIC");

        if (nic.isBlank() || (nic = nic.trim()).length() != 10) System.out.println("Invalid NIC");

        char[] chars = nic.toCharArray();

        boolean validNIC = true;
        var i = 0;
        while (i < (chars.length - 1) && (validNIC = Character.isDigit(chars[i++])));
        validNIC = validNIC && chars[chars.length -1] == 'V' || chars[chars.length -1] == 'v';
        if (validNIC){
            System.out.println("Valid NIC");
        }else{
            System.out.println("Invalid NIC");
        }

//        for (int i = 0; i < chars.length; i++) {
//            System.out.printf("%s: is Digit? %s \n", chars[i], Character.isDigit(chars[i]));
//            System.out.printf("%s: is Letter? %s \n", chars[i], Character.isLetter(chars[i]));
//        }
//        System.out.println(Character.isSpaceChar(' '));

    }
}
