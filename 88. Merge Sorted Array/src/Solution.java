
public class Solution {
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        // edge cases
        if (m == 1 && n == 0)
            return;
        else if (m == 0 && n == 1) {
            nums1[0] = nums2[0];
            return;
        } else if (m == 0 && n == 0) {
            return;
        }

        if (nums2[0] >= nums1[m - 1]) {
            for (int i = m, j = 0; i < m + n && j < n; i++, j++) {
                nums1[i] = nums2[j];
            }
        }

        for (int i = 0, j = 0; i < m + n;) {
            if (nums1[i] <= nums2[j]) {
                // no changes necessary to nums1
                i++;
                System.out.println("first if condition in for loop");
            } else {
                // need to shift nums1 left, i'th element onwards
                // insert nums2[j] into nums1[i]
                // then increment j so can compare next element in nums2 with nums1[i]
                System.out.println("else condition in for loop");
                for (int counter = m + n - 1; counter > i; counter--) {
                    System.out.println(
                            "nums1[counter] = " + nums1[counter] + " nums1[counter-1] = " + nums1[counter - 1]);
                    nums1[counter] = nums1[counter - 1];
                    System.out.println("inside for loop in the else " + counter);
                }
                System.out.println("nums1[i] = " + nums1[i] + " nums2[j] = " + nums2[j] + " i & j : " + i + " & " + j);
                nums1[i] = nums2[j];
                j++;
                i++;
            }
        }

        for (int i : nums1)
            System.out.println(i);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0 && i >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }
}
