package method;

public class VarArgs {

    public static void main(String ...args) {
        String[] myArgs = {"abc", "eddf", "saa", "efjds"};
        myMethod(10,"abc", "eddf");
        myMethod(20, myArgs);
//        myMethod(30);

//        myMethod(10, "A","EDF", 10);
        //String[] myArgs = {"abc", "edf"};
        System.out.printf("%s-%s \n", "abc", "edf");
        System.out.printf("%s-%s \n", myArgs);
    }

    public static void myMethod(int x, String...    args){
        for (String arg : args) {
            System.out.println(arg);
        }
    }

}
