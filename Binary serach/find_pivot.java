/**
 * [9,7,6,1,2,3]
 */
public class find_pivot {
    static int findpivot(int[] arr,int size){
        int s=0;
        int e=size-1;
        int mid=s+(e-s)/2;
        
        //[9,7,10,2,3]
        while (s<e) {
            if(arr[mid]>=arr[0]){
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
        int[] array={9,7,10,2,1,3};
        int pivot=findpivot(array,array.length);
        System.out.println("pivot element is "+pivot);
    }
}
