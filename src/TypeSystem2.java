public class TypeSystem2 {

    public static void main(String[] args) {
        var someNumber = 10;
        final var MY_NUMBER = 20;
        var flag = true;
        var num3 = 10.25;
        var character = 'a';
        var someString = "This is a something";

        someNumber = 50;
        //num2 = 70;
        flag = false;
        someNumber = 80;

        //flag = 10.256;
        someNumber = 25;

        character = 66;
        System.out.println(character);

        int count;
        count = 10;

        String name = "IJSE";

        final double PI;
        PI = 3.14;

        /* This is a run time constant */
        final double RESULT = Math.random();
        /* This is a compiled time constant */
        final int NET = 10 + 15;

//        PI = 4.5;
    }
}
