package Utility;

import java.util.Scanner;

public class Weather {

    public static double windchill(double t, // Temp
                                   double v) { // Velocity (MPH)
        return 35.74 + 0.6215*t + (0.4275 * t - 35.75) * Math.pow(v, .16);

    }

    public static double getTemperature(Scanner s){
        boolean valid = false;
        double temperature = 0;
        while(true){
            System.out.print("Enter a temperature in degrees F: ");
            if (s.hasNextDouble() == true){
                temperature = s.nextDouble();
                break;
                }
            else{
                System.out.printf("Error: please enter a decimal. You entered \"%s\"\n", s.next());
            }
            }
        return temperature;
        }

    public static double getVelocity(Scanner s){
        boolean valid = false;
        double velocity = 0;
        while (true) {
            System.out.print("Enter wind velocity in MPH: ");
            if (s.hasNextDouble() == true) {
                velocity = s.nextDouble();
                if (velocity < 0){
                    System.out.printf("Error: velocity cannot be negative. You entered %.2f\n", velocity);
                }
                else {
                    valid = true;
                    break;
                }

            } else {
                System.out.printf("Error: please enter a decimal number. You entered \"%s\"\n",
                        s.next());
            }
        }
        return velocity;
    }
    public static void main(String [] args){

        Scanner kbd = new Scanner(System.in);

        double temperature = getTemperature(kbd);

        double velocity = getVelocity(kbd);

        System.out.printf("The windchill for %.1f degrees F and %.1f MPH is %.2f\n",
                temperature, velocity, windchill(temperature, velocity));

    }

}
