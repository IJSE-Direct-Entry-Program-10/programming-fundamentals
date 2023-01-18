package statement.demos.algorithms;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        var nums = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        var newArray = new int[nums.length];
        var i = 0;
        while (i < newArray.length) {
            newArray[i] = nums[nums.length - i - 1];
            i++;
        }
        nums = newArray;

        System.out.println(Arrays.toString(nums));
    }
}
