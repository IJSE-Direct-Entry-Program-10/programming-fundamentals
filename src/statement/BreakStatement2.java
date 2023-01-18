package statement;

import java.util.Scanner;

public class BreakStatement2 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter the day: ");
        String day = scanner.nextLine();

        switch (day.trim().toUpperCase()){
            default:
                System.out.println("You entered invalid day");
                break;
            case "MONDAY":{
                System.out.println("You entered Monday");
                break;
            }
            case "TUESDAY":
                abc:{
                {
                    System.out.println("A. You entered Tuesday");
                }
                {
                    System.out.println("B. Just before the inside block");
                    inside:
                    {
                        System.out.println("C. Within the inside block");
                        {
                            if (true) break inside;
                        }
                        System.out.println("D. Within the inside block");
                    }
                    System.out.println("E. Just after the inside block");
                }
                    System.out.println("F. End of the Tuesday case");
            }
            case "WEDNESDAY":
                System.out.println("You entered Wednesday");
                break;
            case "THURSDAY":
                System.out.println("You entered Thursday");
                break;
            case "FRIDAY":
                System.out.println("You entered Friday");
                break;
            case "SATURDAY":
                System.out.println("You entered Saturday");
                break;
            case "SUNDAY":
                System.out.println("You entered Sunday");
        }
        System.out.println("After the Switch Statement");
    }
}
