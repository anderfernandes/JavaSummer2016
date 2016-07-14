/**
 * Created by instructor on 7/14/2016.
 */
import javax.swing.*;
public class Loops {
    public static void main(String[]args){
        int i = 0, sum = 0;
        while (i < 10){
            sum = sum+i;
            i++;
        }
        JOptionPane.showMessageDialog(null, "Sum is: " + sum);
    }
}
