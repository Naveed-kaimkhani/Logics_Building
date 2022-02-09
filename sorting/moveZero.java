/**
 *                  Algorithm
 * Start i=1 and j=0
 * iterate the array over j
 * check if the element is equal to zero swap with next. next element will be accessible by i.
 */
public class moveZero {
    static void move(int[] arr){
        int i=0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
            }
        }
        for (int k : arr) {
            System.out.print(k+" ");
        }
    }
    public static void main(String[] args) {
        int[] arra={0,2,0,1,0};
        move(arra);
    }
}
