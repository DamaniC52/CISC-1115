import java.util.*;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Conversion constants
        final double POUND_TO_KG = 0.45359237;
        final double INCH_TO_METER = 0.0254;
        
        // Prompt user for weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightPounds = input.nextDouble();
        
        // Prompt user for height in inches
        System.out.print("Enter height in inches: ");
        double heightInches = input.nextDouble();
        
        // Convert pounds to kilograms
        double weightKg = weightPounds * POUND_TO_KG;
        
        // Convert inches to meters
        double heightMeters = heightInches * INCH_TO_METER;
        
        // Calculate BMI
        double bmi = weightKg / (heightMeters * heightMeters);
        
        // Display the result
        System.out.printf("BMI is %.2f\n", bmi);
    }
}
