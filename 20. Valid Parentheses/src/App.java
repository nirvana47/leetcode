public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Solution s = new Solution();
        String str1 = "}[";
        // String str2 = "(){}[]";
        // String str3 = "{]";

        System.out.println("str1: " + s.isValid(str1));
        // System.out.println("str2: " + s.isValid(str2));
        // System.out.println("str3: " + s.isValid(str3));
    }
}