import java.util.List;

public class MaxSubArray {
    public static void main(String[] args) {
    }
    public static long maxSubarrayValue(List<Integer> arr) {
        int n = arr.size();
        long[] even = new long[n + 1];
        long[] odd = new long[n + 1];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even[i + 1] = even[i] + arr.get(i);
                odd[i + 1] = odd[i];
            } else {
                even[i + 1] = even[i];
                odd[i + 1] = odd[i] + arr.get(i);
            }
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                long a = even[j] - even[i];
                long b = odd[j] - odd[i];
                ans = Math.max(ans, (a - b) * (a - b));
            }
        }
        return ans;
    }
}
