package Stacks;
import java.util.*;
public class MaxNestParameter {

    static int param(String st){
       int ans=0;
       int tot=0;
       for(int i=0;i<st.length();i++){
           if(st.charAt(i)=='('){
               ans++;
           }
           if(st.charAt(i)==')'){
               ans--;
           }
           tot=Math.max(tot,ans);
       }
        return tot;
    }
    public static void main(String[] args) {
        String st="(1+(2*3)+(()/4))+1";
        int r=param(st);
        System.out.println(r);
    }
}
