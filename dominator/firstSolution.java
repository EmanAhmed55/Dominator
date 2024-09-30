import java.util.ArrayList;
import java.util.List;

public class FirstSolution {

    public static List<Integer> findDominator(int[] A) {
        int n = A.length;
        List<Integer> indices = new ArrayList<>();
        if (n == 0) {
            return indices; // Return an empty list if no dominator
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
        }

        return indices; // Return all indices or an empty list if no dominator found
    }

    public static void main(String[] args) {
        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        List<Integer> dominatorIndices = findDominator(A);
        System.out.println(dominatorIndices); // Output: [0, 2, 4, 6, 7]
    }
}

