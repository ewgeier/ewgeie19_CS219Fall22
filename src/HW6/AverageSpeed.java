package HW6;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class AverageSpeed {
    public static void SwallowStats() {

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
        double average = 0.0;
        double maximum = 0.0;
        double minimum = Double.POSITIVE_INFINITY;
        // reads each line of web file
        while (true) {

            if (!s.hasNextLine())
                break;

            String line = s.nextLine(); // read a line of the website

            if (line.length() > 0) {
                if (line.indexOf("#") == -1) {
                    sum = sum + Double.parseDouble(line);
                    count++;

                    if (Double.parseDouble(line) > maximum)
                        maximum = Double.parseDouble(line);
                    if (Double.parseDouble(line) < minimum)
                        minimum = Double.parseDouble(line);

                }
            }

        }
        average = sum / count;
        System.out.printf("The average swallow speed is %.2f, the maximum speed is %.1f, and the minimum speed is %.1f.",
                average, maximum, minimum);
    }
    public static void main(String [] args){
        SwallowStats();
    }
}
