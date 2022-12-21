class Solution {
    public int pivotIndex(int[] nums) {
        // if(nums.length == 1 && nums[0] != 0) {
        //     return -1;
        // }
        // else if(nums.length == 1 && nums[0] == 0) {
        //     return 0;
        // }
        // else if(nums.length == 2) {
        //     if(nums[1] == 0) {
        //         return 0;
        //     }
        //     else if(nums[0] == 0) {
        //         return 1;
        //     }
        // }

        // int pivotIndex = 0;
        int totalSum = 0;
        //int rightSum = 0;
        int leftSum = 0;

        // sum the whole array
        for(int elements : nums) {
            totalSum += elements;
        }
        
        // keep calculating leftSum and checking if totalSum - leftSum is half of totalSum
        // if it is, that means everything on the right will add up to leftSum and return the index

        for(int i = 0; i < nums.length; i++) {
            if(leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        /*
        while(pivotIndex < nums.length) {
            for(int i = 0; i < pivotIndex; i++) {
                rightSum += nums[i];
            }
            for (int j = pivotIndex + 1; j < nums.length; j++) {
                leftSum += nums[j];
            }
            if(rightSum == leftSum) {
                return pivotIndex;
            }
            else {
                pivotIndex++;
                rightSum = 0;
                leftSum = 0;
            }
        }
        */
        return -1;
   }
}
