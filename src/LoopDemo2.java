public class LoopDemo2 {

    public static void main(String[] args) throws InterruptedException {
        String something = "Hello DEP-10, How are you?";
//        System.out.println(something.substring(0,10) + "\b\b\b");
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("IJSE");
//            Thread.sleep(1000);
//        }

        String[] colors = {"\u001b[30m", "\u001b[31m", "\u001b[32m", "\u001b[33m", "\u001b[34m"};
        boolean erase = false;

        for (int i = 0, k = 1; true ; i += k) {

            if (i == something.length()) {
                erase = true;
                k = -1;
            }else if (i == 0){
                erase = false;
                k = 1;
            }

            if (!erase) System.out.print(something.charAt(i));
            if (erase) System.out.print("\b");

            if (!erase) Thread.sleep(200);
            else Thread.sleep(100);
        }

//        for (int i = 0; true ; i++) {
//            if (i == something.length()) {
//                erase = !erase;
//                i = 0;
//            }
//
//            if (!erase) System.out.print(something.charAt(i));
//            if (erase) System.out.print("\b");
//
//            if (!erase) Thread.sleep(200);
//            else Thread.sleep(100);
//        }
    }
}
