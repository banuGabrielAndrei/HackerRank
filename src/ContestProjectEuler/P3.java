package ContestProjectEuler;
//LARGEST PRIME FACTOR
import java.util.*;

public class P3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();
            System.out.println(largestPrimeFactor(n));
        }
        in.close();
    }

    public static long largestPrimeFactor(long nr) {
        long result = 0;
        for (long i = 2; i * i <= nr; ++i) {
            while (nr % i == 0) {
                result = i;
                nr /= i;
            }
        }
        if (nr > 2) {
            result = nr;
        }
        return result;
    }
}
