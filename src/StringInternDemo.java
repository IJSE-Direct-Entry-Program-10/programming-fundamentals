import java.security.spec.RSAOtherPrimeInfo;

public class StringInternDemo {

    public static void main(String[] args) {
//        var h = "Hello";
//        System.out.println(h);
//        System.out.println("Hi!");
//        int x = h.equals("abc") ? 10 : 15;
        var str1 = new String("IJSE").intern();
        var str2 = "IJSE";
        var str3 = new String("IJSE").intern();
        var str4 = "IJSE";
        System.out.println(str1 == str2);   // false
        System.out.println(str1 == str3);   // false
        System.out.println(str2 == str3);   // true
        System.out.println("-----------------");
        System.out.println(str4 == str1);   // false
        System.out.println(str4 == str2);   // true
        System.out.println(str4 == str3);   // true
    }
}
