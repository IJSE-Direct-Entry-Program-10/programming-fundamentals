package statement.demos;

import java.util.Scanner;

public class WhileDemoInNuts {

    public static void main(String[] args) {
        String[][] customerInfo = new String[3][3];
        var scanner = new Scanner(System.in);
        var customerIndex = 0;

        while (customerIndex < 3) {
            System.out.printf("Enter Customer-%s Details \n", (customerIndex + 1));
            System.out.println("-------------------------");

            var validId = false;
            String customerId = null;

            while (!validId) {
                System.out.print("Customer ID: ");
                customerId = scanner.nextLine().trim();

    //            validId = customerId.matches("C\\d{3}");
                char[] chars = customerId.toCharArray();
                validId = (chars.length == 4 && chars[0] == 'C');

                var i = 1;
                while (i < 4 && (validId = validId && Character.isDigit(chars[i++])));

                if (!validId) System.err.println("Invalid Customer ID, try Again");
                System.out.println();
            }
            customerInfo[customerIndex][0] = customerId;

            var validName = false;
            String customerName = null;

            while (!validName){
                System.out.print("Customer Name: ");
                customerName = scanner.nextLine().trim();

    //            validName = customerName.matches("[A-Za-z ]{3,}");
                char[] chars = customerName.toCharArray();
                validName = chars.length > 3;
                var i = 0;
                while ((validName = validName &&
                                ((Character.isLetter(chars[i]) || Character.isSpaceChar(chars[i]))))
                    && ++i < chars.length);
                if (!validName) System.err.println("Invalid name, try again!");
                System.out.println();
            }
            customerInfo[customerIndex][1] = customerName;

            var validContact = false;
            String customerContact = null;

            while (!validContact){
                System.out.print("Customer Contact: ");
                customerContact = scanner.nextLine().trim();

                validContact = customerContact.length() == 11 && customerContact.charAt(3) == '-';
                char[] chars = customerContact.replaceFirst("-", "").toCharArray();

                var i = 0;
    //            while (validContact && i < chars.length){
    //                validContact = Character.isDigit(chars[i++]);
    //            }
                while ((validContact = validContact & Character.isDigit(chars[i])) && ++i < chars.length);

                if (!validContact) System.err.println("Invalid contact, Try again!");
                System.out.println();
            }
            customerInfo[customerIndex][2] = customerContact;

            customerIndex++;
        }

        System.out.println("+------+----------------+--------------+");
        System.out.println("|  ID  |  NAME          |   CONTACT    ");
        System.out.println("+------+----------------+--------------+");
        var i = 0;
        while (i < customerInfo.length){
            System.out.printf("%s\t|%s\t\t\t|%s\t\t \n",
                    customerInfo[i][0], customerInfo[i][1], customerInfo[i][2]);
            i++;
        }
        System.out.println("+------+----------------+--------------+");
    }
}
