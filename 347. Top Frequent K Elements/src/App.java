public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Solution sol = new Solution();
        int[] nums = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2,
                2, 3, 100, 4, 4, 4, 6, 7, 8, 9, 10, 11, 11, 12, 13, 14, 145, 16, 16, 15, 13, 12, 12, 12, 12, 12, 11, 11,
                1, 1, 1, 2, 2, 2, 3, 4, 5, 6, 7, 8, 0 };
        int k = 3;

        int[] res = sol.topKFrequent2(nums, k);

        for (int i : res) {
            System.out.println(i);
        }
    }
}
