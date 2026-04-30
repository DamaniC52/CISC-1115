public class Midterm2 {
    public static void main(String[] args) {
      int [] A = {9 , 8 , -3 , 4 ,6};

      System.out.println( A.length);
      
      System.out.println(A[0]);
      
            A[1] = 500;
            System.out.println(A[1]);

            A[4]++;

            System.out.println(A[4]);

            System.out.println(Captial("Hello WORrld"));

//Arrays(A);
        //int ( int i =0; < Array.length ; i++ ){
        //    System.out.println(Arrays(i) + " ");
        }

        /* 
      //call a method 
      //by writing its name
      //parantheses
      //then any parametrs it needs
      printHello();
        boolean result = EvenOrOdd(34);
        System.out.println(result);
    }


    public static void printHello()  {
        System.out.println("Hello");
   
     }
     public static int addTwoNumbers(int x, int y) {
         return x + y; 
         }


    public static boolean EvenOrOdd( int x){
        return x % 2 == 0 ; 
        
*/
        
       // }
       // public static void Arrays (int [] Array ) {

     //   for (int i = 0; i < Array.length; i++) {
        //   Array[i] *= 2;
        //

     //   }

    public static int Captial (String x) {
        int Captials = 0; 
        
        for (int i = 0; i < x.length(); i++) {
            if (Character.isUpperCase(x.charAt(i)))
                    Captials++;
        }
        return Captials;
    }
}