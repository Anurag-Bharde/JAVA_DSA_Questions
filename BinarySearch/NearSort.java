package BinarySearch;

public class NearSort {
    public static void main(String[] args) {
        int[] ar={10,20,30,25,40,50,60,70};
        int k=20;
        System.out.println(search(ar,k));
    }
    static int search(int[] ar,int k){
        int s=0;
        int e=ar.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(ar[mid]==k){
                return mid;
            }
            else if(ar[mid-1]>=s && ar[mid-1]==k) return mid-1;
            else if(ar[mid+1]<=e && ar[mid+1]==k) return mid+1;
            else if(ar[mid]>k)  e=mid-1;
            else s=mid+1;
        }
        return -1;
    }
}
