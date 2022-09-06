import Utility.Investment;

import java.util.Scanner;

public class InvestmentCalculator {

    public static void main(String [] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.print("Please enter initial deposit: ");
        double c = kbd.nextDouble();

        System.out.print("What is the interest rate?: ");
        double r = kbd.nextDouble();

        System.out.print("How many years?: ");
        int t = kbd.nextInt();

        System.out.print("How many times does it compound per year?: ");
        int n = kbd.nextInt();

        System.out.printf("Your investment is worth %.2f",
                Investment.investment(c, r, t, n));

    }

}
