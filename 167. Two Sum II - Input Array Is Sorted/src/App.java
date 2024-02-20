public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Solution sol = new Solution();
        // int[] nums = { 2, 7, 11, 15 };
        // int target = 9;

        // int[] nums = { 2, 3, 4, 15 };
        // int target = 6;
        
        int[] nums = { -1, 0, 2, 3, 4, 15 };
        int target = -1;

        int[] res = new int[2];
        res = sol.twoSum(nums, target);

        for(int i : res) {
            System.out.println("The indices are: " + res[0] + " and: " + res[1]);
            System.out.println("Thanks!");
        }
    }
}
