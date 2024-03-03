import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrialOfList {
    public void threeSumEx() {
        // Initialize the threeSum list
        List<List<Integer>> threeSum = new ArrayList<>();

        // Add four triplets to the list
        threeSum.add(Arrays.asList(1, -1, 0)); // Triplet 1
        threeSum.add(Arrays.asList(2, -1, -1)); // Triplet 2
        threeSum.add(Arrays.asList(-1, -1, 2)); // Triplet 3
        threeSum.add(Arrays.asList(0, 1, -1)); // Triplet 4

        // Print all triplets
        for (List<Integer> triplet : threeSum) {
            System.out.println(triplet);
        }
    }

}
