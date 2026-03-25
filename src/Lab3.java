import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args) {
        //Problem 1
        System.out.println(56 % 6);
        System.out.println(78 % -4);
        System.out.println(-34 % 5);
        System.out.println(-34 % -5);
        System.out.println(5 % 1);
        System.out.println(1 % 5);
        //Problem 2
        System.out.println(2 * (5 / 2 + 5 / 2));
System.out.println(2 * 5 / 2 + 2 * 5 / 2);
System.out.println(2 * (5 / 2));
System.out.println(2 * 5 / 2);
//Problem 3
System.out.println("25 / 4 is " + 25 / 4);
System.out.println("25 / 4.0 is " + 25 / 4.0);
System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);
//Problem 4
int m , r;
Scanner input = new Scanner (System.in);
System.out.print("Enter m ");
m = input.nextInt();
Scanner input2 = new Scanner (System.in);
System.out.print("Enter r ");
r = input2.nextInt();

double mr = (r*m) * ( r*m); 
System.out.println("mr^2 is " + mr); 

//Problem 5

int inital = 1000; 
int payment = 65;

double months = inital / payment; 

System.out.println( "youll have " + months + " months of payments "); 

double Leftover  = months * payment; 

double FinalPayment = inital - Leftover; 

System.out.println(" Your final payment will be " + FinalPayment);

//problem 6
int seconds; 
Scanner input3 = new Scanner (System.in);
System.out.print("Enter seconds ");
seconds = input.nextInt();

int mintues = seconds / 60; 
int mintues2 = seconds % 60; 
int hours = mintues / 60;
int hours_remainder = mintues % 60;
int updated_minutes = hours_remainder + mintues2  ; 

System.out.print( hours + " hours " + updated_minutes + " minutes and seconds " + mintues2);
        




    }
    
}
