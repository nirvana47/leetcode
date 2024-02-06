public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Solution sol = new Solution();
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;

        int[] res = sol.topKFrequent(nums, k);

        for (int i : res) {
            System.out.println(i);
        }
    }
}
