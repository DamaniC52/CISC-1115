
public class April23rd {
    public static void main(String[] args) {
        int [] list = {5,4,12,4,2,3}; 
        int key =5; 

        int result = linearSearch(list,key);
        
     if (result == -1)
        System.out.println("Your search is not successful " + result);
    else 
        System.out.println("Your result is found at " + result );

    }
    public static int linearSearch(int[] list, int key) {
    
        for(int i=0; i<list.length;i++){
            if(list[i] == key)
                return i; 
        }
      return -1 ;
    }
}