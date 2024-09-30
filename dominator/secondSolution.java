import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SecondSolution {

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
        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        List<Integer> dominatorIndices = findDominator(A);
        System.out.println(dominatorIndices); // Output: [0, 2, 4, 6, 7]
    }
}
