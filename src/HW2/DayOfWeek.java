/*
Erik Geier
09/06/2022
HW2
 */

package HW2;

import java.util.Scanner;

public class DayOfWeek {

    public static int dayofweek(int m, // Month
                                int d, // Day
                                int y) { // Year

        int y0 = y-(14-m)/12;
        int x = y0+y0/4-y0/100+y0/400;
        int m0 = m+12*((14-m)/12)-2;
        return (d+x+31*m0/12)%7;


    }

    public static void main(String [] args){
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter a month: ");
        int m = kbd.nextInt();

        System.out.print("Enter a day: ");
        int d = kbd.nextInt();

        System.out.print("Enter a year: ");
        int y = kbd.nextInt();

        System.out.print(dayofweek(m, d, y));

    }

}
