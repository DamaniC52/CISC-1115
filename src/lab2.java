    import java.util.Scanner; 
public class lab2 {
    public static void main(String[] args) throws Exception {
         // Problem 1
        double i = 50.0;
      double k = i + 50.0;
      double j = k + 1;

      System.out.println("j is " + j + " and k is " + k);

           

      //Problem 2 
        // The illgal Identifier is f and g because identifiers cannot start with a 
        // number or contain special characters like + 

    
        // Problem 3
        // The illgal Identifiers are c,d,e,g,i,j

        //Problem 4
      i = k + 2;
     System.out.println(i);

     //Problem 5
         i = j = k = 2;
      System.out.println(i + " " + j + " " + k);

    //problem 6
    
        double pi = 3.14;
        double w = 10.4;
        double h = 12.2;

        double perimeter = (2 * w ) + (2 * h); 
        System.out.println(" the perimeter is " + perimeter);

    //Problem 7 
        double width , height;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter width ");
        width = input.nextDouble();
        

        Scanner input2 = new Scanner (System.in); 
        System.out.print("Enter Length");
        height = input2.nextDouble();
        
        
        double perimeter2 = (2 * width ) + (2 * height); 

        System.out.println("The perimeter of the rectangle with the width of = " + width + " and the height of " + height + " is " + perimeter2);








    }
}

