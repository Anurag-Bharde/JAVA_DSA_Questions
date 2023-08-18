package BinarySearch;
import java.util.Arrays;

public class NextAlphabet {
    public static void main(String[] args) {
        char[] ar={'a','b','f','j','l','m','p','s','t'};
        char t='c';
        System.out.println(ar[findnext(ar,t)]);
    }
    static int findnext(char[] ar, char k){
        int s=0;
        int e=ar.length-1;
        while(s<=e){
            int mid=(s+(e-s)/2);
            if(ar[mid]==k) return mid;
            else if(ar[mid-1]>=s && ar[mid-1]<k && ar[mid]>k) return mid;
            else if(ar[mid+1]<=e && ar[mid+1]>k && ar[mid]<k) return mid+1;
            else if(ar[mid]>k) e=mid-1;
            else s=mid+1;
        }
        return -1;
    }
}
