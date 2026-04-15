import java.util.ArrayList;
import java.util.List;

public class trainconsistentmanagementapp2 {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // UC1: Initialize empty train consist
        List<String> bogies = new ArrayList<>();
        System.out.println("Initial bogie count: " + bogies.size());

        // UC2: Add passenger bogies
        bogies.add("Sleeper - 72 seats");
        bogies.add("AC Chair - 56 seats");
        bogies.add("First Class - 24 seats");

        // Display updated consist summary
        System.out.println("\nPassenger bogies added:");
        for (String bogie : bogies) {
            System.out.println(" - " + bogie);
        }

        System.out.println("Total bogie count: " + bogies.size());
    }
}
