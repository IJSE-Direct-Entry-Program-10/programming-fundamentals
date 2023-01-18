package statements.demos.algorithms;

import java.util.Arrays;

public class SelectionSort2 {

    public static void main(String[] args) {
        var nums = new int[]{10, 25, 30, 0, -25, -4, 15, 20};

        int k = 0;
        while (k < nums.length) {
            var maxIndex = nums.length - 1 - k;             // 7
            var max = nums[maxIndex];                   // 20

            var i = maxIndex - 1;
            while (i >= 0){
                if (max < nums[i]){
                    max = nums[i];
                    maxIndex = i;
                }
                i--;
            }

            var temp = nums[nums.length - 1 - k];
            nums[nums.length - 1 - k] = max;
            nums[maxIndex] = temp;
            k++;
        }

        System.out.println(Arrays.toString(nums));  // [-25,-4,0,10,15,20,25,30]
    }
}
