/**
 * Space complexity => 0(1) becoz we only use variables in sort function
 * time complexity=> in all cases time complexity will be same.0(n^2)
 * 
 * how to find time complexity of selection sort?
 * in all iteration we make n-1 comparision.
 * So if given array is {3,2,4,1}.
 * first we select 3 and will make 3 comparision with 2,4,1
 * then we select 2 and will make 2 comparision with 4,1
 * same as for 4 and will do only 1 comparision this time
 *  if the size of array is n we will do (n-1)+(n-2).....1
 * So by simplifing this  form we get 1+2+3+....(n-2)+(n-1)
 * it seems like general form of natural number and general equation will be n(n-1)/2
 * can also write in this form n^2-n/2  => after neglecting constant and less dominant we get
 * n^2      time complexity => 0(n^2)
 * 
 * use case?
 * when array is not too large.
 * 
 * selection sort is not an stable algorithm
 */


public class selectionsort {
   static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if(arr[i]>arr[j+1]){
                    int temp=arr[i];
                    arr[i]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
   }
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
        
    }
    public static void main(String[] args) {
        int[] arr={3,5,2,1,6};
        sort(arr);
        System.out.println();
        reverse(arr);
    }
}
