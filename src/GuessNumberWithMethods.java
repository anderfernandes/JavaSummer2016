/**
 * Created by instructor on 7/14/2016.
 */
import javax.swing.*;
public class GuessNumberWithMethods {

    public static void guess(int guess, int number, int attemps){
        String input = JOptionPane.showInputDialog(null,
                "Guess a number between 0 and 100.", "Attempt number " + attemps,
                JOptionPane.INFORMATION_MESSAGE);
        guess = Integer.parseInt(input);
        if (guess > number) {
            JOptionPane.showMessageDialog(null, "Wrong! Your guess is too " +                   "high.");
            attemps++;
        }
        else if (guess < number){
            JOptionPane.showMessageDialog(null, "Wrong! Your guess is too low.");
            attemps++;
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Correct! The magic number is " + number + "!");
        }
    }

    public static void guessWithWhile(int guess, int number, int attempts) {
        while (guess != number) {
            guess(guess, number, attempts);
        }
    }

    public static void guessWithDo(int guess, int number, int attempts) {
        do {
            guess(guess, number, attempts);
        } while (guess != number);
    }

    public static void guessWithFor(int guess, int number, int attempts){
        for ( guess= -1; guess !=number; attempts++) {
            guess(guess, number, attempts);
        }
    }

    public static void main(String[]args){
        int number = (int)(Math.random() * 101);
        JOptionPane.showMessageDialog(null, "Guess a number between 0 and 100.");
        int guess = -1;
        int attempts = 1;
        guessWithDo(guess, number, attempts);

    }
}
