public class Ride {

    String name;
    double distance;
    double fare;
    

    public double calculateFuel() {
    return distance * 0.1; // approx fuel usage
}
    // Constructor
    public Ride(String name, double distance) {
        this.name = name;
        this.distance = distance;
        this.fare = 50 + (distance * 10);
    }

    // Display ride details
    public void displayRide() {
    System.out.println("\n--- Ride Details ---");
    System.out.println("Name: " + name);
    System.out.println("Distance: " + distance + " km");
    System.out.println("Fare: Rs. " + fare);
    System.out.println("Fuel Used: " + calculateFuel() + " liters ");
}
}