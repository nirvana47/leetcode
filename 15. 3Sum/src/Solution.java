import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        return new ArrayList<>();
    }

    public int[] twoSum(int[] numbers, int target, int start) {
        // int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            if (target - numbers[start] == numbers[end]) {
                return new int[] { start + 1, end + 1 };
            } else if (target - numbers[start] < numbers[end]) {
                end--;
            } else if (target - numbers[start] > numbers[end]) {
                start++;
            }
        }
        if (numbers[start] + numbers[end] != target)
        return new int[] { numbers[start], numbers[end] };
    }

    public List<List<Integer>> threeSumBruteForce(int[] nums) {
        List<List<Integer>> threeSum = new ArrayList<>();
        
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {

                }
            }
        }
    }
}
