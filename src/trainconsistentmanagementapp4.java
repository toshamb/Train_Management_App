import java.util.ArrayList;
import java.util.List;

class Bogie {
    String type;
    String details;

    Bogie(String type, String details) {
        this.type = type;
        this.details = details;
    }

    @Override
    public String toString() {
        return type + " - " + details;
    }
}

public class trainconsistentmanagementapp4 {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // UC1: Initialize empty train consist
        List<Bogie> bogies = new ArrayList<>();
        System.out.println("Initial bogie count: " + bogies.size());

        // UC2: Add passenger bogies
        bogies.add(new Bogie("Sleeper", "72 seats"));
        bogies.add(new Bogie("AC Chair", "56 seats"));
        bogies.add(new Bogie("First Class", "24 seats"));

        // UC3: Add goods bogies
        bogies.add(new Bogie("Rectangular Goods", "Cargo: Coal (Safety: Secured)"));
        bogies.add(new Bogie("Cylindrical Goods", "Cargo: Oil (Safety: Hazardous)"));

        // UC4: Display full consist summary with compliance check
        System.out.println("\n=== Consist Summary ===");
        int passengerCount = 0;
        int totalSeats = 0;
        int goodsCount = 0;

        for (Bogie bogie : bogies) {
            System.out.println(" - " + bogie);
            if (bogie.type.contains("Sleeper") || bogie.type.contains("AC") || bogie.type.contains("First")) {
                passengerCount++;
                String seats = bogie.details.split(" ")[0]; // extract seat number
                totalSeats += Integer.parseInt(seats);
            } else {
                goodsCount++;
                if (bogie.details.contains("Hazardous")) {
                    System.out.println("   ⚠ Safety Alert: Hazardous cargo requires compliance check!");
                }
            }
        }

        System.out.println("\nPassenger bogies: " + passengerCount);
        System.out.println("Total passenger seat capacity: " + totalSeats);
        System.out.println("Goods bogies: " + goodsCount);
        System.out.println("Final bogie count: " + bogies.size());
    }
}
