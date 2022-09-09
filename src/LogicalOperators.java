import java.util.Random;

public class LogicalOperators {

    public static void main (String [] args){

        Random r = new Random();

        int coinflip = r.nextInt(2); // random number up to but not including 2

        if (coinflip == 0) {
            System.out.println("Heads");
            }
        else {
            System.out.println("Tails");
        }

        int die1 = r.nextInt(6) + 1;
        int die2 = r.nextInt(6) + 1;

        if (die1 == 1 && die1 == 1){
            System.out.println("Snake eyes");
        }

        if (die1 == 1){
            if (die2 ==1){
                System.out.print("Snake eyes");
            }
        }

        if (die1 !=1 || die2 !=1){
            System.out.println("At least one die was not a won");
        }

        if (die1 != 1)
            System.out.print("Die 1 was not a one");
        else if (die2 != 1)
            System.out.println("Die2 was not a one");

        //Exactly one one
        if (die1 == 1){
            if (die2 !=1)
                System.out.println("Only die1 is one");
        }
        if (die2 == 1){
            if (die1 != 1)
                System.out.println("Only die2 is one");
        }

        //Also works
        if ((die1 == 1 || die2 == 1) && (die1 != die2)){
            System.out.println("One die is not one");
        }

        // check if die 1 is between 2 and 5 inclusive
        if (die1 >= 2 && die1 <= 5){
            System.out.println("Between 2 and 5");
        }

    }
}
