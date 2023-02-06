public class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        if (n == 0) {
            ans[n] = 0;
            return ans;
        } else {
            for(int i = 0; i < n + 1; i++) {
                ans[i] = Integer.bitCount(i);
            }
        }
        return ans;
    }

    public void printArr(int[] testArr) {
        for (int i = 0; i < testArr.length; i++)
            System.out.println("Element " + i + " has " + testArr[i] + " '1' bits");
    }
}
