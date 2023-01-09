public class Solution {    
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        
        if (s.length() == 1 || s.isEmpty() || s == null) {
            return true;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        
        return true;
    }
}
