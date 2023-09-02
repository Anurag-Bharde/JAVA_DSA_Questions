package Sortting;
import java.lang.*;
import java.io.*;
import java.util.*;
public class Bubble {
    static void bub(int[] ar){
        int n=ar.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(ar[j]<ar[j-1]){
                    int temp=ar[j];
                    ar[j]=ar[j-1];
                    ar[j-1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int ar[]={2,24,51,463,1,14,876,54};
        bub(ar);
        System.out.println(Arrays.toString(ar));
    }
}
