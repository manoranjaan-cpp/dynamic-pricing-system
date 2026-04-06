import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testNonPeakNormalDemand() {
        double fare = App.calculateFare(10, false, 1.0);
        // 50 + (10*10) = 150
        assertEquals(150.0, fare);
    }

    @Test
    void testPeakTime() {
        double fare = App.calculateFare(10, true, 1.0);
        // 150 * 1.5 = 225
        assertEquals(225.0, fare);
    }

    @Test
    void testHighDemand() {
        double fare = App.calculateFare(10, false, 1.5);
        // 150 * 1.5 = 225
        assertEquals(225.0, fare);
    }

    @Test
    void testPeakAndHighDemand() {
        double fare = App.calculateFare(10, true, 1.5);
        // 150 * 1.5 * 1.5 = 337.5
        assertEquals(337.5, fare);
    }
}