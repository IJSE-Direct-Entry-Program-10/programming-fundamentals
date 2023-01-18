package statement.demos.algorithms;

import java.util.Arrays;

public class SelectionSort1 {

    public static void main(String[] args) {
        var nums = new int[]{20, 12, 25, -85, 0, 12, 25, 30, 12};

        int k = 0;
        while (k < nums.length) {
            /* Let's find the minimum */
            int min = nums[k];          // Initial guess
            int minIndex = k;

            var i = (k+1);
            while (i < nums.length){
                if (min > nums[i]){
                    min = nums[i];
                    minIndex = i;
                }
                i++;
            }

            /* Let's swap the numbers */
            var temp = nums[k];
            nums[k] = min;
            nums[minIndex] = temp;
            k++;
        }

        System.out.println(Arrays.toString(nums));  // [-85,0,12,12,12,20,25,25,30]
    }
}
