import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstSolution {

    public static int[] getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] A = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        
        return A;
    }

    public static Object findDominator(int[] A) {
        int n = A.length;
        List<Integer> indices = new ArrayList<>();
        if (n == 0) {
            return -1; // Return -1 if no dominator
        }

        // Step 1: Find a candidate
        Integer candidate = null;
        int count = 0;

        for (int num : A) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify the candidate
        count = 0;
        for (int num : A) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            // Collect all indices of the dominator
            for (int i = 0; i < n; i++) {
                if (A[i] == candidate) {
                    indices.add(i);
                }
            }
            return indices; // Return indices of the dominator
        }

        return -1; // Return -1 if no dominator found
    }

    public static void main(String[] args) {
        int[] A = getUserInput(); // Get user input for the array
        Object result = findDominator(A);

        if (result instanceof Integer && (Integer) result == -1) {
            System.out.println(-1); // Output -1 if no dominator found
        } else {
            System.out.println(result); // Output indices of the dominator
        }
    }
}
