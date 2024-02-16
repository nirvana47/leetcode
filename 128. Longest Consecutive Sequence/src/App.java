public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Solution sol = new Solution();
        // int[] nums = {100, 4, 200, 1, 2, 3}; // Test Case
        int[] nums = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };

        System.out.println("Longest Consecutive Sequence: " + sol.longestConsecutive(nums));
    }
}
