import java.util.Scanner;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var str = scanner.nextLine();
        scanner.close();
        System.out.println(firstChar(str));
    }

    public static char firstChar(String str) {
        int[] fr = new int['z' + 1];
        for (int i = 0; i < str.length(); ++i) {
            if (Character.isLetter(str.charAt(i))) {
                ++fr[str.charAt(i)];
            }
        }
        for (int i = 0; i <str.length(); ++i) {
            if (fr[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return '_';
    }
}
