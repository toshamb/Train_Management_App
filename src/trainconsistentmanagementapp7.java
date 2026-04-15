import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " - " + capacity + " seats";
    }
}

public class trainconsistentmanagementapp7 {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // UC7: Create passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));

        System.out.println("\nPassenger bogies before sorting:");
        for (Bogie bogie : passengerBogies) {
            System.out.println(" - " + bogie);
        }

        // Apply Comparator to sort by capacity
        passengerBogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nPassenger bogies sorted by capacity:");
        for (Bogie bogie : passengerBogies) {
            System.out.println(" - " + bogie);
        }
    }
}
