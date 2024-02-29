import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> twoSum = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (twoSum.containsKey(nums[i])) {
                return new int[] { twoSum.get(nums[i]), i };
            } else {
                twoSum.put(target - nums[i], i);
            }
        }
        return nums;
    }
}