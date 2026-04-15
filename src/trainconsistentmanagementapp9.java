import java.util.ArrayList;
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

public class trainconsistentmanagementapp9 {
    public static int calculateTotalCapacity(List<Bogie> bogies) {
        return bogies.stream()
                .mapToInt(b -> b.capacity)
                .sum();
    }

    public static void main(String[] args) {
        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));

        int totalCapacity = calculateTotalCapacity(passengerBogies);
        System.out.println("Total passenger seat capacity: " + totalCapacity);
    }
}
