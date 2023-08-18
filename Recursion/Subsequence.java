package Recursion;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String args[]){
        String st="ABC";
//        subseq("",st);
        System.out.println(subseqq("",st));
//        ArrayList<String> list=new ArrayList<>();
//       jump("",st);
    }
    static void subseq(String p,String st){
        if(st.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch=st.charAt(0);
        subseq(p+ch, st.substring(1));
        subseq(p,st.substring(1));
    }

    static ArrayList<String> subseqq(String p,String st){
        if(st.isEmpty()){
            ArrayList<String> str=new ArrayList<>();
            str.add(p);
            return str;
        }
        char ch=st.charAt(0);
        ArrayList<String> left=subseqq(p+ch,st.substring(1));
        ArrayList<String> right=subseqq(p,st.substring(1));
        left.addAll(right);
        return left;
    }

    static void jump(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        jump(p+ch,up.substring(1));
        jump(p,up.substring(1));
    }

//    static ArrayList<String> alv(ArrayList<String> list, String st){
//        if()
//    }
}
