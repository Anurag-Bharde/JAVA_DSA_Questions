package Arrays;
import java.util.*;
public class unionNos {
    public static void main(String[] args) {
        int ar1[] = {1,2,3,4,5};
        int ar2[] = {2,3,4,4,5};

        ArrayList<Integer> ar=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<ar1.length && j<ar2.length){
            if(ar1[i]>ar2[j]){
                ar.add(ar2[j]);
                j++;
            }
            else if(ar2[i]>ar1[i]){
                ar.add(ar1[i]);
                i++;
            }
            else {
//                ar.add(ar1[i]);
                i++;
            }
            }
            int[] ar3=new int[ar.size()];
        for ( i=0;i<ar.size();i++){
            ar3[i]=ar.get(i);
        }
        System.out.println(Arrays.toString(ar3));
        }
    }
