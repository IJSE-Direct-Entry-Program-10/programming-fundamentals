package algorithms;

import miscellaneous.TableDemo;

public class MyTableView {

    public static void main(String[] args) {
        String[][] data =
                {
                        {"1", "Kasun"},
                        {"2", "Nuwan"},
                        {"3", "Ruwan"},
                        {"4", "Supun"}
                };

        TableDemo.printTable(new String[]{"ID","NAME"}, data);
    }
}
