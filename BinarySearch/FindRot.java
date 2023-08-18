package BinarySearch;

public class FindRot {
    public static void main(String[] args) {
        int[] ar={11,12,34,55,66,77,6,8,9,10};
        int f=9;
        int r=piv(ar);
        System.out.println(find(ar,f,r));
    }

    static int piv(int[] ar){
        int s=0;
        int e=ar.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(ar[mid]>ar[mid+1]){
                return mid;
            }
            else if(ar[mid]<ar[mid+1]){
                s=mid+1;
            }
            else e=mid-1;
        }
        return -1;
    }
    static int find(int[] ar,int k,int re){
        int s=0;
        int e=ar.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(k>ar[s] && k<ar[re]) e=re-1;
            else if(k<ar[s] && k<ar[re]) s=re+1;
        }
        return -1;
    }
}
