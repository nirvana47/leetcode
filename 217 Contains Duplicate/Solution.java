class Solution {
    public boolean containsDuplicate(int[] nums) {

        // USING HASHSET
        HashSet<Integer> numsHashSet = new HashSet<>();

        for (int val : nums) {
            // WE DO NOT NEED TO CHECK USING 'CONTAINS' AS WHEN ADDING, IF VALUE ALREADY EXISTS, HASHSET WILL RETURN FALSE
            // if (numsHashSet.contains(val)) {
                // return true;
            // } else {
                // numsHashSet.add(val);
            // }
            if(numsHashSet.add(val) == false) {
                return true;
            }
        }

        return false;
        
        // SORT FIRST USING n•log(n) THEN CHECK
        // Arrays.sort(nums);

        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i-1] == nums[i]) {
        //         return true;
        //     }
        // }

        // return false;

        // BRUTE FORCE METHOD
        // if (nums.length == 1) {
        //     return false;
        // }

        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] == nums[j]) {
        //             return true;
        //         }
        //     }
        // }

        // return false;
    }
}
