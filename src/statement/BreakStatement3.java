package statement;

public class BreakStatement3 {

    public static void main(String[] args) {
        start:
        System.out.println("App started");

        first:{
            System.out.println("First Started");
            second:{
                System.out.println("Second Started");
                third:{
                    System.out.println("Third Started");
                    fourth:{
                        System.out.println("Fourth Started");
                        System.out.println("Fourth End");
                    }
                    if (true) break third;
                    System.out.println("Third End");
                }
                System.out.println("Second End");
            }
            System.out.println("First End");
        }

        end:
        System.out.println("App ended");
    }
}
