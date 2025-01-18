package ContestProjectEuler;
//10001ST PRIME
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class P7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());
                List<Integer> primes = eratosthenes(1000000);
                System.out.println(primes.get(n - 1));

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    public static List<Integer> eratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= n; ++i) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= n; ++i) {
            if (isPrime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
}
