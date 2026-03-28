import java.util.Scanner;

/**
 * Task 2: Calculate sum of first n elements of an array using recursion
 * Time Complexity: O(n) - Linear
 * Each recursive call processes one element, n calls total
 */
public class Task2_ArraySum {

    public static int sumOfFirstN(int[] arr, int n, int index) {
        // Base case: if index reached n, return 0
        if (index == n) {
            return 0;
        }
        // Recursive case: current element + sum of remaining elements
        return arr[index] + sumOfFirstN(arr, n, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nYour array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("\nEnter number of elements to sum (n): ");
        int n = scanner.nextInt();

        // Validate input
        if (n > arr.length) {
            System.out.println("Error: n cannot be greater than array length (" + arr.length + ")");
        } else if (n < 0) {
            System.out.println("Error: n cannot be negative");
        } else {
            int result = sumOfFirstN(arr, n, 0);
            System.out.println("Sum of first " + n + " elements = " + result);
        }

        scanner.close();
    }
}