package BinarySearch;

public class InfBinaryKey {
    public static void main(String[] args) {
        int[] ar={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1};
        int l=0;
        int h=1;
        while(ar[h]!=1){
            l=h;
            h=h*2;
        }
        System.out.println(ar.length);
        System.out.println(bst(ar,l,h));
    }
    static int bst(int[] ar, int l,int h){
        int s=l;
        int e=h;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(ar[mid]==0) s=mid+1;
            else if(mid-1>=s && ar[mid]==1 && ar[mid-1]==1) e=mid-1;
            else return mid;
        }
        return -1;
    }
}
