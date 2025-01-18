package ContestProjectEuler;
//LARGEST PRODUCT IN A SERIES
import java.io.*;
import java.util.stream.*;

public class P8 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int k = Integer.parseInt(firstMultipleInput[1]);

                String num = bufferedReader.readLine();

                System.out.println(result(num, k));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }

    public static long result(String num, int k) {
        long maxSum = 0;
        for (int i = 0; i <= num.length() - k; ++i) {
            long sum = 1;
            for (int j = i; j < i + k; ++j) {
                sum *= Character.getNumericValue(num.charAt(j));
                // System.out.println(sum + " " + Character.getNumericValue(num.charAt(j)));
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
