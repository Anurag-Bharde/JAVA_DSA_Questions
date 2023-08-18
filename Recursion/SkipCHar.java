package Recursion;

public class SkipCHar {
    public static void main(String[] args) {
        String st="baccada";
//        System.out.println(remch(st));
//        jump("","baccad");
        System.out.println(jummpr("baccad"));
    }

    static String remch(String ch){
        String hek="";
        int i=0;
        return helper(hek,ch,i);
    }
    static String helper(String st,String s, int i){
        if(i==s.length()){
            return st;
        }
        if(s.charAt(i)=='a') return helper(st,s,i+1);
        else st=st+s.charAt(i);
        return helper(st,s,i+1);
    }

    static void jump(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if (ch != 'a') {
            jump(p+ch,up.substring(1));
        }
        else jump(p,up.substring(1));
    }
    static String jummpr(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch=s.charAt(0);
        if(ch!='a'){
            return ch+jummpr(s.substring(1));
        }
        else return jummpr(s.substring(1));
    }

}
