package Exam1;

import java.util.Scanner;

public class Exam1 {
    public static int btw27(int n){
        int count = 0;
        while (n > 0){
            if ((n % 10 > 2) && (n % 10 < 7)){
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public static int getN(Scanner s){
        int n = 0;
        while(true){
            System.out.print("Please enter a positive integer: ");
            if (s.hasNextInt()){
                n = s.nextInt();
                if (n >= 0){
                    break;
                }
                else{
                    System.out.printf("Error: please enter a positive integer. You entered \"%s\"\n",
                            n);
                }
            }
            else{
                System.out.printf("Error: please enter an integer. You entered \"%s\"\n",
                        s.next());
            }
        }
        return n;
    }

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = getN(s);
        System.out.printf("The number of digits between 2 and 7 in your integer is %d.", btw27(n));
    }
}
