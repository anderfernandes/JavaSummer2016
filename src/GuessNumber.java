/**
 * Created by instructor on 7/14/2016.
 */
import javax.swing.*;
public class GuessNumber {
    public static void main(String[]args){
        int number = (int)(Math.random() * 101);
        JOptionPane.showMessageDialog(null, "Guess a number between 0 and 100.");
        int guess = -1;
        while (guess != number){
            String input = JOptionPane.showInputDialog(null,
                    "Guess a number between 0 and 100.");
            guess = Integer.parseInt(input);
            if (guess > number) {
                JOptionPane.showMessageDialog(null, "Wrong! Your guess is too high.");
            }
            else if (guess < number){
                JOptionPane.showMessageDialog(null, "Wrong! Your guess is too low.");
            }
            else {
                final ImageIcon koala = new ImageIcon("C:\\koala.jpg");
                JOptionPane.showMessageDialog(null,
                        " ", " You got it right! ",
                        JOptionPane.PLAIN_MESSAGE, koala);
            }
        }
    }
}
