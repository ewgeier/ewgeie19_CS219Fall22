package Exam1Study;

import java.util.Scanner;

public class Cone {
    public static double volume(double r, double h){
        return (1/3.0 * Math.PI * (r * r) * h);
    }

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);

        double r;
        while(true){
            System.out.print("Please enter the radius as a decimal: ");
            if (s.hasNextDouble()){
                r = s.nextDouble();
                if (r >= 0)
                    break;
                else
                    System.out.printf("Error: please enter a positive decimal. You entered %s\n", r);
            }
            else
                System.out.printf("Error: please enter a positive decimal. You entered %s\n", s.next());
        }

        double h;
        while(true){
            System.out.print("Please enter the height as a decimal: ");
            if (s.hasNextDouble()) {
                h = s.nextDouble();
                if (h >= 0)
                    break;
                else
                    System.out.printf("Error: please enter a positive decimal. You entered %s\n", h);
            }
            else
                System.out.printf("Error; please enter a positive decimal. You entered %s\n", s.next());
        }
        System.out.printf("The volume is %.2f\n", volume(r, h));
    }
}
