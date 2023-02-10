public class Solution {
    public int lengthOfLastWord(String s) {
        int strLen = s.length();
        int lastWordLen = 0;
        for (int i = 0; i < strLen; i++) {
            if (s.charAt(strLen - i - 1) != ' ' && lastWordLen == 0) {
                lastWordLen++;
            } else if (s.charAt(strLen - i - 1) != ' ' && lastWordLen != 0) {
                lastWordLen++;
            } else if (s.charAt(strLen - i - 1) == ' ' && lastWordLen != 0) {
                return lastWordLen;
            } else if (s.charAt(strLen - i - 1) == ' ' && lastWordLen == 0) {
                continue;
            }
        }
        return lastWordLen;
    }

    /* 
     * When I submitted this on Leetcode, the memory consumption was higher than above
     * From a readability standpoint, not sure if 1 is better than the other. This is surely
     * a smaller piece of code than my implementation.
     */
    public int neetCodeLengthOfLastWord(String s) {
        int i = s.length() - 1, length = 0;
        while (s.charAt(i) == ' ') {
            i -= 1;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            length += 1;
            i -= 1;
        }
        return length;
    }
}
