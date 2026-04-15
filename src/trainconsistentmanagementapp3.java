import java.util.ArrayList;
import java.util.List;

public class trainconsistentmanagementapp3 {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // UC1: Initialize empty train consist
        List<String> bogies = new ArrayList<>();
        System.out.println("Initial bogie count: " + bogies.size());

        // UC2: Add passenger bogies
        bogies.add("Sleeper - 72 seats");
        bogies.add("AC Chair - 56 seats");
        bogies.add("First Class - 24 seats");

        System.out.println("\nPassenger bogies added:");
        for (String bogie : bogies) {
            System.out.println(" - " + bogie);
        }
        System.out.println("Total bogie count after passengers: " + bogies.size());

        // UC3: Add goods bogies
        bogies.add("Rectangular Goods Bogie - Cargo: Coal (Safety: Secured)");
        bogies.add("Cylindrical Goods Bogie - Cargo: Oil (Safety: Hazardous)");

        System.out.println("\nGoods bogies added:");
        for (int i = 3; i < bogies.size(); i++) { // print only goods bogies
            System.out.println(" - " + bogies.get(i));
        }

        System.out.println("Final bogie count: " + bogies.size());
    }
}
