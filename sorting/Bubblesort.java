/**
 *          ---------------Bubble sort Algorithm------------------------
 *In bubble sort we push the largest element at last index of array.
 * And then neglect the sorted end by subtracting value of i from in inner loop condition
 * 
 * Algorithm=> first loop will start from 1 to less than array length
 *              second loop will start from 0 to less than array length-1 
 *               then simply do swaping 
 * 
 * Time complexity=> 0(n^2) this can alter in best case if the array is already sorted  
 * Space complexity=>0(1)
 * 
 * Bubble sort is an stable algorithm.
 * Stability=> An algorithm is said to be stable if the elememnt with same values appear in same order after sorting
 */
public class Bubblesort {
    static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] array={4,5,1,6,3};
        sort(array);
    }
}
