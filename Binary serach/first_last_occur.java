
public class first_last_occur {
    static int firstoccur(int[] arr,int size, int key){
        int s=0;
        int e=size-1;
        int mid=s+(e-s)/2;
        int ans=0;
    while(s<=e){
        
        if(arr[mid]==key){
            ans=mid;
            e=mid-1;
        }
        else if(key>arr[mid]){
            s=mid+1;
        }
        else{
            e=mid-1;
        }
        mid=s+(e-s)/2;    
       
    }
        return ans;
    }
    
    
    static int lastoccur(int[] arr,int size, int key){
        int s=0;
        int e=size-1;
        int mid=s+(e-s)/2;
        int ans=0;
    while(s<=e){
        
        if(arr[mid]==key){
            ans=mid;
            s=mid+1;
        }
        else if(key>arr[mid]){
            s=mid+1;
        }
        else{
            e=mid-1;
        }
        mid=s+(e-s)/2;    
       
    }
        return ans;
    }
    
   
    public static void main(String[] args) {
        int[] array ={1,2,3,3,3,5};
    
       int firstoccur=firstoccur(array,array.length, 3);
       int lastoccur=lastoccur(array,array.length, 3);
       System.out.println("first occurrence is at index "+firstoccur);
       System.out.println("last occurrence is at index "+lastoccur);
    }
}
