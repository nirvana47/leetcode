class Solution {
    /**
     * Given an array of integers, return indices of the two numbers such that they
     * add up to a specific target. You may assume that each input would have
     * exactly one solution, and you may not use the same element twice.
     */
    public int[] twoSum(int[] nums, int target) {
        // int[] sumIndice = new int[2];

        for (int i = 0; i < nums.length; i += 1) {
            for (int j = i + 1; j < nums.length; j += 1) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }

            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        Solution Sol = new Solution();

        int[] numbers = new int[] { 2, 7, 5, 11 };
        int[] solutionArray = new int[2];
        solutionArray = Sol.twoSum(numbers, 7);

        System.out.println(solutionArray[0] + " " + solutionArray[1]);
    }
}