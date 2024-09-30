
import java.util.HashMap;

public class secondSolution {

    public static int findDominator(int[] A) {
        int n = A.length;
        if (n == 0) {
            return -1;
        }

        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : A) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : countMap.keySet()) {
            if (countMap.get(num) > n / 2) {
                for (int i = 0; i < n; i++) {
                    if (A[i] == num) {
                        return i; // Return any valid index
                    }
                }
            }
        }

        return -1; // No dominator found
    }

    public static void main(String[] args) {
        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        System.out.println(findDominator(A)); // Output: 0, 2, 4, 6 or 7 (any valid index)
    }
}
