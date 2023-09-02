package Sortting;

import java.util.Arrays;

public class qucksor {

    static int partition(int ar[],int l, int h){
        int pot=ar[h];
        int i=l-1;
        for(int j=l;j<h;j++){
            if(ar[j]<pot){
                i++;

                int temp=ar[j];
                ar[j]=ar[i];
                ar[i]=temp;
            }
        }
        i++;
        int temp=ar[i];
        ar[i]=pot;
                ar[h]=temp;
                return i;
    }
    static void quick(int[] ar,int l,int h){
        if(l<h){
            int piv=partition(ar, l ,h);

            quick(ar,l,piv-1);
            quick(ar,piv+1,h);
        }
    }
    public static void main(String[] args) {
        int[] ar={4,3,65,1,764,2};
        int n=ar.length-1;
        quick(ar,0,n);
        System.out.println(Arrays.toString(ar));
    }
}
