class Binary_search{
    static int func(int[] array,int size,int key){
    int start=0;
    int end=size-1;
    int mid=(start+end)/2;
        while(start<=end){
        if(array[mid]==key){
            return mid;
        }
        else if (key>array[mid]) {
            start=mid+1;
        }
        else{
            end=mid-1;
        }
        mid=(start+end)/2;
    }
    return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] arr2 ={6,5,4,3,2,1};
        //System.out.println(arr.length);
     
            int index= func(arr,arr.length,2);
            System.out.println("index is "+index); 
    }
}