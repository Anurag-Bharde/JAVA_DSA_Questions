package Arrays;

public class ceiling {
    public static void main(String args[]){
        int ar[]={2,4,6,7,8,9,10,23,54,56};
        int tar=30;
        if(tar>ar[ar.length-1]) System.out.println(-1);

        int start=0;
        int end=ar.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(tar>ar[mid]) start=mid+1;
            else if (tar<ar[mid]) end=mid-1;
            else System.out.println(ar[mid]);
        }
        System.out.println(ar[end]);
    }
}
