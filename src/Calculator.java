import java.util.Scanner;

public class Calculator {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");
        System.out.println("Operations: +  -  *  /  %");
        System.out.println("Type 'quit' to exit");
        System.out.println("========================");

        while (true) {
            System.out.print("\nEnter expression (e.g. 5 + 3): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye!");
                break;
            }

            String[] parts = input.split("\\s+");
            if (parts.length != 3) {
                System.out.println("Error: Enter in format: number operator number");
                continue;
            }

            double num1, num2;
            try {
                num1 = Double.parseDouble(parts[0]);
                num2 = Double.parseDouble(parts[2]);
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid number.");
                continue;
            }

            String operator = parts[1];
            double result;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                case "%":
                    if (num2 == 0) {
                        System.out.println("Error: Cannot mod by zero.");
                        continue;
                    }
                    result = num1 % num2;
                    break;
                default:
                    System.out.println("Error: Unknown operator '" + operator + "'");
                    continue;
            }

            // Print whole number if no decimal needed
            if (result == (long) result)
                System.out.println("= " + (long) result);
            else
                System.out.println("= " + result);
        }

        scanner.close();
    }
}
