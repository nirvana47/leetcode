public class Solution {
    public int removeDuplicates(int[] nums) {
        int slowPtr = 0;
        int fastPtr = 1;

        while (fastPtr < nums.length) {
            if (nums[slowPtr] == nums[fastPtr]) {
                fastPtr++;
            } else {
                nums[++slowPtr] = nums[fastPtr++];
            }
        }

        return slowPtr + 1;
    }
}
