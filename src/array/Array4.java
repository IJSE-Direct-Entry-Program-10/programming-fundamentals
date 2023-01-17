package array;

public class Array4 {

    public static void main(String[] args) {
        int x = 10;
        int[] num1 = {10,20,30,40};
        int[][] array2d = {{70,80,90}, num1};
//        int[][] array2d2 = {{40,50,60}, array2d[1], array2d2[0]};
        int[][] array2d2 = {{40,50,60}, array2d[1], null};
        array2d2[2] = array2d2[0];
    }
}
