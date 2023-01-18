package statements.demos.algorithms;

public class MinMaxAlgo {

    public static void main(String[] args) {
        var nums = new int[]{10, 25, 30, 0, -25, -4, 15, 20};
        int min = nums[0];
        int minIndex = 0;
        int max = nums[0];
        int maxIndex = 0;

        int i = 1;
        while (i < nums.length){
            if (min > nums[i]){
                min = nums[i];
                minIndex = i;
            }
            if (max < nums[i]){
                max = nums[i];
                maxIndex = i;
            }
            i++;
        }

        System.out.printf("Min value: %s, Min index: %s \n", min,minIndex); // -25, 4
        System.out.printf("Max value: %s, Max index: %s \n", max,maxIndex); // 30, 2
    }
}
