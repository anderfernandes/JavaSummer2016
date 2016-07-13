/**
 * Created by instructor on 7/13/2016.
 */
import java.util.Scanner;
public class HeadsOrTails {
    public static void main(String[]args){
        // Step 1: Randomly generate head or tails
        int coin = (int)(Math.random()) * 2;

        // Step 2: Ask user for input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 for heads and 1 for tails: ");
        int answer = input.nextInt();

        // Step 3: Compare coin with input and show the answer
        if (coin == answer){
            // We have a match!
            System.out.print(coin + " and  " + answer + " match? " + (coin==answer));
        }
        else{
            // No match!
            System.out.print(coin + " and  " + answer + " match? " + (coin==answer));
        }
    }
}
