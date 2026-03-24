import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("========================================");

        // Create HashSet
        Set<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (with duplicates)
        System.out.println("\nAdding Bogie IDs:");
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        System.out.println("Entered IDs : BG101, BG102, BG103, BG101, BG102");

        // Display unique bogie IDs
        System.out.println("\nFinal Unique Bogie IDs:");
        System.out.println(bogieIds);

        System.out.println("\nUC3 operations completed successfully...");
    }
}
