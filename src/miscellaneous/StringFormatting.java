package miscellaneous;

public class StringFormatting {

    public static void main(String[] args) {
        int id = 50;
        // S001, S010, S120, S1205, S030, S005
        String studentId = String.format("S%03d", id);
        System.out.println(studentId);

        double value = 257253.125;  // Rs. 257,253.12
        String price = String.format("Rs.%,.2f", value);
        System.out.println(price);
    }
}
