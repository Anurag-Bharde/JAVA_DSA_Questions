package Arrays;
import java.util.*;

public class Rep_MissNo {
    public static void main(String[] args) {
        int[] ar={12,13,14,15,16,16,18,19,20};
         HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<ar.length;i++){
            hp.put(ar[i], hp.getOrDefault(ar[i],0)+1);
        }
        Iterator<Integer> it=hp.keySet().iterator();
        while(it.hasNext()){
            int key=(int)it.next();
            System.out.println(hp.get(key));
        }
    }
}
