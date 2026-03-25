
import java.util.*;
public class Lab6 {
        public static void main(String[] args) {
            int x, y ;


            Scanner input = new Scanner (System.in);
            System.out.print("Enter x ");       
             x = input.nextInt();


            Scanner input_y = new Scanner (System.in);
            System.out.print("Enter y ");       
             y = input.nextInt();


             if ( y>0  ) { 

                x = 1; 

                 
             }

             else {

                x = 0; 

             }


             System.out.println(x);
             // Problem 2 
             double score,pay ; 
             Scanner input_pay = new Scanner(System.in); 
                          System.out.println("Enter pay");
             pay = input.nextInt(); 

             Scanner input_score = new Scanner(System.in); 
             System.out.println("Enter score");

             score = input.nextInt(); 

             if (score > 90) {
                pay =   pay * 1.03; 
                System.out.println(" Your pay is increased by 3% " + pay);

             }

             else {
         System.out.println(" Your pay is was not increased ");

             }


             // Problem 3

//              if (radius >= 0)
// {
//   area = radius * radius * PI;
//   System.out.println("The area for the circle of " +
//     " radius " + radius + " is " + area);
// }



             //Problem 4
            // A, x = 3 , y = 2 , Theres no output 

            //B x=3, y=4 , Z = 7
    

            //C , x = 2 , y = 2 , The output is 2


            //Problem 5 

            //D x=2,y=3, Theres no output 

            //E x=3, y=2, x is 3

            //F x=3,y=3 , Z = 6


            // Problem 6 

//             if (score >= 60){

//   System.out.println("D");
//             }
// else if (score >= 70){
//   System.out.println("C");
// }
// else if (score >= 80){
//   System.out.println("B");
// }
// else if (score >= 90){
//   System.out.println("A");
// }
// else {
//   System.out.println("F");
// }

        }
}
