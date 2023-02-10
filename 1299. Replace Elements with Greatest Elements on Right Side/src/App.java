public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("1299. Replace Elements with Greatest Element on Right Side");
        Solution sol = new Solution();

        int[] arr = new int[] {400};
        int[] result = new int[arr.length + 1];
        result = sol.replaceElementsNeetCode(arr);

        for (int i : result)
            System.out.print(i + " ");
        
        System.out.println();
    }
}
