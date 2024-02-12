public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] nums = { 1, 2, 3, 4 };
        Solution sol = new Solution();
        nums = sol.productExceptSelf(nums);

        for (int i : nums)
            System.out.println(i);
    }
}
