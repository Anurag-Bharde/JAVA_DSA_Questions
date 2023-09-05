package Arrays;
import java.util.Arrays;
public class LeftRotateByN {

    static int[] Lrotar(int[] ar, int n){
        int[] ar2=new int[ar.length];

        int i=0;
        while(i+n<ar.length){
            ar2[i]=ar[n+i];
            i++;
        }
         i=0;
        while(i<n){
            ar2[i+n+1]=ar[i];
            i++;
        }
        return ar2;
    }
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,6,7};
        int n=3;
        System.out.println(Arrays.toString(Lrotar(ar,n)));
    }
}
