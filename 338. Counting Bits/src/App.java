
public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Solution sol = new Solution();

        int x = 7;
        // int testArr[] = new int[x+1];
        // testArr = sol.countBits(x);
        // System.out.println("What is the meaning of this?");

        int testArr[] = sol.countBits(x);
        sol.printArr(testArr);
    }
}
