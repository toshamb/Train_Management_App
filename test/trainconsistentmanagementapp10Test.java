import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class trainconsistentmanagementapp10Test {

    @Test
    void testReduce_TotalSeatCalculation() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        int result = trainconsistentmanagementapp10.countTotalSeats(bogies);
        assertEquals(152, result);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("Luxury", 100));
        bogies.add(new Bogie("AC Chair", 56));

        int result = trainconsistentmanagementapp10.countTotalSeats(bogies);
        assertEquals(228, result);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));

        int result = trainconsistentmanagementapp10.countTotalSeats(bogies);
        assertEquals(72, result);
    }

    @Test
    void testReduce_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();
        int result = trainconsistentmanagementapp10.countTotalSeats(bogies);
        assertEquals(0, result);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));

        trainconsistentmanagementapp10.countTotalSeats(bogies);

        assertEquals(2, bogies.size()); // original list unchanged
    }
}
