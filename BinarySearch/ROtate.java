package BinarySearch;

public class ROtate {
    public static void main(String[] args) {
        int[] ar={11,12,13,14,15,16,34,55,66,77,2,3,5,6,8,9,10};
            System.out.println(rot(ar));
    }
    public static int rot(int[] ar){
        int s=0;
        int e=ar.length-1;
        if(ar[s]<ar[e]){
            return 0;
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            if(ar[mid]<ar[e]){
                e=mid;
            }
            else if(ar[mid]>ar[mid+1]){
                return ar.length-mid-1;
            }
            else{
                s=mid;
            }
        }
        return 0;
    }
}
