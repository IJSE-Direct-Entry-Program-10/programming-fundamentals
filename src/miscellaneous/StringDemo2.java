package miscellaneous;

public class StringDemo2 {

    public static void main(String[] args) {
        /* Java 11 */
        String star = "* ";
        System.out.println(star.repeat(5));

        /* Java 11 */
        String something = "          this is my content        ";
        System.out.println(something.stripLeading());
        System.out.println(something.stripTrailing());
        System.out.println(something.strip());  // == trim()

        var name = "Kasun";
        var contact= "077-1234567";
        int age = 15;

//        something = "Hi! My name is "+ name +", My contact number is: "+ contact +", My age is: " + age;
        something = String.format("Hi! My name is %s, My contact number is: %s, My age is: %s",
                name, contact, age);
        System.out.println(something);

        something = String.format("%1$s's Details, %1$s's contact: %2$s, %1$s's age: %3$s",
                name, contact, age);
        System.out.println(something);

        something = String.format("%-50s", "Hello");
        System.out.println(something);
    }
}
