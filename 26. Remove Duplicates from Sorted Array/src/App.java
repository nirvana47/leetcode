public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] nums = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        Solution sol = new Solution();
        System.out.println(sol.removeDuplicates(nums));
    }
}
