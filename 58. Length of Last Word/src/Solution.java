public class Solution {
    public int lengthOfLastWord(String s) {
        int strLen = s.length();
        int lastWordLen = 0;
        for (int i = 0; i < strLen; i++) {
            if (s.charAt(strLen - i - 1) != ' ' && lastWordLen == 0) {
                lastWordLen++;
            } 
            else if (s.charAt(strLen - i -1) != ' ' && lastWordLen != 0) {
                lastWordLen++;
            }
            else if (s.charAt(strLen - i - 1) == ' ' && lastWordLen != 0) {
                return lastWordLen;
            }
            else if (s.charAt(strLen - i - 1) == ' ' && lastWordLen == 0) {
                continue;
            }
        }
        return lastWordLen;
    }
}
