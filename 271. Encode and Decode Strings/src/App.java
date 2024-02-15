import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Test data
        List<String> originalList = Arrays.asList("neet", "code", "love", "you");

        Solution sol = new Solution();
        String encodedStr = sol.encode(originalList);

        System.out.println(encodedStr);
    }
}
