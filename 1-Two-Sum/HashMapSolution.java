class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        
        // LOG (N) SOLUTION USING HASHMAP
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            if (numMap.containsKey(val)) {
                result[0] = i;
                result[1] = numMap.get(val);
                return result;
            } else {
                numMap.put(nums[i], i);
            }
        }

        return result;

        // LOG(N SQUARED) SOLUTION
        /* 
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
        */
    }
}
