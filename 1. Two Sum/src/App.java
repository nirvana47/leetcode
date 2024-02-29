public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] nums = new int[] { 2, 7, 5, 11 };
        Solution sol = new Solution();

        int[] result = sol.twoSum(nums, 7);
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
