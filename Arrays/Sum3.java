package Arrays;

import java.util.*;

public class Sum3 {

    static void summin(int[] ar){
        Set<List<Integer>> tgir=new HashSet<>();
        for(int i=0;i<ar.length;i++){

            HashSet<Integer> htk=new HashSet<>();
            for(int j=i+1;j<ar.length;j++){
                int atkt=-(ar[i]+ar[j]);
                if(htk.contains(atkt)){
                    List<Integer> list=Arrays.asList(ar[i],ar[j],atkt);
                    list.sort(null);
                    tgir.add(list);
                }
                htk.add(ar[j]);
            }
        }
        List<List<Integer>> pimp=new ArrayList<>(tgir);

        System.out.println(pimp);
    }
    public static void main(String[] args) {
        int[] ar={-1,0,1,2,-1,4};
        summin(ar);
    }
}
