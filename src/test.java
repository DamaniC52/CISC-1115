import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test {
        @SuppressWarnings("empty-statement")
        public static void main(String[] args) throws FileNotFoundException {

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