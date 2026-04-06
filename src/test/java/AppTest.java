import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testNormalFare() {
        double fare = App.calculateFare(10, false, 1.0);
        assertEquals(150.0, fare);
    }

    @Test
    void testPeakTimeFare() {
        double fare = App.calculateFare(10, true, 1.0);
        assertEquals(225.0, fare);
    }

    @Test
    void testDemandFare() {
        double fare = App.calculateFare(10, false, 1.5);
        assertEquals(225.0, fare);
    }
}