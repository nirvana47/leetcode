public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("58. Length of Last Word");
        Solution sol = new Solution();
        String str1 = "Hello World";
        String str2 = "   fly me   to   the  moon  ";
        String str3 = " a ";

        System.out.println("Str1's last word is " + sol.neetCodeLengthOfLastWord(str1) + " characters long.");
        System.out.println("Str2's last word is " + sol.neetCodeLengthOfLastWord(str2) + " characters long.");
        System.out.println("Str3's last word is " + sol.neetCodeLengthOfLastWord(str3) + " characters long.");
    }
}