package statements;

import java.util.Scanner;

public class IfVsSwitch {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter month: ");
        String month = scanner.nextLine();

//        if (month.equals("Jan")){
//            System.out.println("Num of days in January month: " + 31);
//        }

        switch (month){
            case "Jan":
                System.out.println("Num of days in January month: " + 31);
                break;
        }


    }
}
