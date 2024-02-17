public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // int[] nums1 = {1,2,3,0,0,0};
        // int[] nums2 = {2,5,6};
        // int m = 3; int n = 3;

        // int[] nums1 = {2,0};
        // int[] nums2 = {1};
        // int m = 1; int n = 1;

        // int[] nums1 = { 4, 5, 6, 0, 0, 0 };
        // int[] nums2 = { 1, 2, 3 };
        // int m = 3;
        // int n = 3;

        int[] nums1 = {0,0,0,0,0};
        int[] nums2 = {1,2,3,4,5};
        int m = 0; int n = 5;

        Solution sol = new Solution();

        sol.merge(nums1, m, nums2, n);
    }
}
