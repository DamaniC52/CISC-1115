import java.util.*;
public class March24 {

    /* 
    public static void Hailey(String message , int num , char c){
        System.out.println(message + num +  c);
    } 
    public static void main(String[] args) {
        Hailey("one", 5 , '?');
                Hailey("Hello", 2, 'A');
*/

/* 

 public static void sayHello(String name ){

    System.out.println("Hello," + name);
    double x = add(2.3, 4 , 6); 
    add(4,5,6 ); 
    System.out.println(x);
    System.out.println ( add(4,5,6));
    }
    /* 

/* 
    public static double add(double a , double b, double c ) {
        double result = a + b + c ; 
        //System.out.println("The sum is " + result);
        return result; 
    }
        */
    public static void main(String[] args) {
    System.out.println(findMax(3, 4 ));


        Scanner input1 = new Scanner(System.in);
        System.out.println("Endter your midterm");
        double mid = input1.nextDouble(); 
        
        char grade = printLetter(mid);
        System.out.println("Your grade is " + grade);

    }
     public static void printMessage(int num, String message) {
         for( int i =0; i < num; i++){
             System.out.println(message);
         }
     }


    public static char printLetter (double midterm) {
        if (midterm >=  90)
            return ( 'A');
        else if (midterm >80)
            return ( 'B');
        else
            return ( 'c');

        
    }

    public static boolean isBigger (int a , int b ) {
        if (a>b)
            return true ; 
        
        else 
            return false; 
        
    }




     public static  int mult (int a , int b) {
        return a*b; 


         
     }

     public static double findMax (double a, double b ) {

        if (a>b)
            return a; 
        else 
            return b; 
         
     }

        
       }

