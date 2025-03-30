import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();

        if (onlyDigits(line)) {
            String[] parts = line.split(" ");
            Integer[] ints = new Integer[parts.length];
            for (int i = 0; i < parts.length; i++) {
                ints[i] = Integer.parseInt(parts[i]);
            }
            System.out.println(sum(ints)); 
        } else {
            System.out.println(sum(line));
        }
    }

    public static Integer sum(Integer[] ints) {
        Integer sum = 0;
        for (Integer num : ints) {
            sum += num;
        }
        return sum;
    }

    public static String sum(String str) {
        return str.replaceAll("\\s+", ""); 
    }

    public static boolean onlyDigits(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c) && c != ' ') {
                return false;
            }
        }
        return true;
    }
}