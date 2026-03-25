public class Practice {
    
    
    public static void main(String[] args) {
        /* 
        System.out.println("ENter start");
        Scanner input = new Scanner(System.in);
        int start = input.nextInt(); 

        System.out.println("ENter end");
            Scanner input2 = new Scanner(System.in);
        int end = input2.nextInt(); 


        for(int i = start ; i <= end ; i++) 
        System.out.println(i);
        

        System.out.println((int)Math.random() * (25-10) +10 );


        System.out.println( (int) (Math.random() * (25 - 10) + 10));
*/

/* 

        System.out.println("Enter 3 numbers");
        Scanner input = new Scanner(System.in); 
        Scanner input2 = new Scanner(System.in); 
        Scanner input3 = new Scanner(System.in); 

        int A = input.nextInt();
        int B = input2.nextInt();
        int C = input3.nextInt();

        int biggest =  Math.max(A , Math.max(B, C));
        int smallest = Math.min(A , Math.max(B,C)); 
        int median ; 
        if( smallest != A && biggest !=A)
            median = A; 
            
      */
        

        int modelnum = 3 ; 
        int modelYear = 2001;

        Boolean recallable = (modelnum == 1 || modelYear == 2005) && (modelYear >= 1999 && modelYear <= 2005)  ;

        System.out.println(recallable);
    }
}