package ContestProjectEuler;
//EVEN FIBONACCI NUMBERS
import java.util.*;

public class P2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();
            long sum = 0;
            long first = 2;
            long second = 8;
            while (first <= n) {
                sum += first;
                long nextValue = 4 * second + first;
                first = second;
                second = nextValue;
            }
            System.out.println(sum);
        }
        in.close();
    }
}