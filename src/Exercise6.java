/**
 * Created by instructor on 7/12/2016.
 */

import javax.swing.JOptionPane;
public class Exercise6 {
    public static void main(String[]args){
        // Step 1: Get number from the user
        String input = JOptionPane.showInputDialog(null, "Enter a number from 0 to 1000:",
                "Andersoft Awesome 1.0", JOptionPane.INFORMATION_MESSAGE);
        double number = Double.parseDouble(input);
        // Step 2: Separate the numbers
        double firstDigit, secondDigit, thirdDigit;
        thirdDigit = number % 10;
        secondDigit = (number / 10) % 10;
        firstDigit = number / 100;
        double sum = firstDigit + secondDigit + thirdDigit;

        // Step 3: Show the sum of the digits
        JOptionPane.showMessageDialog(null, "The sum of " + (int)firstDigit + " " + (int)secondDigit +
                " " + (int)thirdDigit + " equals " + (int)sum);
    }
}
