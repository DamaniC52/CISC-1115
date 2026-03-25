import java.util.*;
public class Lab5 {
    
        public static void main(String[] args) throws Exception {
            //Problem 1
            System.out.println(" Enter decimal Amount");
            double money, cents , dollars , remainder , quaters, dimes , nickles , penny, remainder_Q, remainder_D, remainder_N ; 
            Scanner input = new Scanner(System.in);
            money = input.nextDouble(); 
            
            cents = money * 100; 
            dollars = (int) cents / 100; 
            remainder = cents % 100; 
            quaters = (int) remainder / 25; 
            remainder_Q = -1 * (quaters * 25 - remainder);
            dimes = (int) remainder_Q / 10 ; 

             remainder_D =  remainder_Q % 10;

            nickles = (int) remainder_D / 5;

            remainder_N = remainder_D % 5;
            penny =  remainder_N / 1 ; 


            System.out.println("You have " + dollars + " dollars Or " + cents + " cents ");
            System.out.println("The remainding cents is  " + remainder);
            System.out.println(" You have " + quaters +  " quaters " + dimes + " Dimes " + nickles + " nickles and " + penny );
            //Problem 2

            double F, C;
                        Scanner inputf = new Scanner(System.in);
                        System.out.println("Enter the temperature in Celeius");
                         C = inputf.nextDouble();

                        F = (9/5) * C +32; 

                        System.out.println("The tempurture in Farenihit is " + F);

        
        //Problem 3


        double Feet, Meters;

        System.out.println("Enter your height in Feet");
            Scanner input_Feet = new Scanner(System.in); 
            Feet = input_Feet.nextDouble(); 

            Meters = Feet * 0.305; 
            System.out.println(Meters);

            //Problem 4

            Scanner input_3 = new Scanner(System.in);
        
        final double POUND_TO_KG = 0.45359237;
        final double INCH_TO_METER = 0.0254;
        
        System.out.print("Enter weight in pounds: ");
        double weightPounds = input_3.nextDouble();
        
        System.out.print("Enter height in inches: ");
        double heightInches = input_3.nextDouble();
        
        double weightKg = weightPounds * POUND_TO_KG;
        
        double heightMeters = heightInches * INCH_TO_METER;
        
        double bmi = weightKg / (heightMeters * heightMeters);
        
        System.out.printf("BMI is " + bmi);



        }


    }

    