public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Solution sol = new Solution();
        // int[] nums = new int[] {0,1,2,2,3,0,4,2};
        // int val = 2;

        int[] nums = new int[] { 3, 2, 2, 3 };
        int val = 3;

        System.out.println(sol.removeElement(nums, val));
    }
}
