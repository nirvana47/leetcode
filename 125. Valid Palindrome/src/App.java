public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String s = "A man, a plan, a canal: Panama";
        // String s = "aa";
        // String s = " ";
        Solution sol = new Solution();
        System.out.println(sol.isPalindrome(s));
    }
}
