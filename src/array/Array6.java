package array;

public class Array6 {

    public static void main(String[] args) {
        int[][] nums = {{10,20,30}, null};
        int[][] nums1 = nums;
        nums[1] = new int[]{40,50,60,70};
        int[][][] nums3 = {nums, null, null};

        //nums1[1][nums1.length - 1] = 25;
        nums1[1][1] = 25;

        //nums3[nums[0].length - 1] = new int[][]{{25,45,65},{123,12, nums[0][0]}};
        nums3[2] = new int[][]{{25,45,65},{123,12, nums[0][0]}};

        nums1 = nums3[2];

        System.out.println(nums[1][1]);     // 25

//        System.out.println(nums3[nums3.length - 1][1][nums.length -1]);
        System.out.println(nums3[2][1][1]); // 12

        System.out.println(nums1[0][2]); //65
    }
}
