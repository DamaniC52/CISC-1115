import java.util.*;
public class Feb24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 

        // System.out.println("Enter the number");
        // int num = input.nextInt(); 

        // if(num %2 == 0) {
        //     System.out.println(num + " is div by 2");
        // }
        // else if(num % 3 == 0) {
        //     System.out.println(num + " is div by 3");
        // }
        // else if(num % 5 == 0) {
        //     System.out.println(num + " is div by 5");
        // }
        // else {
        //     System.out.println(num + " is not divisible by 2, 3, or 5");
        // }

        // int x; 

        // System.out.println("Are you from NYS? 1-Yes 0-No");
        // x = input.nextInt(); 
        // double tuition; 
        // if (x==1) {

        //      tuition = 1000; 


        // }else {

        //      tuition = 5000; 

        // }
                    // System.out.println("you will pay " + tuition);


                    long number = System.currentTimeMillis(); 

                    int num1 = (int) number%10; 
                    int num2 =  (int) number/10%10; 
                    System.out.println(" what is " + num2 + " + " + num1);

                    int answer = input.nextInt();
                    if (answer == (num1+num2))

                        System.out.println("Corrrect");

                        else 
                            System.out.println("Incorrect");

                        int r = (int) (Math.random() * 200); 

                        System.out.println(r); 



    }




    
}
