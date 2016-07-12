/**
 * Created by instructor on 7/12/2016.
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Average {
    public static void main(String[]args){
        // Step 1: Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);
        // Step 2: Get user input
        System.out.print("Enter number 1: ");
        double number1 = input.nextDouble();
        System.out.print("Enter number 2: ");
        double number2 = input.nextDouble();
        System.out.print("Enter number 3: ");
        double number3 = input.nextDouble();
        // Step 3: Calculate Average
        double average = (number1+number2+number3)/3;
        // Step 4: Display the result
        System.out.println("The average is: " + average);
        JOptionPane.showMessageDialog(null, "The average is: " + average);
    }
}
