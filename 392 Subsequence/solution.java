class Solution {
    public boolean isSubsequence(String s, String t) {
        // char c1, c2;
        int sIndex = 0;
        if(s.length() == 0) {
            return true;
        }
        if(s.length() > t.length()) {
            return false; 
        }

        for(int tIndex = 0; tIndex < t.length() && sIndex < s.length(); tIndex++) {
            // c1 = s.charAt(sIndex);
            // c2 = t.charAt(tIndex);

            if(s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
        }
        if(sIndex < s.length()) {
            return false;
        }
        else {
            return true;
        }
    }
}
