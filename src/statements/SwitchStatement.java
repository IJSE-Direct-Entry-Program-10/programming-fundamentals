package statements;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        char grade = scanner.nextLine().charAt(0);

        switch (grade){
            default:
                System.out.println("Invalid grade!");
                break;
            case 'A':
            case 'a':
                System.out.println("A Pass !");
                break;
            case 'B':
            case 'b':
                System.out.println("B Pass !");
                break;
            case 'C':
            case 'c':
                System.out.println("C Pass !");
                break;
            case 'S':
            case 's':
                System.out.println("S Pass !");
                break;
            case 'F':
            case 'f':
                System.out.println("You are fail");
                break;
        }

//        if (grade == 'A' || grade == 'a') {
//            System.out.println("A Pass !");
//        }else if (grade == 'B' || grade == 'b'){
//            System.out.println("B Pass !");
//        }else if (grade == 'C' || grade == 'c'){
//            System.out.println("C Pass !");
//        }else if(grade == 'S' || grade == 's'){
//            System.out.println("S Pass !");
//        }else if(grade == 'F' || grade == 'f'){
//            System.out.println("You are fail!");
//        }else {
//            System.out.println("Invalid grade!");
//        }


    }
}
