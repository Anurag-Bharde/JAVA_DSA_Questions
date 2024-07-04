package Arrays;

public class binarysearch {
    public static int bs(int[] ar,int k){
        int s=0;
        int e=ar.length-1;
        int mid=0;
        while(ar[mid]!=k){
             mid=(e-(s+e))/2;

            if(ar[mid]>k){
                e=mid-1;
            }
            else if(ar[mid]<k){
                s=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] ar={1,2,3,4,5,6,7,8};
       int m=7;
        System.out.println(bs(ar,m));
    }
}
