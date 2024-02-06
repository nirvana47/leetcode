import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        App app = new App();
        app.playWithLists();

        String[] strs = {"eat","tea","tan","ate","nat","bat","code"};
        // System.out.println("all is said and done" + "\n" + strs[0]);

        Solution sol = new Solution();
        List<List<String>> result = sol.groupAnagrams(strs);

        System.out.println(result);

    }

    public void playWithLists() {

        Map<String, ArrayList<String>> countryNames = new HashMap<String, ArrayList<String>>();

        // Add a list of names for the United States
        ArrayList<String> usNames = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        countryNames.put("United States", usNames);

        // Add a list of names for Canada
        ArrayList<String> canadaNames = new ArrayList<>(Arrays.asList("David", "Eve", "Fiona", "Harry"));
        countryNames.put("Canada", canadaNames);

        // Add a list of names for Mexico
        ArrayList<String> mexicoNames = new ArrayList<>(Arrays.asList("Gloria", "Hector", "Irene"));
        countryNames.put("Mexico", mexicoNames);

        //Add a list of names for India
        ArrayList<String> indiaNames = new ArrayList<>(Arrays.asList("Mahesh", "Hitesh", "Ramesh", "Siddharth", "Shivani"));
        countryNames.put("India", indiaNames);

        // countryNames.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
