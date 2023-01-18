package statements;

public class EnhancedForStatement {

    public static void main(String[] args) {

        var nums = new int[]{10, 20, 30, 40, 50};
        var sum = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            sum += nums[i];
        }

        System.out.println("SUM: " + sum);
        System.out.println("------------");

        sum = 0;
        for (int i: nums){
            System.out.println(i);
            sum += i;
        }
        System.out.println("SUM: " + sum);
    }
}
