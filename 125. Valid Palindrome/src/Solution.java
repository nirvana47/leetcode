public class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            while (start <= end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
                // System.out.println("start++");
            }

            while (start <= end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
                // System.out.println("end--");
            }

            if (start <= end && Character.toLowerCase(s.charAt(start++)) != Character.toLowerCase(s.charAt(end--)))
                return false;

            // System.out.println("looping");
            // start++;
            // end--;
        }

        return true;
    }
}
