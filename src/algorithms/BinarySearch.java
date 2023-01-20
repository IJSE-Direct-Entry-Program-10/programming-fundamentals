package algorithms;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        int[] nums = {-3, 2, 3, 5, 7, 8, 10, 11};
        System.out.print("Enter a number to search: ");
        int search = scanner.nextInt();

        if (search < nums[0] || search > nums[nums.length - 1]){
            System.out.println("Not found!");
            return;
        }

        int start = 0;
        int end = nums.length;
        while (start < end) {
            int middle = (start + end) / 2;
            if (nums[middle] == search){
                System.out.printf("%s found at: %s \n", search, middle);
                return;
            }else if(nums[middle] < search){
                start = middle + 1;
            }else{
                end = middle;
            }
        }

        System.out.println("Not found!");

    }
}
