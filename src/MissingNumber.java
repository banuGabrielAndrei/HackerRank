import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n]; 
        for (int i = 0; i < n; ++i) { 
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(missingNumber(numbers, n)); 
    }

    public static int missingNumber(int[] numbers, int n) {
        int sum = (n + 1) * (n + 2) / 2;
        for (int num : numbers) {
            sum -= num;
        }
        return sum;
    }
}
