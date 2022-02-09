public class square_root {
  
    static int findsquare(int key){
        int s=0;
        int e=key;
        int mid=s+(e-s)/2;
        int ans=0;
    while(s<=e){
        int square=mid*mid;
        if(square==key &&square>key+1){
            ans=mid;
            return ans;
        }

        else if(square<key){
            ans=mid;
            s=mid+1;
        }

        else{
            e=mid-1;
        }
        mid=s+(e-s)/2;
    
    }
        return ans;
    }

    static double perfectsqr(double ans,int precision,int key){
        double factor=1;
       for(int i=0;i<precision;i++){
        factor=factor/10;
        for (double j = ans; j*j <key; j=j+factor) {
            ans=j;
        }    
       }
       return ans;
    }
    public static void main(String[] args) {
        int[] array={2,3,4,5,6,7,9,10};
            int value=findsquare(10);
            //System.out.println(" UnderRoot is "+value);
            double perfsqr=perfectsqr(value,3,10);
            System.out.println("square is "+perfsqr);
   } 
}
