package miscellaneous;

public class BitMasking {

    public static void main(String[] args) {
        int x = 5;
        int y = 2;

        int z = 3;

        int result = 0;
        result = result | x;
        result = result | y;
        //int result = x | y;

        System.out.println(result);
        System.out.println(result & x);
        System.out.println(result & y);
    }

}
