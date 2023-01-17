package statements.demos.algorithms;

import java.util.Arrays;

public class CloneArray {

    public static void main(String[] args) {

        var nums = new int[]{10,20,30,40,50};
        var nums2 = new int[nums.length + 1];

        var x = 0;
        while (x < nums.length){
            nums2[x] = nums[x];
            x++;
        }

        System.out.println(Arrays.toString(nums2));
    }
}
