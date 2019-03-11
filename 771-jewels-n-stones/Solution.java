class Solution {
    /**
     * You're given strings J representing the types of stones that are jewels, and
     * S representing the stones you have. Each character in S is a type of stone
     * you have. You want to know how many of the stones you have are also jewels.
     * 
     * The letters in J are guaranteed distinct, and all characters in J and S are
     * letters. Letters are case sensitive, so "a" is considered a different type of
     * stone from "A".
     * 
     * https://leetcode.com/problems/jewels-and-stones/
     */
    public int numJewelsInStones(String J, String S) {

        if (J.isEmpty() || S.isEmpty()) {
            return 0;
        }

        char[] charJ = J.toCharArray();
        char[] charS = S.toCharArray();
        int jewelInStones = 0;

        for (int i = 0; i < J.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (charJ[i] == charS[j]) {
                    jewelInStones += 1;
                }
            }
        }

        return jewelInStones;
    }

    /**
     * Java O(S+J) time and O(1) space using array ASCII values.
     * 
     * Comment from another user: If we consider J to be bounded (in this case, by
     * 256), then all solutions (including other solutions) are in terms of S only
     * for both time and space complexity. This is a reframing of the problem and
     * not an optimization in itself.
     */
    public int numJewelsInStones_alternate(String J, String S) {
        int[] hash = new int[256];
        for (int i = 0; i < S.length(); i++) {
            hash[S.charAt(i)]++;
        }
        int count = 0;
        for (int i = 0; i < J.length(); i++) {
            count += hash[J.charAt(i)];
        }
        return count;

    }

    public static void main(String[] args) {
        String J = "aAbBcCdDeEfFgGhHiIjJkK";
        String S = "ooofkaofoinoawngonJNALIBFOBOQINOAKNFLKNOnaoignoaieng";

        Solution Sol = new Solution();

        int jewelsInStone = Sol.numJewelsInStones(J, S);
        System.out.println(jewelsInStone);

        jewelsInStone = Sol.numJewelsInStones_alternate(J, S);
        System.out.println(jewelsInStone);
    }
}