import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Test data
        List<String> originalList = Arrays.asList("neet", "code", "love", "you");

        Solution sol = new Solution();
        // String encodedStr = sol.encode(originalList);
        // System.out.println(encodedStr);

        // Encoding
        String encodedString = sol.encode(originalList);
        System.out.println("Encoded string: " + encodedString);

        // Decoding
        List<String> decodedList = sol.decode(encodedString);
        System.out.println("Decoded list: " + decodedList);

        // Verify if the decoded list matches the original list
        boolean isTestPassed = originalList.equals(decodedList);
        System.out.println("Test passed: " + isTestPassed);
    }
}
