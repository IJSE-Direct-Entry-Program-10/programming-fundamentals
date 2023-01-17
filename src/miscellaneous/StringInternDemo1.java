package miscellaneous;

import java.util.Scanner;

public class StringInternDemo1 {

    public static void main(String[] args) {
        String myStr1 = "IJSE";
        String myStr2 = new String("IJSE").intern();

        boolean result = myStr1 == myStr2;
        System.out.println(result);
//        result = !myStr1.equals(myStr2);
//        System.out.println(result);

        var myScanner = new Scanner(System.in);
        //System.out.println((Object)myScanner instanceof Scanner);
        System.out.print("Enter something: ");
        var input = myScanner.nextLine();
        System.out.printf("Input=%s \n", input);

        result = myStr1 == input;
        System.out.println(result);
        System.out.println(input == myStr2);
    }
}
