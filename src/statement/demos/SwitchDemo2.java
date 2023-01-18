package statement.demos;

import java.util.Scanner;

public class SwitchDemo2 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter the month: ");
        String month = scanner.nextLine();

        int days = 0;
        switch (month.toLowerCase()){
            case "12": case "dec": case "december":
                days = 31;
            case "11": case "nov": case "november":
                days += 30;
            case "10": case "oct": case "october":
                days += 31;
            case "9": case "sep": case "september":
                days += 30;
            case "8": case "aug": case "august":
                days += 31;
            case "7": case "jul": case "july":
                days += 31;
            case "6": case "jun": case "june":
                days += 30;
            case "5": case "may":
                days += 31;
            case "4": case "apr": case "april":
                days += 30;
            case "3": case "mar": case "march":
                days += 31;
            case "2": case "feb": case "february":
                days += 28;
            case "1": case "jan": case "january":
                days += 31;
                System.out.printf("Total number of days: %s\n", days);
                break;
            default:
                System.out.println("Invalid month");
        }
    }
}
