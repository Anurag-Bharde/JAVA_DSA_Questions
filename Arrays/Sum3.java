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


    static void optimal(int[] ar){
       List<List<Integer>> listt=new ArrayList<>();
       Arrays.sort(ar);
        for(int i=0;i<ar.length;i++){
            if(i!=0 && ar[i]==ar[i-1]) continue;
            int j=i+1;
            int k=ar.length-1;
            while(j<k){
                int sum=ar[i]+ar[j]+ar[k];
                if (sum > 0) {
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    List<Integer> al=Arrays.asList(ar[i],ar[j],ar[k]);
                    listt.add(al);
                       j++; k--;
                   while(j<k && ar[j]==ar[j-1]) j++;
                   while(j<k && ar[k]==ar[k-1]) k--;

                }
            }
        }
        System.out.println(listt);
    }
    public static void main(String[] args) {
        int[] ar={-1,0,1,2,-1,4};
        optimal(ar);
    }
}
