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
        // (which is why, i <= nums.lenght, because length starts at "1" and not "0").
        // Although, I wonder if we can keep it same lenght as nums and just add a "1"
        // to it.
        List<List<Integer>> topKList = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            topKList.add(new ArrayList<>());
        }
        // System.out.println(topKList);

        // Now we iterate through the frequency hash-map. For each element, we have the
        // frequency. So we will add the element at the frequency'th level. Imagine the
        // array is 3 elements long and it is [1,1,1]. So Hash-map will be <1, 3>. The
        // empty List of List will be 4 rows long. At the 4th row in List of Lists, we
        // will add "1".
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

        // Initialize a list to hold the result elements
        List<Integer> resultList = new ArrayList<>();

        // Start from the end of topKList because it represents the highest frequency
        for (int i = topKList.size() - 1; i >= 0; i--) {
            List<Integer> elements = topKList.get(i);
            for (int num : elements) {
                resultList.add(num);
                // Once we've added k elements, we can break out of the loop
                if (resultList.size() == k) {
                    break;
                }
            }
            // Check if we've already found k elements
            if (resultList.size() == k) {
                break;
            }
        }

        // Convert the resultList into the desired array format
        for (int i = 0; i < k; i++) {
            res[i] = resultList.get(i);
        }

        return res;
    }

    public int[] topKFrequent2(int[] nums, int k) {
        int[] resultArray = new int[k];

        // Step 1: Create a frequency HashMap and populate it with frequencies of
        // elements occuring in the input array nums
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i : nums) {
            if (!frequencyMap.containsKey(i)) {
                frequencyMap.put(i, 1);
            } else {
                frequencyMap.put(i, frequencyMap.get(i) + 1);
            }
        }

        // Step 2: Create an array of List of Integers, and initialize it, which will
        // act as our counter for frequencies. Then add values from Frequency HashMap to
        // it. The HashMap is elements mapped to
        // frequencies; now we flip it -- frequencies are mapped to all elements in
        // input array nums to make it easy to find the top k most frequent elements.
        @SuppressWarnings("unchecked")
        List<Integer> frequencyBucket[] = new ArrayList[nums.length + 1];
        for (int key : frequencyMap.keySet()) {
            int freq = frequencyMap.get(key);
            if (frequencyBucket[freq] == null) {
                frequencyBucket[freq] = new ArrayList<>();
            }
            frequencyBucket[freq].add(key);
        }
        // System.out.println(Arrays.toString(frequencyBucket));

        // Step 3: Once we get the frequency buckets created, now we go in reverse order
        // in that array to find the top frequent K items
        int index = 0;
        for (int i = nums.length; i > 0; i--) {
            if (frequencyBucket[i] != null) {
                for (int val : frequencyBucket[i]) {
                    resultArray[index] = val;
                    index += 1;
                    if (index == k) {
                        return resultArray;
                    }
                }

            }
        }
        return resultArray;
    }
}
