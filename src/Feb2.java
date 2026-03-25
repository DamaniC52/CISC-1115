    import java.util.*;

public class Feb2 {
    public static void main(String[] args) throws Exception {
        int num;
        num = 1;
        System.out.println(num); 
        num = 10;
        System.out.println(num);

        int num1 = 4, num2 = 5, num3 = 6;  
        System.out.println(num1 + num2);

        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);
        System.out.println("Third number = " + num3);

        String name = "Bob";
        System.out.println(name);

        double x = 2.3;
        int y = 5;
        char ch = 'a';
        x = 23;
        y = 0;
        System.out.println(ch + " " + x + " " + y);

        double pi = 3.14;
        double r = 2.7;
        double perimeter = (2 * pi * r);
        System.out.println("Perimeter = " + perimeter);

        int seconds;
        Scanner input = new Scanner(System.in);
         System.out.print("Enter seconds: ");
        seconds = input.nextInt();


        int minutes = seconds/60;
        seconds = seconds % 60;
        System.out.println("Minutes = " + minutes + " Seconds = " + seconds);

        int a = 19;
        int b = 5;
        int c = 2;
        int result = (a*a*a*a + 2*b)/(1/c)*(1/c);
        System.out.println("Result = " + result);

    }
}  