package ContestProjectEuler;
//SUM SQUARE DIFFERENCE
import java.io.*;
import java.util.stream.*;

public class P6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());
                long sum1 = 0;
                long sum2 = 0;
                for (int i = 1; i <= n; ++i) {
                    sum1 += i;
                    sum2 += i * i;
                }
                System.out.println(Math.abs(sum1 * sum1 - sum2));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
