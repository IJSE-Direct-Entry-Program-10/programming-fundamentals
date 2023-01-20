package algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {3, 2, -1, 0, 5, 3, 7, 6, -5};

        int k = 0;
        do {
            int i = 0;
            do{
                if (nums[i] > nums[i+ 1]){
                    var temp = nums[i + 1];
                    nums[i + 1] = nums[i];
                    nums[i] = temp;
                }
            }while(++i < nums.length - 1 - k);
            System.out.println(Arrays.toString(nums));
        } while (++k < nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }
}
