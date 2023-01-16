public class LoopDemo2 {

    public static void main(String[] args) throws InterruptedException {
        String something = "Hello DEP-10, How are you?";
//        System.out.println(something.substring(0,10) + "\b\b\b");
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("IJSE");
//            Thread.sleep(1000);
//        }

        String[] colors = new String[10];
        /* Filling with colors */
        for (int i = 0; i < colors.length; i++) {
            colors[i] = "\u001b[3" + i + "m";
        }

        boolean erase = false;

        /* Method 1 */
//        for (int i = 0, k = 1, j = 0; true ; i += k) {
//
//            if (i == something.length()) {
//                erase = true;
//                k = -1;
//            }else if (i == 0){
//                erase = false;
//                k = 1;
//            }
//
//            if (!erase) System.out.printf("%s%s", colors[++j == colors.length ? j = 0: j], something.charAt(i));
//            else System.out.print("\b \b");
//
//            if (!erase) Thread.sleep(100);
//            else Thread.sleep(50);
//        }

        /* Method 2 */
//        for (int i = 0, j=0; true ; i++) {
//            if (i == something.length()) {
//                erase = !erase;
//                i = 0;
//            }
//
//            if (!erase) System.out.printf("%s%s", colors[++j == colors.length ? j = 0: j], something.charAt(i));
//            else System.out.print("\b \b");
//
//            if (!erase) Thread.sleep(100);
//            else Thread.sleep(50);
//        }

        /* Method 3 */
        for (int i = 0, j = 0; true ; i++) {
            if (i / something.length() == 1) {
                erase = !erase;
                i = 0;
                Thread.sleep(200);
            }

            if (!erase) System.out.printf("%s%s", colors[++j == colors.length ? j = 0: j], something.charAt(i));
            else System.out.print("\b \b");

            if (!erase) Thread.sleep(100);
            else Thread.sleep(50);
        }
    }
}
