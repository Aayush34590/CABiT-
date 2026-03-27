import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Ride> rides = new ArrayList<>();

        


        while (true) {
            System.out.println("\n🚖 CABiT+ MENU");
            System.out.println("1. Book Ride");
            System.out.println("2. View All Rides");
            System.out.println("3. SOS Alert");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // fix input issue

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter distance (km): ");
                double distance = sc.nextDouble();

                Ride ride = new Ride(name, distance);
                rides.add(ride);

                FileHandler.saveRide(ride);

                System.out.println("Ride booked successfully ✅");

            } else if (choice == 2) {
                if (rides.isEmpty()) {
                    System.out.println("No rides found ❌");
                } else {
                    for (Ride r : rides) {
                        r.displayRide();
                    }
                }

            } else if (choice == 3) {
                  System.out.print("Enter your name: ");
                  String name = sc.nextLine();

                  SOS.sendAlert(name);
}

          else if (choice == 4) {
    System.out.println("Thank you for using CABiT+ 🚖");
    break;
} else {
                System.out.println("Invalid choice ❌");
            }
        }
    }
}