package Arrays;
import java.util.*;

public class merge2ar {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ar=new int[n+m];
        int t=0;
        for(int i=0;i<m;i++){
            ar[i]=nums1[i];
            t=i;
        }
        t+=1;
        for(int j=0;j<n;j++){
            ar[t]=nums2[j];
            t+=1;
        }
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
    }
    public static void main(String[] args) {
        int num[]={1,2,3};
        int nume[]={2,5,6};
        merge(num,num.length,nume,nume.length);
    }
}
