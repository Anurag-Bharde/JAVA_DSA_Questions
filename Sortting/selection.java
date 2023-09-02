package Sortting;

import java.util.Arrays;

public class selection {
    static void select(int[] ar){
        int n=ar.length-1;
        int[] sdk=new int[ar.length];
        int min=Integer.MAX_VALUE;
        int x=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++) {
                int prevmin = min;
                min = Math.min(min, ar[j]);
                if (prevmin != min) {
                    x = j;
                }
                int temp = ar[i];
                ar[i] = ar[x];
                ar[x] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int ar[]={2,24,51,463,1,14,876,54};
        select(ar);
        System.out.println(Arrays.toString(ar));
    }
}
