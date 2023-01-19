package miscellaneous;

public class TableDemo {

    public static void main(String[] args) {
        String[] columnNames = {"ID", "Name", "Contact", "Address"};
        String[][] data =
                {
                        {"S001", "Kasun", "011-1234567", "Galle"},
                        {"S00200", "Nuwan Ramindu Sampath", "078-1234567", "Panadura"},
                        {"S003", "Ruwan Dissanayaka Hettige", "011-1234567", "Matara"},
                        {"S004", "Supun", "055-1234567", "Colombo"},
                        {"S005", "Nimal", "033-1234567", "Kandy"},
                };
        printTable(columnNames, data);
    }

    public static void printTable(String[] columnNames, String[][] data) {
        String line = "+".concat("-".repeat(5)).concat("+").concat("-".repeat(15)).concat("+");
        System.out.println(line);
        System.out.printf("|%-5s|%-15s| \n", "ID", "NAME");
        System.out.println(line);
        for (String[] row : data) {
            System.out.printf("|%-5s|%-15s| \n", row[0], row[1]);
        }
        System.out.println(line);
    }
}
