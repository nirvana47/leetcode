import java.util.Arrays;

public class Solution {
    /*
     * Gave up on this approach. Too complicated. The idea was to sort the
     * original array, reverse it, then replace elements 1-by-1. 
     * First off, sorting would make it (N)(logN) complexity right off the bat.
     * Add to it the traversal. Bad idea. 
     */
    public int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            int[] result = new int[1];
            result[0] = -1;
            return result;
        }
        else {
            int[] result = new int[arr.length];
            int[] sortedArr = new int[arr.length];
            System.arraycopy(arr, 0, sortedArr, 0, arr.length);
            Arrays.sort(sortedArr);
            int lenArr = arr.length;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < sortedArr[lenArr - i - 1]) {
                    result[i] = sortedArr[lenArr - i - 1];
                }
                else if (arr[i] > sortedArr[lenArr - i - 1]) {

                }
            }
            return result;
        }
    }

    /*
     * In this approach, you start traversal in reverse order.
     * You don't need memoization, but more like 2 pointers: keep collecting the local maxes. 
     * Keep replaying the last element as you traverse. O(N) time complexity. No new array created
     * but 2 integer variables so S(1) space complexity.
     */
    public int[] replaceElementsNeetCode(int[] arr) {
        int max = -1;
        int newMax = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            newMax = Integer.max(max, arr[i]);
            arr[i] = max;
            max = newMax;    
        }

        return arr;
    }
}
