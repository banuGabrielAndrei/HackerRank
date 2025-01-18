package ContestProjectEuler;
//SMALLEST MULTIPLE
import java.io.*;
import java.util.stream.*;

public class P5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());
                System.out.println(smallestMultiple(n));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    public static long CMMDC(long nr1, long nr2) {
        while (nr2 != 0) {
            long aux = nr2;
            nr2 = nr1 % nr2;
            nr1 = aux;
        }
        return nr1;
    }

    public static long CMMMC(long nr1, long nr2) {
        return nr1 * nr2 / CMMDC(nr1, nr2);
    }

    public static long smallestMultiple(int n) {
        long result = 1;
        for (int i = 1; i <= n; ++i) {
            result = CMMMC(result, i);
        }
        return result;
    }
}
