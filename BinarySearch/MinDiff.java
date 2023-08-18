package BinarySearch;

public class MinDiff {
    public static void main(String[] args) {
        int ar[]= {3,7,8,12,15,18};
        int k=1;
        System.out.println(min(ar,k));
    }
    static int min(int[] ar,int k){
        int s=0;
        int min=-1;
        int e=ar.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid+1<=e && ar[mid]<k && ar[mid+1]>k){
                min=Math.min(k-ar[mid],ar[mid+1]-k);
                return min;
            }
            else if(mid+1>e && ar[mid]<k){
                return k-ar[mid];
            }
            else if(mid+1<=e && ar[mid]>k && ar[mid+1]>k) e=mid-1;
            else if(mid-1>s && ar[mid]>k){
                return ar[mid]-k;
            }
            else s=mid+1;
        }
        return -1;
    }
}
