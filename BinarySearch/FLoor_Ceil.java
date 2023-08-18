package BinarySearch;

public class FLoor_Ceil {
    public static void main(String[] args) {
        int[] ar = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int k = 43;
        System.out.println(ar[floor(ar,k)]);
        System.out.println(ar[ceil(ar,k)]);
    }
    static int floor(int[] ar, int k){
        int s=0;
        int e=ar.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(ar[mid]==k) return mid;
            else if(ar[mid-1]>=s && ar[mid-1]<k && ar[mid]>k) return mid-1;
            else if(ar[mid+1]<=e && ar[mid+1]>k && ar[mid]<k) return mid;
            else if(ar[mid]>k) e=mid-1;
            else s=mid+1;
        }
        return -1;
    }
    static int ceil(int[] ar,int k){
        int s=0;
        int e=ar.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(ar[mid]==k) return mid;
            else if(ar[mid-1]>=s && ar[mid-1]<k && ar[mid]>k) return mid;
            else if(ar[mid+1]<=e && ar[mid+1]>k && ar[mid]<k) return mid+1;
            else if(ar[mid]>k) e=mid-1;
            else s=mid+1;
        }
        return -1;
    }
}
