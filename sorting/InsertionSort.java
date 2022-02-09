/**
 * Insertion sort is a simple sorting algorithm that splits an array virtually into two part.
 * the sorted and unsorted part.
 * we pick an element from unsorted array placed it on the correct index in sorted array.
 * 
 *          Algorithm
 * first iterate to the array from 1 to <length of array
 * Compare the current value from  of its precedence if number is smalller than its precedense compare with the number before precedense.
 *  Move the greater element one space up to make space for swapping.  
 *              
 *              why insertion sort
 * stability
 * Adaptable
 * 
 * Time complexity=>   worst case 0(N^2)    /           best case 0(n)
 * SPACE complexity=>0(1)
 * 
 */

public class InsertionSort {
    static void sort(int arr[])
    {
        
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
 
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j --;
            }
            arr[j + 1] = key;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] array={3,2,4,1,5};
        sort(array);
    }    
}
