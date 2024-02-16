
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        int maxCounter = 0;
        /*
         * Map<Integer,Integer> numsMap = new HashMap<>();
         * for (int i : nums) {
         * if(!numsMap.containsKey(i)) {
         * numsMap.put(i, 1);
         * }
         * }
         * This is not as efficient, as we don't really care for values
         */

        if (nums.length == 0)
            return 0;
        else if (nums.length == 1)
            return 1;

        Set<Integer> numsSet = new HashSet<>();
        for (int i : nums) {
            numsSet.add(i);
        }

        for (int i : nums) {
            if (!numsSet.contains(i - 1)) {
                // this means, this could be the start of a sequence
                int counter = 0;
                while (numsSet.contains(i)) {
                    i += 1;
                    counter += 1;
                }
                if (counter > maxCounter)
                    maxCounter = counter;
            }
        }

        return maxCounter;
    }
}
