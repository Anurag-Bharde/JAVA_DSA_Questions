package BinarySearch;

public class DETUSCHE_MAX_PAGES {
    public static void main(String[] args) {
        int[] ar={16,8,10};
        int k=6;
        System.out.println(maxxx(ar,k));
    }
    static int maxxx(int[] ar,int k){
        int s=Integer.MIN_VALUE;
        int e=0;
        for(int i=0;i<ar.length;i++){
            s=Math.max(s,ar[i]);
            e=e+ar[i];
        }
        int res=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isvalid(ar,k,mid)){
                res=mid;
                e=mid-1;
            }
            else s=mid+1;
        }
        return res;
    }
    static boolean isvalid(int[] ar, int k, int mid){
        int stu=1;
        int sm=0;
        for(int i=0;i<ar.length;i++){
            sm=sm+ar[i];
            if(sm>mid){
                stu++;
                sm=ar[i];
            }
        }
        if(stu>k){
            return false;
        }
        return true;
    }
}

