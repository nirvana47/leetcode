import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            return res;
        }

        Map<String, List<String>> grpAnagramMap = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if (!grpAnagramMap.containsKey(sortedStr)) {
                grpAnagramMap.put(sortedStr, new ArrayList<>());
            }
            grpAnagramMap.get(sortedStr).add(str);
        }
        return new ArrayList<>(grpAnagramMap.values());
    }
}
