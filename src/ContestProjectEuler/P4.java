package ContestProjectEuler;
//LARGEST PALINDROME PRODUCT
import java.io.*;
import java.util.stream.*;

public class P4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());
                System.out.println(largestPalindrome(n));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    public static int largestPalindrome(int n) {
        int result = -1;
        for (int i = 999; i >= 100; --i) {
            for (int j = 999; j >= 100; --j) {
                int product = i * j;
                if (product < n && isPalindrome(product)) {
                    result = Math.max(product, result);
                }
            }
        }
        return result;
    }

    public static boolean isPalindrome(int value) {
        String nr = String.valueOf(value);
        StringBuilder inverse = new StringBuilder(nr).reverse();
        return nr.equals(String.valueOf(inverse));
    }
}
