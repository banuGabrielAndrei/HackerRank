import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortByFrequency {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var str = scanner.nextLine();
        scanner.close();
        System.out.println(sortedByFrequency(str));
    }

    public static String sortedByFrequency(String str) {
        int[] fr = new int['z' + 1];
        for (int i = 0; i < str.length(); ++i) {
            if (Character.isLetter(str.charAt(i))) {
                ++fr[str.charAt(i)];
            }
        }
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); ++i) {
            if (Character.isLetter(str.charAt(i))) {
                list.add(str.charAt(i));
            }
        }
        list.sort((a, b) -> fr[b] - fr[a]);
        StringBuilder sb = new StringBuilder();
        for (char ch : list) {
            while (fr[ch]-- > 0) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
