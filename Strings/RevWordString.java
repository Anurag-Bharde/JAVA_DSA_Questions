package Strings;

import java.util.Stack;

public class RevWordString {
    public static void main(String[] args) {
        String st="I am      Anurag   BHarde";
//        System.out.println(revv(st));
        String r="24688";
        int m=Integer.parseInt(r);
//        System.out.println(m);
       int ok=0;
        while(m!=0){
            int ans=m%10;
            if(ans>ok && ans%2!=0) ok=ans;
            if(ok==0)
            m=m/10;
        }
        System.out.println(ok);
    }
    static String revv(String st){
        int s=0;
        int e=st.length()-1;
        int sp=0;
        String t=" ";
        String ans="";
        String f="";
        while(e>=s){
            char el=st.charAt(e);
            if(el!=' '){
                if(sp>1){
                    while(sp!=1){
                        t=t+" ";
                        sp--;
                    }
                  f=t+f;
                }
                ans=el+ans;
                if(s==e){
                    f=f+" "+ans;
                }

            }
            else{
                sp++;
                    if (f.isEmpty()) {
                        f = ans;
                    } else {

                        f = f + " " + ans;
                    }

                ans="";
            }
            e--;
        }
        return f.trim();
    }
    public String reverseWords(String st) {
        String[] s=st.trim().split("\\s+");
        String ans="";
        for(int i=s.length-1;i>0;i--){
            ans+=s[i]+" ";
        }
        return ans+s[0];
    }

}
