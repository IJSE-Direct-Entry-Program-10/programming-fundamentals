public class Array5 {

    public static void main(String[] args) {
        int[] num1 = {10,20,30,40};
        int[] num2 = {num1[0], 50, 60, 70, num1[2]};
        int[][] num3 = {num1, num2};
        int[][][] num4 = {num3, null};
        num4[0][1][4] = 95;
        System.out.println(num2[num2.length - 1]);
    }
}
