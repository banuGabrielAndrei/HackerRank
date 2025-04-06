import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class NicePairs {
    public static void main(String[] args) {
        List<Integer> skillLevels = Arrays.asList(3, 4, 5, 2, 1, 1);
        int minDiff = 3;
        System.out.println(maxPairs(skillLevels, minDiff));
    }


    public static int maxPairs(List<Integer> skillLevels, int minDiff) {
        int[] arr = skillLevels.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);
        int n = arr.length;
        int i = 0;
        List<Integer> potentialPairs = new ArrayList<>();
        for (int j = 0; j < n/2; j++) {
            while (i < n && arr[i] - arr[j] < minDiff) {
                i++;
            }
            if (i >= n) {
                break;
            }
            potentialPairs.add(i);
        }
        potentialPairs = potentialPairs.subList(0, Math.min(potentialPairs.size(), n/2));
        int ans = 0;
        int k = n - 1;
        for (int j = potentialPairs.size() - 1; j >= 0; j--) {
            int y = potentialPairs.get(j);
            if (y <= k) {
                ans++;
                k--;
            }
        }
        return ans;
    }
}


