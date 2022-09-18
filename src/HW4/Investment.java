/*
Erik Geier
HW4
09/16/2022
        */

package HW4;

import java.util.Scanner;

public class Investment {

    // Investment function
    public static double investment(double c, double r, int t, int n) {
        return c * Math.pow(1 + r / n, t * n);
    }

    // Get c
    public static double getC(Scanner s){
        boolean valid = false;
        double c = 0;
        while(true){
            System.out.print("Please enter initial deposit as a decimal: ");
            if (s.hasNextDouble() == true) {
                c = s.nextDouble();
                if (c >= 0) {
                    valid = true;
                    break;
                }
                else{
                    System.out.printf("Error: please enter a positive decimal. You entered \"%s\"\n",
                            c);
                }
            }
            else {
                System.out.printf("Error: please enter a decimal. You entered \"%s\"\n",
                        s.next());
            }
        }
        return c;
    }

    // Get r
    public static double getR(Scanner s){
        boolean valid = false;
        double r = 0;
        while(true){
            System.out.print("Please enter the interest rate as a decimal: ");
            if (s.hasNextDouble() == true) {
                r = s.nextDouble();
                if (r >= 0) {
                    valid = true;
                    break;
                }
                else{
                    System.out.printf("Error: please enter a positive decimal. You entered \"%s\"\n",
                            r);
                }
            }
            else {
                System.out.printf("Error: please enter a decimal. You entered \"%s\"\n",
                        s.next());
            }
        }
        return r;
    }

    // Get t
    public static int getT(Scanner s){
        boolean valid = false;
        int t = 0;
        while(true){
            System.out.print("Please enter the number of years as an integer: ");
            if (s.hasNextInt() == true) {
                t = s.nextInt();
                if (t >= 0) {
                    valid = true;
                    break;
                }
                else{
                    System.out.printf("Error: please enter a positive integer. You entered \"%s\"\n",
                            t);
                }
            }
            else {
                System.out.printf("Error: please enter an integer. You entered \"%s\"\n",
                        s.next());
            }
        }
        return t;
    }

    // Get n
    public static int getN(Scanner s){
        boolean valid = false;
        int n = 0;
        while(true){
            System.out.print("Please enter the number of times it compounds as an integer: ");
            if (s.hasNextInt() == true) {
                n = s.nextInt();
                if (n >= 0) {
                    valid = true;
                    break;
                }
                else{
                    System.out.printf("Error: please enter a positive integer. You entered \"%s\"\n",
                            n);
                }
            }
            else {
                System.out.printf("Error: please enter an integer. You entered \"%s\"\n",
                        s.next());
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double c = getC(s);
        double r = getR(s);
        int t = getT(s);
        int n = getN(s);

        System.out.printf("Your investment is worth %.2f",
                investment(c, r, t, n));
    }
}
