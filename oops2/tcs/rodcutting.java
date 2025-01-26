package tcs;
import java.util.Scanner;

public class rodcutting {

    public static int maximizeProfit(int n, int k, int[] lengths, int[] values) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < lengths.length; j++) {
                if (lengths[j] <= i) {
                    dp[i] = Math.max(dp[i], dp[i - lengths[j]] + values[j]);
                }
            }
        }
        return dp[k];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the total length of the rod
        System.out.print("Enter the total length of the rod (n): ");
        int n = scanner.nextInt();

        // Input the required length by customer
        System.out.print("Enter the required length by customer (k): ");
        int k = scanner.nextInt();

        // Input the number of available rod piece lengths
        System.out.print("Enter the number of available rod piece lengths: ");
        int m = scanner.nextInt();

        // Initialize arrays for lengths and values
        int[] lengths = new int[m];
        int[] values = new int[m];

        // Input lengths and values
        System.out.println("Enter the lengths of the rod pieces:");
        for (int i = 0; i < m; i++) {
            lengths[i] = scanner.nextInt();
        }

        System.out.println("Enter the corresponding values of the rod pieces:");
        for (int i = 0; i < m; i++) {
            values[i] = scanner.nextInt();
        }

        // Calculate the maximum profit
        int maxProfit = maximizeProfit(n, k, lengths, values);
        System.out.println("Maximum profit for length " + k + " is: " + maxProfit);

        scanner.close();
    }
}
