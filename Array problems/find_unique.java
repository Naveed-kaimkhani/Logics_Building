/**
 * [2,4,1,1,2] => 4
 */

public class find_unique {
    public static void main(String[] args) {
        int[] arr={2,4,1,1,2};
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
           ans=ans^arr[i];
        }
        System.out.println(ans);
    }
}
