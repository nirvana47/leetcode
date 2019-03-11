class Solution {
    /**
     * Given an array of integers, return indices of the two numbers such that they
     * add up to a specific target. You may assume that each input would have
     * exactly one solution, and you may not use the same element twice.
     */
    public int[] twoSum(int[] nums, int target) {
        int[] sumIndice = new int[2];

        for (int i = 0; i < nums.length; i += 1) {
            for (int j = 0; j < nums.length; j += 1) {
                if (i == j) {
                    continue;
                } else if (nums[i] + nums[j] == target) {
                    sumIndice[0] = i;
                    sumIndice[1] = j;
                    return sumIndice;
                }

            }
        }
        return sumIndice;
    }

    public static void main(String[] args) {
        Solution Sol = new Solution();

        int[] numbers = new int[] { 2, 7, 5, 11 };
        int[] solutionArray = new int[2];
        solutionArray = Sol.twoSum(numbers, 7);

        System.out.println(solutionArray[0] + " " + solutionArray[1]);
    }
}