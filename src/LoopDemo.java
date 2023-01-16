public class LoopDemo {

    public static void main(String[] args) throws InterruptedException {
        String something = "Hello DEP-10, How are you?";
//        System.out.println(something.substring(0,10) + "\b\b\b");
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("IJSE");
//            Thread.sleep(1000);
//        }

        String[] colors = {"\u001b[30m", "\u001b[31m", "\u001b[32m", "\u001b[33m", "\u001b[34m"};

        for(; true ;) {
            for (int i = 0, j = 0; i < something.length(); i++, j++) {
                if (j == colors.length) j = 0;
//                System.out.printf("%s%s","\u001b[3" + j + "m",something.charAt(i));
                System.out.printf("%s%s", colors[j],something.charAt(i));
                Thread.sleep(400);
            }

            for (int i = 0; i < something.length(); i++) {
                System.out.print('\b');
                Thread.sleep(50);
            }
        }
    }
}
