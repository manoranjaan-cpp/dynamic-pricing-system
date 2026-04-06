public class App {

    public static double calculateFare(double distance, boolean isPeakTime, double demandMultiplier) {
        double baseFare = 50;       
        double ratePerKm = 10;      

        double fare = baseFare + (distance * ratePerKm);

    
        fare = fare * demandMultiplier;

    
        if (isPeakTime) {
            fare = fare * 1.5;
        }

        return fare;
    }

    public static void main(String[] args) throws Exception {
        double fare = calculateFare(10, true, 1.2);
        System.out.println("Final Fare: " + fare);

    
        while (true) {
            Thread.sleep(10000);
        }
    }
}