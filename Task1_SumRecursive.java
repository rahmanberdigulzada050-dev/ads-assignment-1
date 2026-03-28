import java.util.Scanner;

/**
 * Task 1: Calculate sum of squares from 1² to n² using recursion
 * Formula: 1² + 2² + 3² + ... + n²
 * Time Complexity: O(n) - Linear
 * Each recursive call performs constant work, n calls total
 */
public class Task1_SumRecursive {

    public static int sumOfSquares(int n) {
        // Base case
        if (n == 1) {
            return 1;  // 1² = 1
        }
        // Recursive case: n² + sum of squares from 1 to (n-1)
        return (n * n) + sumOfSquares(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int result = sumOfSquares(n);

        // Display the calculation
        System.out.print("Sum of squares: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "²");
            if (i < n) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + result);

        scanner.close();
    }
}