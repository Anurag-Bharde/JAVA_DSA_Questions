package BackTracking;
import java.util.*;

public class arrayfrom1_n {
    public static void main(String[] args) {
        int n=5;
        int ar[]=new int[n];
        back(n,ar);
    }
    static void back(int n,int ar[]){
        if(n==0){
            System.out.println(Arrays.toString(ar));
            return;
        }
        back(n-1,ar);
        ar[n-1]=n;
    }
}
