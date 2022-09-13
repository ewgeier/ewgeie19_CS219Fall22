/*
Erik Geier
HW3
09/09/22


package Utility;

import java.util.Scanner;
public class InvestmentCalculator {

    public static double investment(double c, double r, int t, int n) {
        return c * Math.pow(1+r/n, t*n);

    }
    public static void main(String [] args) {

        double c;

        Scanner kbd = new Scanner(System.in);
        System.out.print("Please enter initial deposit as a double: ");
        if (kbd.hasNextDouble() == true && kbd.nextDouble() > 0) {
            c = kbd.nextDouble();
        }
        else
            System.out.printf("Error: please enter a positive number. You entered \"%s\"",
                    kbd.next());







        System.out.print("What is the interest rate?: ");
        double r = kbd.nextDouble();

        System.out.print("How many years?: ");
        int t = kbd.nextInt();

        System.out.print("How many times does it compound per year?: ");
        int n = kbd.nextInt();

        System.out.printf("Your investment is worth %.2f",
                investment(c, r, t, n));

    }

}


 */