package Recursion;

public class Practice {
    public static void main(String args[]){
        String st="baccad";
        String re="";
        subset(st,re);
    }
    static void subset(String st, String re){
        if(st.isEmpty()){
            System.out.println(re);
            return;
        }
        String t=st.substring(0);
        if(t.startsWith("a")){
             subset(st.substring(1),re);
        }
         subset(st.substring(1), re+t);
    }
}
