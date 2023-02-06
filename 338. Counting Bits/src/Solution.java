public class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        if (n == 0) {
            ans[n] = 0;
            return ans;
        } else {
            for(int i = 0; i < n + 1; i++) {
                if(i%2 == 0)
                    ans[i] = Integer.bitCount(i);
                else
                    ans[i] = count(i);
            }
        }
        return ans;
    }

    public void printArr(int[] testArr) {
        for (int i = 0; i < testArr.length; i++)
            System.out.println("Element " + i + " has " + testArr[i] + " '1' bits");
    }

    // USING BITWISE OPERATION TO COUNT.
    // FROM CHATGPT: 
    /*
     * &= is a compound assignment operator in Java that performs a bitwise AND operation 
     * and assigns the result to the left operand. In other words, x &= y is equivalent 
     * to x = x & y. The bitwise AND operation returns a number whose bits are set to 1 
     * only if the corresponding bits in both operands are set to 1.
     * 
     * This is an implementation of the "Brian Kernighan's Algorithm" to count the number 
     * of 1s in a binary representation of a number. The idea behind this algorithm is as 
     * follows: Each time you perform the operation x &= x - 1, you are effectively removing 
     * the rightmost 1-bit from the binary representation of x. By repeating this operation 
     * until x becomes 0, you can count the number of times you removed a 1-bit, which is 
     * equal to the number of 1s in the binary representation of the original number.
     */
    private int count(int x) {
        int count = 0;
        while (x != 0) {
            x &= x - 1;
            count++;
        }
        return count;
    }
}
