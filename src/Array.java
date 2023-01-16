public class Array {


    public static void main(String[] args) {
        int x = 10;
        int a;
        a = 20;
        System.out.println(x);
        System.out.println(a);

        int[] y = {10,20,30};
        System.out.println(y.length);
        System.out.println(y[1]);
        y[1] = 25;
        System.out.println(y[1]);

        String[] names = {"Kasun", "Nuwan", "Ruwan", "Sampath"};
        System.out.println(names.length);
        System.out.println(names[1]);

        String[] names2 = {};
        System.out.println(names2.length);
        System.out.println("=====================");
        System.out.println(names);
        System.out.println(names2);
        names2 = names;
        System.out.println(names2.length);

        names = null;
        names2 = null;
        y = null;

        System.out.println(names);
        System.out.println(names2);
        System.out.println(y);

        String something = "IJSE";
        System.out.println(something);
        something = null;
        System.out.println(something);
    }
}
