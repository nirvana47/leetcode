public class Solution {
    public int removeElement(int[] nums, int val) {
        int frontPtr = 0;
        int backPtr = nums.length - 1;
        // int k = 0;

        while (frontPtr <= backPtr) {
            if (nums[frontPtr] != val) {
                frontPtr++;
                System.out.println("Front Ptr1: " + frontPtr);
            } else {
                // k++;
                // System.out.println("k in first else loop: " + k);
                if (nums[backPtr] == val) {
                    backPtr--;
                    System.out.println("back Ptr1: " + backPtr);
                    // k++;
                    // System.out.println("k in 2nd if loop: " + k);
                } else {
                    nums[frontPtr] = nums[backPtr];
                    nums[backPtr] = val;
                    frontPtr++;
                    backPtr--;
                }
            }
            System.out.println("Front Ptr2: " + frontPtr);
            System.out.println("back Ptr2: " + backPtr);
        }
        return frontPtr;
    }
}
