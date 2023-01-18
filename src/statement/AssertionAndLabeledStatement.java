package statement;

public class AssertionAndLabeledStatement {

    //test:
    public static void main(String[] args) {
        int x = 10;
        int result = x + 15;

        float f = 10.25f;
        
        something:
        assert result == 25;

        int[] nums = {10,2,2,4};    // <- This is an array initializer
        first:
        {

        }
        System.out.println("Continue...?");
        second:
        {
            innerBlock:
            {

            }
        }
        System.out.println("--------");
    }
}
