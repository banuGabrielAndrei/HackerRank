package ContestProjectEuler;
//MULTIPLES OF 3 AND 5
import java.io.*;
import java.util.*;

public class P1 {
    public static void main(String[] args) throws IOException {
        var scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of test cases

        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; ++i) {
            long value = scanner.nextLong();
            --value;

            long sum3 = sumOfMultiples(3, value);
            long sum5 = sumOfMultiples(5, value);
            long sum15 = sumOfMultiples(15, value);

            long totalSum = sum3 + sum5 - sum15;
            result.append(totalSum).append("\n");
        }
        System.out.print(result.toString());
        scanner.close();
    }

    private static long sumOfMultiples(long x, long n) {
        long p = n / x;
        return x * p * (p + 1) / 2;
    }
}
