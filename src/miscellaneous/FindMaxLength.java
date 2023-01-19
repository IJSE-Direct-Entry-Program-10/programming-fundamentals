package miscellaneous;

public class FindMaxLength {

    public static void main(String[] args) {
        String[] data = {"Kasun", "Ruwan Sampath", "Nuwan", "Kusum", "Supun Adikari", "12345111111", "KS Ruwan Sampath"};
        findTheLongest(data);
    }

    public static void findTheLongest(String[] data){
        int length = data[0].length();
        int index = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i].length() > length){
                length = data[i].length();
                index = i;
            }
        }
        System.out.println("The longest text: " + data[index]);
        System.out.println("The longest text index: " + index);
        System.out.println("The longest text length: " + length);
    }
}
