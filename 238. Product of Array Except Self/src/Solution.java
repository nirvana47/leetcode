public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixNums = new int[nums.length];
        int[] postfixNums = new int[nums.length];
        int[] finalNums = new int[nums.length];

        // FIRST LOOP, LEFT TO RIGHT
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                prefixNums[i] = 1;
            } else {
                prefixNums[i] = prefixNums[i - 1] * nums[i - 1];
            }
            // System.out.print(prefixNums[i] + " ");
        }

        System.out.println();

        // SECOND LOOP, RIGHT TO LEFT
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                postfixNums[i] = 1;
            } else {
                postfixNums[i] = postfixNums[i + 1] * nums[i + 1];
            }
            // System.out.print(postfixNums[i] + " ");
        }
        

        // THIRD LOOP, MULTIPLICATION
        for (int i = 0; i < nums.length; i++) {
            finalNums[i] = prefixNums[i] * postfixNums[i];
        }

        return finalNums;
    }
}
