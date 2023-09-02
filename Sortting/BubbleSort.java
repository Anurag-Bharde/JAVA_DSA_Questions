package Sortting;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ar={5,2,4,1,7};
        int n=ar.length-1;
//        sor(ar,n);
        selectionSort(ar,n);
        System.out.println(Arrays.toString(ar));

    }
    static void sor(int[] ar, int n){
        if(n<0) return;
        for(int i=0;i<n;i++){
            if(ar[i]>ar[i+1]){
                swap(i,i+1,ar);
            }
        }
        sor(ar,n-1);
    }
    static void swap(int a,int b,int[] ar){
        ar[a]=ar[b]+ar[a]-(ar[b]=ar[a]);
    }
    static void selectionSort(int[] ar,int n){
        int maxx=0;char t='g';
        int ind=-1;
        if(n<0) return;
        for(int i=0;i<=n;i++){
            if(ar[i]>maxx){
                maxx=ar[i];
                ind=i;
            }
        }
        swap(ind,n,ar);
        selectionSort(ar,n-1);
    }
}
