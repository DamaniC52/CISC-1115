import java.util.*;
public class Lab4 {
    public static void main(String[] args) {

        //Problem 1

    Scanner input = new Scanner(System.in);
       System.out.println(" Enter a X value "); 
       double x = input.nextDouble();

    Scanner input2 = new Scanner(System.in);
    System.out.println(" Enter a Y value "); 
       double y = input2.nextDouble();

    Scanner input3 = new Scanner(System.in);
    System.out.println(" Enter a A value "); 
       double a = input3.nextDouble();

    Scanner input4 = new Scanner(System.in);
    System.out.println(" Enter a B value "); 
       double b = input4.nextDouble();

    Scanner input5 = new Scanner(System.in);
    System.out.println(" Enter a C value "); 
    double c = input5.nextDouble();

        
        double answer; 
        answer = (3 + 4*x/5) - ((10 * (y - 5))*(a +b +c)/x) + (9* (4/x) + (9/x/y));
        
        System.out.println(" The answer to the expression is " + answer );

        //Problem 2 
        int r, t; 
        Scanner input_r = new Scanner(System.in);
        System.out.println(" Enter a R value ");
         r = input_r.nextInt();

        Scanner input_t = new Scanner(System.in);
        System.out.println(" Enter a t value ");
         t = input_t.nextInt();

        double answer_2 = Math.pow(r + 2.5, 2.5 + t) * 5.5;

        System.out.println (" The answer is " + answer_2) ;
    
        
        // Problem 3
       //The output would be 4
       //5 becomes 6 then -2 becomes -1, When you add it together the result is 4

       //Problem 4
        // The result of this problem is 9 

        //Problem 5 
        //The result is -1

        //Problem 6

        // This program will print the following 15 
                                                //20
                                                //-6 

        int C,D; 

        C = 15;
        D = -5;
        System.out.println((C+=5) + D--)  ;
	System.out.println(C);
	System.out.println(D);



    }
    
}
