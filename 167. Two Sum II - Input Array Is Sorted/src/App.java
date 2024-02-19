public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Solution sol = new Solution();
        int[] nums = { 1, 2, 3, 4 };
        int target = 3;

        nums = sol.twoSum(nums, target);
    }
}
