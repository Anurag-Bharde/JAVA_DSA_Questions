package HashSets;

import java.util.*;

public class Methoss {
    public static void main(String[] args) {
        Set<Integer> hsets=new HashSet<>();
       hsets.add(64);
       hsets.add(65);
       hsets.add(66);
       hsets.add(63);
       HashSet<Integer> hdg=new HashSet<>();
       hdg.add(64);
       hdg.add(63);
       hsets.retainAll(hdg);
        System.out.println(hsets.contains(65));
        System.out.println(hsets);
    }
}
