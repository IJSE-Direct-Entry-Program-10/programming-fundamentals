package method;

public class MethodDemo1 {

    public static void main(String[] args) {
        print("abc");
        print("ijse");
        print("kasun");
    }

    public static void myMethod(){
        System.out.println("IJSE");
        System.out.println("-----");
        System.out.println("IJSE");
        System.out.println("-----");
    }

    public static void print(String something){
        System.out.println("---------------------");
        System.out.println(something.toUpperCase());
        System.out.println("---------------------");
    }

}
