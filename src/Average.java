/**
 * Created by instructor on 7/12/2016.
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Average {
    public static void main(String[]args){
        // Step 1: Get user input with JOptionPane
        // Getting number 1
        String input = JOptionPane.showInputDialog(null, "Enter number 1:", "Calculate Average",
                       JOptionPane.INFORMATION_MESSAGE);
        double number1 = Double.parseDouble(input);
        // Getting number 2
        input = JOptionPane.showInputDialog(null, "Enter number 2:", "Calculate Average",
                JOptionPane.INFORMATION_MESSAGE);
        double number2 = Double.parseDouble(input);
        // Getting number 3
        input = JOptionPane.showInputDialog(null, "Enter number 3:", "Calculate Average",
                JOptionPane.INFORMATION_MESSAGE);
        double number3 = Double.parseDouble(input);
        // Step 3: Calculate Average
        double average = (number1+number2+number3)/3;
        // Step 4: Display the result
        JOptionPane.showMessageDialog(null, "The average is: " + average);
    }
}
