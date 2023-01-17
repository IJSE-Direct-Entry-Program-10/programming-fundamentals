import java.util.Arrays;
import java.util.Scanner;

public class LoopDemo9 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var nums = new int[0];
        var run = true;

        while (run){
            System.out.print("Enter a number to add or q to exit: ");
            var input = scanner.nextLine();

            if (input.equals("q")){
                run = false;
            }else{
                /* Create a new array */
                var newArray = new int[nums.length + 1];

                /* Copy values from the old array */
                int i = 0;
                while (i < nums.length){
                    newArray[i] = nums[i];
                    i++;
                }

                /* Add the new value */
                newArray[newArray.length - 1] = Integer.parseInt(input);

                /* Swap memory locations */
                nums = newArray;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
