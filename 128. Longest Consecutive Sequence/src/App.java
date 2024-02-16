public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Solution sol = new Solution();
        int[] nums = {100, 4, 200, 1, 2, 3};

        System.out.println("Longest Consecutive Sequence: " + sol.longestConsecutive(nums));
    }
}
