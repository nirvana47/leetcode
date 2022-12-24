import java.util.Arrays;

public class LongestPalindrome{
    public static void main(String[] args) {
        
        String s1 = "abccccdd";
        // String s2 = "ccc";

        LongestPalindrome lp = new LongestPalindrome();
        System.out.println("String 1: " + lp.longestPalindrome(s1));
        // System.out.println("next string");
        // System.out.println("String 2: " + lp.longestPalindrome(s2));

        // System.out.println("Ascii value of 'z' is " + (int)'z');
        // for(int i = 0; i < 58; i++){
        //     System.out.println((char)(i+65));
        // }

    }

    public int longestPalindrome(String s) {
        // System.out.println("1 divided by 2 : " + 3/2);
        if(s.length() == 1) return 1;
        int[] sMap = new int[58]; 
        Arrays.fill(sMap, 0);
        int palindromeLength = 0;
        // int singleAlpha = 0;
        // int oddCheck = 0;

        for(int i = 0; i < s.length(); i++) {
            sMap[(int)s.charAt(i) - 65] += 1; 
        }

        for(int charCount : sMap) {
            palindromeLength += (charCount / 2) * 2;
        }

        if(palindromeLength < s.length()) {
            return palindromeLength + 1;
        } else {
            return palindromeLength;
        }

        /*
        for(int num : sMap) {
            if(num % 2 == 0 && num != 0) {
                palindromeLength += num;
                System.out.println("1st condition check: " + palindromeLength + " and oddCheck: " + oddCheck);
                oddCheck = 1;
            }
            else if(num > 1) {
                if(oddCheck == 0) {
                    palindromeLength += num;
                    oddCheck = 1;
                    System.out.println("2(a) condition check: " + palindromeLength + " and oddCheck: " + oddCheck);
                } else {
                    palindromeLength += num - 1;
                    System.out.println("2(b) condition check: " + palindromeLength + " and oddCheck: " + oddCheck);
                }
            }
            else if(num == 1 && singleAlpha == 0) {
                palindromeLength += 1;
                singleAlpha += 1;
                // System.out.println("3rd condition check: " + palindromeLength + " and singleAlpha: " + singleAlpha);
            }
        }
         */
        // System.out.println("sMap looks like: " + Arrays.toString(sMap));
        // return palindromeLength;
    }
}
