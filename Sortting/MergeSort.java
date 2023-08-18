package Sortting;
import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
       int[] ar={5,3,6,2,72,21,1};
        System.out.println(Arrays.toString(mergeSort(ar)));
    }
    static int[] mergeSort(int[] ar){
        if(ar.length==1) return ar;

        int mid=ar.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(ar,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(ar,mid,ar.length));

       return merge(left,right);
    }
    static int[] merge(int[] s,int[] e){
        int i=0;
        int j=0;
        int k=0;
        int mix[]=new int[s.length+e.length];
        while(i<s.length && j<e.length){
            if(s[i]<e[j]){
                mix[k]=s[i];
                i++;
            }
            else{
                mix[k]=e[j];
                j++;
            }
            k++;
        }

        while(i<s.length){
            mix[k]=s[i];
            i++;
            k++;
        }
        while(j<e.length){
            mix[k]=e[j];
            j++;
            k++;
        }
        return mix;
    }

    static void mergeinplace(int[] ar, int s,int e){
        
    }

}
