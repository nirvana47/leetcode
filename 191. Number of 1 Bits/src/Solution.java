public class Solution {
    public int hammingWeightCheating(int n) {
        // String binary = Integer.toBinaryString(n);
        // System.out.println("Binary represetnation of " + n + " is: " + binary);

        // String longBinary = Long.toBinaryString(n);
        // System.out.println("longBinary represetnation of " + n + " is: " + longBinary);
        
        String binary = Integer.toBinaryString(n);
        int hammingWt = 0;

        for (int i = 0; i < binary.length(); i++)
            if (binary.charAt(i) == '1')
                hammingWt++;
        
        return hammingWt;
    }
}
