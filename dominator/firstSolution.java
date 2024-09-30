
public class firstSolution {

    public static int findDominator(int[] A) {
        int n = A.length;
        if (n == 0) {
            return -1;
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
            for (int i = 0; i < n; i++) {
                if (A[i] == candidate) {
                    return i; // Return any valid index
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
