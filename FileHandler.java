import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    public static void saveRide(Ride ride) {
        try {
            FileWriter fw = new FileWriter("rides.txt", true);

            fw.write(ride.name + "," + ride.distance + "," + ride.fare + "\n");

            fw.close();

            System.out.println("Ride saved to file ");

        } catch (IOException e) {
            System.out.println("Error saving file ");
            e.printStackTrace();
        }
    }
}