package miscellaneous;

public class EqualsVsEqualityDemo {
    public static void main(String[] args) {
        String str1 = "IJSE";
        String str2 = new String("IJSE");
        System.out.println(str1 == str2);           // false
        System.out.println(str1.equals(str2));      // true

        var demo1 = new EqualsVsEqualityDemo();
        var demo2 = new EqualsVsEqualityDemo();
        System.out.println(demo1 == demo2);         // false
        System.out.println(demo1.equals(str1));     // true
    }

//    @Override
//    public boolean equals(Object obj) {
//        return true;
//    }
}
