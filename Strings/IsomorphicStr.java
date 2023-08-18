package Strings;
import java.util.HashMap;
import java.util.*;

public class IsomorphicStr {
    public static void main(String args[]){
        String st="egg";
        String st2="ads";
        System.out.println(iso(st,st2));
    }
    public static boolean iso(String st,String st2){
        HashMap<Character,Character> map=new HashMap<>();
        HashSet<Character> se=new HashSet<>();
        if(st.length()!=st2.length()) return false;
        for(int i=0;i<st.length();i++){
            char c1=st.charAt(i);
            char c2=st2.charAt(i);

            if(map.containsKey(c1)){
                if(map.get(c1)!=c2) return false;
            }
            else{
                map.put(c1,c2);
                se.add(c2);
            }
        }
        return true;
    }
}
