
/**
 *  [3,4,5,6,4,3,1]  find peak element
 */
public class search_in_rotatedarray {
    static int search(int[] arr,int size,int key){
       int s=0;
       int e=size-1;
       int mid=s+(e-s)/2;   
       while (s<e) {
               if(arr[mid]<key){
                       s=mid;
               }
               else{
                   e=mid;
               }
               mid=s+(e-s)/2; 
           }
           return arr[s];
   }
   public static void main(String[] args) {    
       int[] array={7,9,1,2,3};
       int found=search(array, array.length,2);
       System.out.println();
   }
}
