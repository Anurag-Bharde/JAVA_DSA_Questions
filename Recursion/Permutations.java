package Recursion;

public class Permutations {
    public static void main(String[] args) {
        permut("","ABC");
    }
    static void permut(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String s=p.substring(0,i);
            String f=p.substring(i,p.length());
            permut(s+ch+f,up.substring(1));
        }
    }
}
