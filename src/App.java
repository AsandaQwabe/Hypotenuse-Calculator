import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        // Declaring variables a and b are for the other sides of the triangle
        double a;
        double b;
        double h; // The hypotenuse

        try {
            // using JOptionPane to get the input from the user
            String inputA = JOptionPane.showInputDialog(null, "Enter value for side a:", "Hypotenuse Calculator", JOptionPane.QUESTION_MESSAGE);
            String inputB = JOptionPane.showInputDialog(null, "Enter value for side b:", "Hypotenuse Calculator", JOptionPane.QUESTION_MESSAGE);

            // Convert the input strings to double
            a = Double.parseDouble(inputA);
            b = Double.parseDouble(inputB);

            // calculation of the hypotenuse using a math formula
            h = Math.sqrt((a * a) + (b * b));

            
            JOptionPane.showMessageDialog(null, "The Hypotenuse is: " + h, "Result", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            // Handles invalid input
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter numeric values.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

