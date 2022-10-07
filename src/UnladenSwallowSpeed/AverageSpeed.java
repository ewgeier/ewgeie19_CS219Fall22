package UnladenSwallowSpeed;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class AverageSpeed {
    public static double avg_swallow_speed() {

        // Connect to the webpage of speeds
        URL url = null; // null is the "nothing value"
        Scanner s = null;
        String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";

        try {
            url = new URL(path); // Create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // if you get here you successfully connected to the website

        double sum = 0.0;
        int count = 0;
        // reads each line of web file
        while (true) {

            if (!s.hasNextLine())
                break;

            String line = s.nextLine(); // read a line of the website

            if (line.indexOf("#") == -1){
                sum = sum + Double.parseDouble(line);
                count++;
            }

        }
        return sum/count;
    }
    public static void main(String [] args){
        System.out.printf("Average swallow speed is %.2f\n",
                avg_swallow_speed());

    }
}
