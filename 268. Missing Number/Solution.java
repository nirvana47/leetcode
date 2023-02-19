class Solution {
    public int missingNumber(int[] nums) {
        // String s = "Abc what is the meaning of this?"
        if (nums.length == 1) return (1 - nums[0]);
        
        int sum = 0;
        int trueSum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            trueSum += i;
        }

        return (trueSum + nums.length - sum);
    }
}
