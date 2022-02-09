/**
 *  Algorithm
 * start loop with condition of i<arr1.length && j<arr2.length
 * start comparing 0th index value of both array.
 * select the smaller value of both array.
 * copy into a new array.
 * After first loop make two more loop to copy rest of the element
 *  second loop will copy remaining elements of first loop
 * third loop will copy remaining elements of first loop
 *  
 * 
 */

public class MergeTwoSortedArray {
   static void merge(int[] arr1,int[] arr2,int[] arr3){
       int Sarr1=arr1.length;
       int Sarr2=arr2.length;
       
    int i=0,j=0,k=0;
       while (i<Sarr1 && j<Sarr2) {
           if (arr1[i]<arr2[j]) {
            arr3[k]=arr1[i];
            k++;
            i++;   
           }
           else{
            arr3[k]=arr2[j];
            k++;
            j++;
           }
       
        }

        while (i<Sarr1) {
            arr3[k]=arr1[i];
            k++;
            i++;
        }
        while (j<Sarr2) {
            arr3[k]=arr2[j];
            k++;
            j++;
        }

        for (int ele : arr3) {
            System.out.print(ele+" ");
        }
       
   }
    public static void main(String[] args) {
        int[] array1={4,5,6};
        int[] array2={1,2,3};
        int[] array3=new int[6];

        merge(array1, array2, array3);
        
    }    
}
