import java.util.Scanner;

public class lab9 {
    public static void main(String[] args) {

        // 1) Evaluate Math method calls
        System.out.println("1) Math method calls:");
        System.out.println("Math.sqrt(4) = " + Math.sqrt(4));                       // 2.0
        System.out.println("Math.pow(2, 2) = " + Math.pow(2, 2));                   // 4.0
        System.out.println("Math.exp(1) = " + Math.exp(1));                          // 2.718...
        System.out.println("Math.max(2, Math.min(3, 4)) = " + Math.max(2, Math.min(3, 4))); // 3
        System.out.println("Math.ceil(-2.5) = " + Math.ceil(-2.5));                  // -2.0
        System.out.println("Math.floor(-2.5) = " + Math.floor(-2.5));                // -3.0
        System.out.println("Math.round(-2.5f) = " + Math.round(-2.5f));              // -2
        System.out.println("Math.round(-2.5) = " + Math.round(-2.5));                // -2
        System.out.println("Math.ceil(2.5) = " + Math.ceil(2.5));                    // 3.0
        System.out.println("Math.floor(2.5) = " + Math.floor(2.5));                  // 2.0
        System.out.println("Math.round(2.5f) = " + Math.round(2.5f));                // 3
        System.out.println("Math.round(2.5) = " + Math.round(2.5));                  // 3
        System.out.println("Math.round(Math.abs(-2.5)) = " + Math.round(Math.abs(-2.5))); // 3

        // 4) Random numbers
        System.out.println("\n4) Random numbers:");
        int rand34to55 = (int)(Math.random() * 22) + 34;
        System.out.println("Random int between 34 and 55: " + rand34to55);

        int rand0to999 = (int)(Math.random() * 1000);
        System.out.println("Random int between 0 and 999: " + rand0to999);

        double rand5to55 = Math.random() * 50 + 5.5;
        System.out.println("Random number between 5.5 and 55.5: " + rand5to55);

        // 6) Pentagon area
        System.out.println("\n6) Pentagon area:");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();

        double s = 2 * r * Math.sin(Math.PI / 5);
        double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));

        System.out.printf("The area of the pentagon is %.2f%n", area);
        input.close();
    }
}
