package HashMap;
import java.util.HashMap;

public class SortChar {
    public static void main(String[] args) {
        String s="tree";

        System.out.println(frequencySort(s));
    }
    static String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.merge(s.charAt(i),1, Integer::sum);

        }
        return s;
    }
}
