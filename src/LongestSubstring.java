import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var str = scanner.nextLine();
        scanner.close();
        System.out.println(longestSubstring(str));
    }

    public static int longestSubstring(String str) {
        int n = str.length();
        int max = 0;
        for (int i = 0; i < n; ++i) {
            Set<Character> set  = new HashSet<>();
            for (int j = i; j < n; ++j) {
                if (set.contains(str.charAt(j))) {
                    break;
                }
                set.add(str.charAt(j));
            }
            max = Math.max(max, set.size());
        }
        return max;
    }
}
