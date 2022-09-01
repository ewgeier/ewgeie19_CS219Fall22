package Utility;

import java.util.Scanner;

public class Weather {

    public static double windchill(double t, // Temp
                                   double v) { // Velocity (MPH)
        return 35.74 + 0.6215*t + (0.4275 * t - 35.75) * Math.pow(v, .16);

    }

    public static void main(String [] args){
        // used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter temperature in degrees F: ");
        double temperature = kbd.nextDouble();

        System.out.print("Enter wind velocity in MPH: ");
        double velocity = kbd.nextDouble();

        System.out.printf("The windchill for %.1f degrees F and %.1f MPH is %.2f\n",
                temperature, velocity, windchill(temperature, velocity));

        System.out.println("They said \"don't do it\"");

    }

}
