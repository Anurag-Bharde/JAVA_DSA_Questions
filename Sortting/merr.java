package Sortting;
import java.util.*;


public class merr {

    static void con(int[] ar,int s,int m, int e){
     int[] clo=new int[e-s+1];
     int id1=s;
     int id2=m+1;
     int x=0;
     while(id1<=m && id2<=e){
         if(ar[id1]<=ar[id2]){
             clo[x++]=ar[id1++];
         }
         else{
             clo[x++]=ar[id2++];
         }
     }
     while(id1<=m){
         clo[x++]=ar[id1++];
     }
     while(id2<=e){
         clo[x++]=ar[id2++];
     }

     for(int i=0,j=s;i<clo.length;i++,j++){
         ar[j]=clo[i];
     }
    }
    static void mer(int[] ar,int s, int e){
        if(s>=e){
            return;
        }
        int m=s+(e-s)/2;
        mer(ar,s,m);
        mer(ar,m+1,e);
        con(ar,s,m,e);
    }
    public static void main(String[] args) {
        int[] ar={4,2,16,8,23};
        mer(ar,0,ar.length-1);
        System.out.println(Arrays.toString(ar));
    }
}
