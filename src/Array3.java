public class Array3 {

    public static void main(String[] args) {
        int[][] array2d = new int[3][];
        int[] nums = new int[3];

        System.out.println(array2d[0]);
        System.out.println(array2d[1]);
        System.out.println(array2d[2]);

        array2d[1]= new int[]{10,20,30};
        array2d[2] = new int[0];
        array2d[0] = nums;

        System.out.println(array2d[0]);
        System.out.println(array2d[1]);
        System.out.println(array2d[2]);

        System.out.println("======================");
        System.out.println(nums[2]);
        array2d[0][2] = 30;
        System.out.println(nums[2]);
    }
}
