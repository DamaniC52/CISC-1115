
public class April14 {
    public static void main(String[] args) {
      
   //  int [] list ={4,5,7};

    // list = new int[3];
    

       // for (int i = 0; i < list.length ; i++){
         //   list[i] = i;    
            
       //     for( int j = 0; j<list.length; j++){
      //          System.out.println(list[j] + "");
           // }

           /* 

        char [] letters = new char[26];

        for (int i =0 ; i<letters.length; i++){
            letters[i] = (char)('Z' - i);

            for (int j = 0; j < letters.length; j++){
                if(letters[i] == 'A' || letters[i] == 'E' || letters[i] == 'I' || letters[i] == 'O' || letters[i] == 'U')
                System.out.println(letters[j] + "");
            }
        }
        */  

        double [] number = new double[10];

        for(int i = 0; i < number.length; i++){
            number[i] = (int) (Math.random() * 100);
        }

        for (int j = 0; j < number.length; j++){
            System.out.println(number[j] + "");
        }

         
    }
}

