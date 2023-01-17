package statements.demos;

import java.util.Scanner;

public class SwitchDemo1 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter the month: ");
        String month = scanner.nextLine();

        switch (month.toLowerCase()){
            case "1": case "jan": case "january":
                System.out.printf("Num of days in January: %s \n", 31);
                break;
            case "2": case "feb": case "february":
                System.out.printf("Num of days in February: %s \n", 28);
                break;
            case "3": case "mar": case "march":
                System.out.printf("Num of days in March: %s \n", 31);
                break;
            case "4": case "apr": case "april":
                System.out.printf("Num of days in April: %s \n", 30);
                break;
            case "5": case "may":
                System.out.printf("Num of days in May: %s \n", 31);
                break;
            case "6": case "jun": case "june":
                System.out.printf("Num of days in June: %s \n", 30);
                break;
            case "7": case "jul": case "july":
                System.out.printf("Num of days in July: %s \n", 31);
                break;
            case "8": case "aug": case "august":
                System.out.printf("Num of days in August: %s \n", 31);
                break;
            case "9": case "sep": case "september":
                System.out.printf("Num of days in September: %s \n", 30);
                break;
            case "10": case "oct": case "october":
                System.out.printf("Num of days in October: %s \n", 31);
                break;
            case "11": case "nov": case "november":
                System.out.printf("Num of days in November: %s \n", 30);
                break;
            case "12": case "dec": case "december":
                System.out.printf("Num of days in December: %s \n", 31);
                break;
            default:
                System.out.println("Invalid month");
        }
    }
}
