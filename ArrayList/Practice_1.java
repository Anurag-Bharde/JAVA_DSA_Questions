package ArrayList;
import java.util.*;

class Practice_1{
    public static void main(String ags[]){
        String s="ABCDEF";
         String ans="";
        for (int i = 0; i < s.length(); i++) {
            String t=s.substring(s.length()-1);
        ans=ans+t;
        }
        System.out.println(ans);
    }
}
