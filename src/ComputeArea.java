import java.util.Scanner; // Scanner is in the java.util package
public class ComputeArea {
    public static void main (String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        // Step 1: Read in radius
        double radius = input.nextDouble();
        // Step 2: Compute Area
        double area = Math.pow(radius, 2) * Math.PI;
        // Step 3: Display the area
        System.out.println("The area for circle of radius " + radius +
                " is " + area);
    }
}
