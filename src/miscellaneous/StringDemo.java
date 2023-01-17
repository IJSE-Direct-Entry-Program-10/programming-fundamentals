package miscellaneous;

import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {
//        var name = "ijse";
//        var uName = name.toUpperCase().intern();
//        System.out.println(name);
//        System.out.println(uName);
//        System.out.println(uName == "IJSE");
//
//        var nums = new int[5];
//        System.out.println(nums);
//        System.out.println(nums.toString());
//
//        var scanner = new Scanner(System.in);
//        System.out.print("Enter something: ");
//        var something = scanner.nextLine();
//
//        System.out.printf("Inputted text: %s \n", something);
//        System.out.printf("Inputted text: %s \n", something.toString());
//        System.out.printf("Inputted text length: %s \n", something.length());  // num of characters
//        System.out.printf("3rd character: %s \n", something.charAt(2));
//        System.out.printf("Inputted text to lower case: %s \n", something.toLowerCase());
//        System.out.printf("Inputted text to upper case: %s \n", something.toUpperCase());
//        System.out.printf("Trimmed text: %s \n", something.trim());

//        String something = "              ";
//        System.out.println(something.isEmpty());    // false
//        System.out.println(something.isBlank());    // true
//        System.out.println(something.trim().isEmpty());     // true
//        System.out.println(something.trim().isBlank());     // true
//        System.out.println(something.length());
//        System.out.println("isBlank?: " + something.isBlank());
//        System.out.println("isEmpty?: " + something.isEmpty());

        var something = "Hi! We are DEP-10";
        String extracted1 = something.substring(4);
        System.out.println(extracted1);
        System.out.println(something.substring(0,1));

        something = "Monday,    Tuesday, Wednesday    , Thursday,         Friday   ";
        String[] splits = something.split(",");
        System.out.println(splits[0] = splits[0].trim());
        System.out.println(splits[1] = splits[1].trim());   // ?
        System.out.println(splits[2] = splits[2].trim());
        System.out.println(splits[3].trim());
        System.out.println(splits[2] = (splits[1]=splits[4].trim()));   // Friday

        System.out.println("-----------------");
        System.out.println(splits[2]);
        System.out.println(splits[1]);
        System.out.println(splits[4]);

        System.out.println("-------------------");
        System.out.println("Is saturday within the something var. ? " + something.contains("Saturday"));
        System.out.println("Is Friday within the something var. ? " + something.contains("Friday"));
        System.out.println("Is Monday within the something var. ? " +
                something.toLowerCase().contains("tuesday"));

        System.out.println(something.indexOf("Mo"));

        something = "We are from DEP-10. We are born to code! We like codes!";
        System.out.println(something.indexOf("We"));
        System.out.println(something.lastIndexOf("We"));

        System.out.println(something.indexOf("from"));
        System.out.println(something.lastIndexOf("from"));

        String newText = (something = something.replaceAll("We", "They"));
        System.out.println(newText);
        System.out.println(something);
    }
}
