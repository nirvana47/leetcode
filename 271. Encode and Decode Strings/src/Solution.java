import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String encode(List<String> strs) {
        StringBuilder encodedSB = new StringBuilder();

        for (String s : strs) {
            if (s.isEmpty()) {
                encodedSB.append("0:");
            } else {
                encodedSB.append(s.length());
                encodedSB.append(":");
                encodedSB.append(s);
            }
        }

        String encodedStr = encodedSB.toString();
        return encodedStr;
    }

    public List<String> decode(String str) {
        List<String> strList = new ArrayList<>();
        return strList;
    }
}
