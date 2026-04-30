
public class April23rd {
    public static void main(String[] args) {
        int [] list = {5,7,10,20,25,30,41,46}; 
        int key =5; 

        int result = binarySearch(list,key);
        
     if (result == -1)
        System.out.println("Your search is not successful " + result);
    else 
        System.out.println("Your result is found at " + result );

    


}
    public static int binarySearch (int[] list, int key) {
        int low,high,mid; 
        low = 0; 
        high = list.length-1; 
        while(low<=high){
            mid = (low+high)/2; 
            if(list[mid] == key)
                return mid; 
            else if (key<list[mid])
                high=mid-1;
            else 
                low = mid +1;
        }
        return 0;
        
    }

    /* 

    public static int linearSearch(int[] list, int key) {
    
        for(int i=0; i<list.length;i++){
            if(list[i] == key)
                return i; 
        }
      return -1 ;
       */
    }
