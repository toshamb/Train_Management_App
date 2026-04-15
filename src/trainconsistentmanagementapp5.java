import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

public class trainconsistentmanagementapp5 {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<Bogie> bogies = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Passenger Bogie");
            System.out.println("2. Add Goods Bogie");
            System.out.println("3. Display Consist Summary");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter passenger bogie type (Sleeper/AC Chair/First Class): ");
                    String pType = scanner.nextLine();
                    System.out.println("Enter seat capacity: ");
                    int seats = scanner.nextInt();
                    scanner.nextLine();
                    bogies.add(new Bogie(pType, seats + " seats"));
                    System.out.println(pType + " bogie added.");
                    break;

                case 2:
                    System.out.println("Enter goods bogie type (Rectangular/Cylindrical): ");
                    String gType = scanner.nextLine();
                    System.out.println("Enter cargo description: ");
                    String cargo = scanner.nextLine();
                    System.out.println("Enter safety status (Secured/Hazardous): ");
                    String safety = scanner.nextLine();
                    bogies.add(new Bogie(gType + " Goods", "Cargo: " + cargo + " (Safety: " + safety + ")"));
                    System.out.println(gType + " goods bogie added.");
                    break;

                case 3:
                    System.out.println("\n=== Consist Summary ===");
                    int passengerCount = 0, totalSeats = 0, goodsCount = 0;
                    for (Bogie bogie : bogies) {
                        System.out.println(" - " + bogie);
                        if (bogie.type.contains("Sleeper") || bogie.type.contains("AC") || bogie.type.contains("First")) {
                            passengerCount++;
                            String seatsStr = bogie.details.split(" ")[0];
                            totalSeats += Integer.parseInt(seatsStr);
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
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting application. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
