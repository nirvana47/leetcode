import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i : nums) {
            if (!frequencyMap.containsKey(i)) {
                frequencyMap.put(i, 1);
            } else {
                frequencyMap.put(i, frequencyMap.get(i) + 1);
            }
            // as per ChatGPT, a more streamlined way to code however for me it reduced
            // understandability and readability, contradictory to what ChatGPT seems to
            // think
            // frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
        }

        // First create an empty List of List of Integers. Name it topKList.
        // Next, instantiate it for each frequency, which can go from 1 to size(nums)
        // (which is why, i <= nums.lenght)
        List<List<Integer>> topKList = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            topKList.add(new ArrayList<>());
        }
        // System.out.println(topKList);

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int element = entry.getKey();
            int freq = entry.getValue();
            topKList.get(freq).add(element);
        }

        /*
         * for (int i = 0; i < nums.length; i++) {
         * int freq = frequencyMap.get(nums[i]); // get the frequency of i'th item in
         * the input array
         * topKList.get(freq).add(nums[i]);
         * }
         */

        return res;
    }
}
