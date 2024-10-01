import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SecondSolution {

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

    public static List<Integer> findDominator(int[] A) {
        int n = A.length;
        List<Integer> indices = new ArrayList<>();
        if (n == 0) {
            return indices; // Return an empty list if no dominator
        }

        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : A) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : countMap.keySet()) {
            if (countMap.get(num) > n / 2) {
                // Collect all indices of the dominator
                for (int i = 0; i < n; i++) {
                    if (A[i] == num) {
                        indices.add(i);
                    }
                }
                return indices; // Return all indices of the dominator
            }
        }

        return indices; // Return an empty list if no dominator found
    }

    public static void main(String[] args) {
        int[] A = getUserInput(); // Get user input for the array
        List<Integer> dominatorIndices = findDominator(A);
        
        if (dominatorIndices.isEmpty()) {
            System.out.println(-1); // Output -1 if no dominator found
        } else {
            System.out.println(dominatorIndices); // Output indices of the dominator
        }
    }
}
