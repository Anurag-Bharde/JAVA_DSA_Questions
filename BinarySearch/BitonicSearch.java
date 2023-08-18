package BinarySearch;

public class BitonicSearch {
    public static void main(String[] args) {
        int[] ar={1,3,5,7,12,6,4,2};
        int k=2;
        boolean go=false;
        int pk=peek(ar);
        System.out.println(peek(ar));
        int ans=bs(ar,k,pk);
        if(ans==-1){
            ans=bs2(ar,k,pk);
        }
        System.out.println(ans);
    }
    static int peek(int[] ar){
        int s=0;
        int e=ar.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid>0 && mid<ar.length-1){
                if(ar[mid]>ar[mid-1] && ar[mid]>ar[mid+1]){
                    return mid;
                }
                else if (ar[mid]>ar[mid-1] && ar[mid]<ar[mid+1]) s=mid+1;
                else e=mid-1;
            }
        }
        return -1;
    }

    static int bs(int[] ar,int k,int pek){
        int s=0;
        int e=pek-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            if(ar[mid]==k)return mid;
            else if(ar[mid]>k) e=mid-1;
            else s=mid+1;
        }
        return -1;
    }
    static int bs2(int[] ar,int k,int pek){
        int s=pek;
        int e=ar.length-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            if(ar[mid]==k)return mid;
            else if(ar[mid]<k) e=mid-1;
            else s=mid+1;
        }
        return -1;
    }
}
