import java.util.Scanner;

/**
 * Task 4: Display sequence in reverse order using recursion
 * No arrays, no loops allowed
 * Time Complexity: O(n) - Linear
 * Space Complexity: O(n) - Call stack depth
 */
public class Task4_ReverseSequence {

    public static void readAndReverse(int n, Scanner scanner) {
        // Base case: if no more numbers to read
        if (n == 0) {
            return;
        }

        // Read the number
        int num = scanner.nextInt();

        // Recursive call for remaining numbers
        readAndReverse(n - 1, scanner);

        // Print after recursion (this creates reverse order)
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = scanner.nextInt();

        System.out.println("Enter " + N + " numbers:");
        readAndReverse(N, scanner);

        scanner.close();
    }
}