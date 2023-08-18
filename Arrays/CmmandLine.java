package Arrays;

import java.util.HashMap;
import java.util.Iterator;

public class CmmandLine {
    public static void main(String[] args) {
        HashMap<Integer,String> hmap=new HashMap<>();
        hmap.put(1,"jadksjk");
        hmap.put(2,"jadksjk");
        hmap.put(3,"jadksjk");
        hmap.put(4,"jadedness");


        for(HashMap.Entry<Integer, String> entry:hmap.entrySet()){
            System.out.println(entry.getKey()+" jfd"+entry.getValue());
        }
    }
}