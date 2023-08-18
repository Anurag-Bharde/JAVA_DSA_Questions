package Strings;

public class Anagram {
    public static void main(String[] args) {
        String s="ANAGRM";
        String st="NAARAG";
        System.out.println(ana(s,st));
    }
    static boolean ana(String s,String st){

        if(s.length()!=st.length()) return false;
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[(s.charAt(i)-'A')]++;
        }for(int i=0;i<st.length();i++){
            freq[(st.charAt(i)-'A')]--;
        }
        for(int i=0;i<s.length();i++){
            if(freq[i]!=0) return false;
        }
          return true;
    }
}
