package miscellaneous;

import java.util.Arrays;

public class TableDemo {

    public static void main(String[] args) {
        String[] columnNames = {"ID", "Name", "Age"};
        String[][] data = {
                {"S001", "Kasun", "25"},
                {"S00200", "Nuwan Ramindu Sampath", "35"},
                {"S003", "Ruwan Dissanayaka Hettige", "45"},
                {"S004", "Supun", "40"},
                {"S004", "Supun", "30"},
                {"S004", "Supun", "25"},
                {"S005", "Nimal", "15"},};
        printTable(columnNames, data);
    }

    public static void printTable(String[] columnNames, String[][] data) {
        int[] columnsMaxLength = getColumnsMaxLength(columnNames.length, data);

        String record = "|";
        String border = "+";
        for (int i = 0; i < columnNames.length; i++) {
            border += "-".repeat(columnsMaxLength[i]).concat("+");
            record += "%-"+ columnsMaxLength[i] +"s|";
        }

        System.out.println(border);
        System.out.println(String.format(record, columnNames));
        System.out.println(border);
        for (String[] row : data) {
            System.out.println(String.format(record, row));
        }
        System.out.println(border);
    }

    public static int[] getColumnsMaxLength(int columnsCount, String[][] data) {
        int[] maxLengths = new int[columnsCount];

        for (int col = 0; col < columnsCount; col++) {
            int maxLength = data[0][col].length();
            for (int row = 1; row < data.length; row++) {
                if (maxLength < data[row][col].length()){
                    maxLength = data[row][col].length();
                }
            }
            maxLengths[col] = maxLength + 1;
        }

        return maxLengths;
    }
}
