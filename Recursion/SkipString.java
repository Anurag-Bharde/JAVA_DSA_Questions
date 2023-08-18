package Recursion;

public class SkipString {
    public static void main(String[] args) {
//        String st = "anuragzzzsdupper";
//        String ans = "sec";
//        System.out.println(SkperSkip(st));
        System.out.println(jump("anuragappleappr"));
    }
    static String Skper(String st){
       if(st.isEmpty()) return "";
       if(st.startsWith("zzz")) return Skper(st.substring(3));
       else return st.charAt(0)+ Skper(st.substring(1));
    }

    static String SkperSkip(String st){
       if(st.isEmpty()) return "";
       if(st.startsWith("zzz") && !st.startsWith("zzzsd")) return Skper(st.substring(3));
       else return st.charAt(0)+ Skper(st.substring(1));
    }

    static String skol(String str,String ans){
        if(str.length()==0){
            return ans;
        }
 return str;
    }

    static String jump(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch=s.charAt(0);
        if(s.startsWith("app")) {
            if (s.startsWith("apple")) return ch+jump(s.substring(1));
            else return jump(s.substring(3));
        }
        else return ch+jump(s.substring(1));
    }
}
