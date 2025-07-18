class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;

        // Step 1: Pick 1s as long as we have them and k > 0
        for (int i = 0; i < numOnes && k > 0; i++) {
            sum += 1;
            k--;
        }

        // Step 2: Pick 0s as long as we have them and k > 0
        for (int i = 0; i < numZeros && k > 0; i++) {
            // sum += 0;  // not needed
            k--;
        }

        // Step 3: Pick -1s if needed and k > 0
        for (int i = 0; i < numNegOnes && k > 0; i++) {
            sum -= 1;
            k--;
        }

        return sum;
    }
}
