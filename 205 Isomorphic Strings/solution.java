class Solution {
    public boolean isIsomorphic(String s, String t) {
        /*
        int[] mappingStoT = new int[256];
        Arrays.fill(mappingStoT, -1);

        int[] mappingTtoS = new int[256];
        Arrays.fill(mappingTtoS, -1);

        char c1, c2;

        for(int i = 0; i < s.length(); i++) {
            c1 = s.charAt(i);
            c2 = t.charAt(i);

            if(mappingStoT[c1] == -1 && mappingTtoS[c2] == -1) {
                mappingStoT[c1] = c2;
                mappingTtoS[c2] = c1;
            }
            else if(!(mappingStoT[c1] == c2 && mappingTtoS[c2] == c1)) {
                return false;
            }
        }
        return true;
        */
        return transformToIndex(s).equals(transformToIndex(t));
    }

    public String transformToIndex(String s) {
        Map<Character, Integer> st = new HashMap<>();
        StringBuilder stringToIndex = new StringBuilder();
        char c1;

        for(int i = 0; i < s.length(); i++) {
            c1 = s.charAt(i);

            if(!st.containsKey(c1)) {
                st.put(c1,i);
                stringToIndex.append(i);
            }
            else {
                stringToIndex.append(st.get(c1));
            }
            stringToIndex.append(" ");
        }

        return stringToIndex.toString();
    }
}
