package Strings;

public class Palindrome {
    static String longestPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        sb.reverse();
        String st=sb.toString();
        StringBuilder sbr=new StringBuilder();
        String max="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==st.charAt(i)){
                sbr.append(s.charAt(i));
                if(sbr.length()>max.length()){
                    max=sbr.toString();
                }
            }
            else{
                sbr=sbr.delete(0,sbr.length());
            }
        }
        if(max.length()==0){
            return Character.toString(s.charAt(0));
        }
        return max;
    }

    public static void main(String[] args) {
        String s="asdfghjk";
        System.out.println(longestPalindrome(s));
    }
}
