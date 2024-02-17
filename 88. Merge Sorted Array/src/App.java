public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3; int n = 3;
        Solution sol = new Solution();

        sol.merge(nums1, m, nums2, n);
    }
}
