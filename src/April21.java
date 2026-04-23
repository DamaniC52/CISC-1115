public class April21 {
    public static void main(String[] args) {
/* 
        char [] letters = createLetter(); 
        printArray (letters);
    }
    public static void printArray(char[] args) {
        
        for(int i = 0; i < args.length; i++)
            System.out.println(args[i] + "");
        
        
    }
    public static char [] createLetter() {
        char [] letters = new char[26];
        for (int i = 0; i < letters.length; i++){
            letters[i] = (char)('Z' - i);
        }
        return letters;
        

        int [] numbers = new int [100];
        for(int i=0; i<numbers.length; i++)
            numbers[i] = (int) (Math.random()*10); 

        int[] count = new int [10];
        for(int i =0; i<numbers.length; i++)
            count[numbers[i]]++;

        for(int j = 0; j<count.length; j ++) {

            System.out.println("There are" + count [j] + " " + numbers[j] + "s ") ;
        } 
  */ 

        int[] numbers = {3,1,3,4,3,4,343,5,32,24}; 
        int key = 5; 
        int index = linearSearch (numbers,key);
        System.out.println("Your key us located at " + index);

    }

    public static int linearSearch(int [] numbers, int key){
    for(int i=0; i<numbers.length ; i++) 
            if(numbers[i] == key)
                return i;
    return key; 

    }
}



