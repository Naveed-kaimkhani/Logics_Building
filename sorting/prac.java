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

public class prac {
    static void merge(int[] arr1,int[] arr2){
        int Sarr1=arr1.length;
        int Sarr2=arr2.length;
        
     int i=0,j=0;
        while (i<Sarr1 && j<Sarr2) {    //[1,2,7,0,0,0] [2,5,6]
            if (arr1[i]<arr2[j]) {
                i++;
                j++;
                //j++;
                
            }
            else{
                arr1[i+1]=arr2[i];
                arr1[i]=arr2[j];
                j++;
                i++;
            }
        
         }
         
 
         while (i<Sarr1) {
             arr1[i]=arr2[j];
             j++;
             i++;
         }
         while (j<Sarr2) {
             arr1[i]=arr2[j];
             k++;
             j++;
         }
 
         for (int ele : arr1) {
             System.out.print(ele+" ");
         }
        
    }
     public static void main(String[] args) {
         int[] array1={4,5,6};
         int[] array2={1,2,3};
 
         merge(array1, array2);
         
     }    
 }
 