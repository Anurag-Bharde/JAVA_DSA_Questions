package BinarySearch;

import java.util.Arrays;
import java.util.ArrayList;

public class F_Loccurence {
    public static int bs(int[] ar,int k,boolean r){
        int s=0;
        int e= ar.length-1;
        int last=-1;
        ArrayList<Integer> list=new ArrayList<>();
        while(s<=e){
            int mid=s+(e-s)/2;
            if(ar[mid]<k) s=mid+1;
            else if(ar[mid]>k) e=mid-1;
            else {
                last=mid;
                if(r){
                    e=mid-1;
                }
                else {
                    s=mid+1;
                }
            }
        }
        return last;

    }
    public static void main(String[] args) {
        int[] ar={1,2,4,5,7,7,7,7,7,7,8,99};
        int k=7;
        System.out.println(ar.length);
        int arr[]=new int[2];
        arr[0]=bs(ar,k,true);
        if(arr[0]!=-1){
            arr[1]=bs(ar,k,false);
        }
        System.out.println(Arrays.toString(arr));
    }


}
