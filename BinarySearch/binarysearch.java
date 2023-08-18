package BinarySearch;

public class binarysearch {
    public static int bs(int[] ar,int k){
        int s=0;
        int e= ar.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(ar[mid]==k) return mid;
            else if(ar[mid]>k) e=mid-1;
            else s=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] ar={1,2,4,5,7,8,99};
        int k=7;
        System.out.println(bs(ar,k));
    }
}
