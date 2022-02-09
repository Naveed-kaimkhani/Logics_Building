public class RotateArray {
    static void rotate(int[] arr){
        int i=0;
        int size=arr.length/2;
        while (i<size) {
                int temp=arr[i];
                arr[i]=arr[i+2];
                arr[i+2]=temp;
                i++;
        }
        for (int k : arr) {
        System.out.print(k+" ");
        }
    }
    public static void main(String[] args) {
        int[] arra={1,2,3,4,5,6};
        //
        rotate(arra);
    }
}
