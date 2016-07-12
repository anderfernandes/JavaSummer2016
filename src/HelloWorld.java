import javax.swing.*; /**
 * Created by instructor on 7/11/2016.
 */ public class HelloWorld {public static void main(String[]args) {
        // Double slashes means code comment
        javax.swing.JOptionPane.showMessageDialog(null, "Result " +
                ((14/1.6)/(0.75)+((0.5/60)/60)),
                "Average Speed in Miles", JOptionPane.ERROR_MESSAGE);
    }
}
