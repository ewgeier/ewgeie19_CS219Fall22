package Exam1Study;

import java.util.Scanner;

public class Exam1Studyc2f {
    public static double c2f(double c){
        return (9/5.0 * c + 32);
    }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        double c;
        while (true){
            System.out.print("Enter the temperature in degrees celsius: ");
            if (s.hasNextDouble()) {
                c = s.nextDouble();
                break;
            }
            else
                System.out.printf("Please enter the temperature as a decimal. You entered %s\n", s.next());
        }
        System.out.printf("The temperature is %.2f degrees fahrenheit.", c2f(c));
    }

    }

