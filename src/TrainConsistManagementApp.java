import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Print header
        System.out.println("=== Train Consist Management App ===");
        System.out.println("====================================");

        // Initialize train consist
        List<String> bogies = new ArrayList<>();

        // Display initialization details
        System.out.println("\nTrain initialized successfully...");
        System.out.println("Initial Bogie Count : " + bogies.size());
        System.out.println("Current Train Consist : " + bogies);

        // Final message
        System.out.println("\nSystem ready for operations...");
    }
}