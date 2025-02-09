import java.util.Arrays;

public class ValidAnagrams {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        var s = scanner.nextLine();
        var t = scanner.nextLine();
        scanner.close();
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s , String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }
}
