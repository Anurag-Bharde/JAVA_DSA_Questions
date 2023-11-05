package Arrays;
import java.util.*;
public class unionn {
    public static int doUnion(int a[], int n, int b[], int m)
    {
        //Your code here
        HashSet<Integer> hset=new HashSet<>();
        for(int i=0;i<n;i++){
            hset.add(a[i]);
        }
        for(int i=0;i<m;i++){
            hset.add(b[i]);
        }
        return hset.size();
    }

    public static void main(String[] args) {
        int a=5;
        int b=3;
        int ar1[]={1 ,2 ,3 ,4 ,5};
        int ar2[]={1 ,2 ,3};
        System.out.println(doUnion(ar1,a,ar2,b));
    }
}
