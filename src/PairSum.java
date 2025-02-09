public class PairSum {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int target = 5;
        int[] result = pairSum(numbers, target);
        if (result.length == 0) {
            System.out.println("No pair found");
        } else {
            System.out.println("Pair found at index " + result[0] + " and " + result[1]);
        }
    }

    public static int[] pairSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; ++i) {
            for (int j = i + 1; j < numbers.length; ++j) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
