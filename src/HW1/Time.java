package HW1;

public class Time {
    public static void main(String [] args) {
        // Code for exercise 2.3
        int hour = 17;
        int minute = 21;
        int second = 47;
        // Print time
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.print(":");
        System.out.print(second);

        // Calculate and print time since midnight
        int secs_past_midnight = (hour * 3600) + (minute * 60) + second;

        System.out.print(" is ");
        System.out.print(secs_past_midnight);
        System.out.println(" seconds since midnight.");

        // Calculate and print number of secs remaining in a day
        int secs_remaining = 86400 - secs_past_midnight; //total secs in a day minus secs that have passed already

        System.out.print("There are ");
        System.out.print(secs_remaining);
        System.out.println(" seconds remaining.");

        // Calculate and print the percentage of the day that has passed
        int percent_passed = ((secs_past_midnight * 100) / 86400);

        System.out.print(percent_passed);
        System.out.println("% of the day has passed.");

    }
}
