import java.util.ArrayList;
import java.util.List;

public class trainconsistentmanagementapp1 {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize train consist using dynamic list
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Program continues...
        System.out.println("Train initialized successfully. Ready for operations!");
    }
}
