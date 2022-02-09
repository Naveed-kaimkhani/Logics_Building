/**
    arr [1,2,3,4,5,6]
        [2,1,4,3,6,5]
 */
import java.util.*;
public class Swap_alternative {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int[] swap = new int[6]; 
        for (int i = 0; i < arr.length; i+=2) {
            int temp=arr[i];
             arr[i]=arr[i+1];
             arr[i+1]=temp;
        }

        for (int i : arr) {
            System.out.print(i);
        }
    }
}
