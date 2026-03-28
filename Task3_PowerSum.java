import java.util.Scanner;

/**
 * Task 3: Calculate sum of powers: b⁰ + b¹ + b² + ... + bⁿ using recursion
 * Time Complexity: O(n) - Linear
 * Each recursive call computes one power and adds to sum
 */
public class Task3_PowerSum {

    public static int powerSum(int b, int n) {
        // Base case: if n == 0, return b⁰ = 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: bⁿ + sum of powers from 0 to n-1
        return (int) Math.pow(b, n) + powerSum(b, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base (b): ");
        int b = scanner.nextInt();

        System.out.print("Enter exponent (n): ");
        int n = scanner.nextInt();

        int result = powerSum(b, n);

        // Display the calculation
        System.out.print("Sum: ");
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                System.out.print(b + "⁰");
            } else {
                System.out.print(" + " + b + "⁰" + i);
            }
        }
        System.out.println(" = " + result);

        scanner.close();
    }
}