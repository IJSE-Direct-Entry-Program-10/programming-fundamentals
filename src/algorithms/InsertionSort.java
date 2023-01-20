package algorithms;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] nums = {-7, 5, 3, 20, 2};

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]){
                var insert = nums[i];
                for (int k = 0; k < i; k++) {
                    if (insert < nums[k]){
                        for (int j = i; j > k ; j--) {
                            nums[j] = nums[j - 1];
                        }
                        nums[k] = insert;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
