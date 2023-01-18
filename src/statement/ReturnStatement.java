package statement;

public class ReturnStatement {

//    {
//        if (true) return;
//    }

//    block1:   // This can't be done
//    {
//
//    }

    public static void main(String[] args) {
        if (true) return;
//        int x = 10;
//        x = 20;
//        x++;
//        main(null);
//        System.out.println("Start");
//        int result = add(10, 20);
//        System.out.println(result);
//        System.out.println("End");
    }

    public static int add(int num1, int num2){
        int result = num1  + num2;
        if (true) return result;
        return 0;
    }
}
