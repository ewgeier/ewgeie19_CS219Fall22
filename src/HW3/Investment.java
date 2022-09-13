/*
Erik Geier
HW3
09/13/2022
 */

package HW3;

import java.util.Scanner;

public class Investment {

    public static double investment(double c, double r, int t, int n) {
        return c * Math.pow(1+r/n, t*n);
    }
    public static void main(String [] args) {

        Scanner kbd = new Scanner(System.in);

        double c;

        System.out.print("Please enter initial deposit as a decimal: ");
        if (kbd.hasNextDouble() == true){
            c = kbd.nextDouble();
            if (c < 0) {
                System.out.printf("Error: please enter a positive decimal. You entered \"%s\"",
                        c);
                return;
            }
        }
        else {
            System.out.printf("Error: please enter a decimal. You entered \"%s\"",
                    kbd.next());
            return;
        }

        double r;

        System.out.print("What is the interest rate as a decimal?: ");
        if (kbd.hasNextDouble() == true) {
            r = kbd.nextDouble();
            if (r < 0) {
                System.out.printf("Error: please enter a positive decimal. You entered \"%s\"",
                        r);
                return;
            }
        }
        else {
            System.out.printf("Error: please enter a decimal. You entered \"%s\"",
                    kbd.next());
            return;
        }

        int t;

        System.out.print("Enter the number of years as an integer: ");
        if (kbd.hasNextInt() == true){
            t = kbd.nextInt();
            if (t < 0) {
                System.out.printf("Error: please enter a positive integer. You entered \"%s\"",
                        t);
                return;
            }
        }
        else {
            System.out.printf("Error: please enter an integer. You entered \"%s\"",
                    kbd.next());
            return;
        }
        int n;

        System.out.print("Enter how many times it compounds as an integer: ");
        if (kbd.hasNextInt() == true){
            n = kbd.nextInt();
            if (n < 0) {
                System.out.printf("Error: please enter a positive integer. You entered \"%s\"",
                        n);
                return;
            }
        }
        else {
            System.out.printf("Error: please enter an integer. You entered \"%s\"",
                    kbd.next());
            return;
        }

        System.out.printf("Your investment is worth %.2f",
                investment(c, r, t, n));
    }

}
