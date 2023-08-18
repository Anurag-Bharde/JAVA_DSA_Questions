package Arrays;

import java.util.Arrays;

public class CSort {
    public static void main(String[] args) {
        int ar[]={3,4,1,2};
        for(int i=0;i<ar.length;i++){
            if(ar[i]-1!=i){
                swap(ar,i,ar[i]-1);
            }
        }
        System.out.println(Arrays.toString(ar));
    }
    static void swap(int[] ar,int a,int b){
        int temp=ar[a];
        ar[a]=ar[b];
        ar[b]=temp;
    }
}
