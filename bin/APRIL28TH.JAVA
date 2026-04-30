
import java.util.*;
import java.io.*;
Public class April28th {
    public static void main(String[] args) throws FileNotFoundException {
/* 
        File myFile = new File ("C:/Users/Staff/Desktop/scores.txt");

        PrintWriter output = new PrintWriter(myFile);
        
        if(myFile.exists()) {
            System.exit(1);
        }

        out.print("Damani");
        out.print("Chung");
        out.print("90");

        output.print("Taylan")
        output.print("Basak")


    */
     File myFile = new File("C:/Users/Staff/Desktop/random.txt");
            int count =0;
            Scanner input = new Scanner(myFile);
            while(input.hasNext());
            count++;
            input.nextInt();
    

            System.out.println("We have " +count + " numbers");
            input.close();


            input = new Scanner(myFile);
            int[] numbers = new int [count]; 
            int index = 0;

            while(input.hasNext()){

                numbers[index] = input.nextInt();


            }
        
            input.close();
            
            for(int i = 0; i<count;i++)
                System.out.println(numbers[i] + "");


    }
}
       
    