
/**
 *  [3,4,5,6,4,3,1]  find peak element
 */
public class find_peak {
     static int findpeak(int[] arr,int size){
        int s=0;
        int e=size-1;
        int mid=s+(e-s)/2;   
        while (s<e) {
                if(arr[mid]<arr[mid+1]){
                        s=mid+1;
                }
                else{
                    e=mid;
                }
                mid=s+(e-s)/2; 
            }
            return arr[s];
    }
    public static void main(String[] args) {    
        int[] array={3,4,5,6,4,3,1};
        int peak=findpeak(array, array.length);
        System.out.println("peak element is "+peak);
    }
}
