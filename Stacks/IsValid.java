package Stacks;
import java.util.*;
public class IsValid {
    static boolean isvalid(String st){
        Stack<Character> tr=new Stack<>();
        for(int i=0;i<st.length();i++) {
            if (st.charAt(i) == '(' ||st.charAt(i) == '{' || st.charAt(i) == '[' ){
                tr.add(st.charAt(i));
            }
            else{
                if( st.charAt(i) == ')' ||st.charAt(i) == '}' || st.charAt(i) == ']'){
                    if(tr.isEmpty())
                        return false;
                }
                if(st.charAt(i) == ')' && tr.peek()=='('){
                    tr.pop();
                    continue;
                }if(st.charAt(i) == '}' && tr.peek()=='{'){
                    tr.pop();
                    continue;
                }if(st.charAt(i) == ']' && tr.peek()=='['){
                    tr.pop();
                }
            }
        }
        if(!tr.isEmpty()) return false;
        return true;
    }
    public static void main(String[] args) {
        String st="(){}}{";
        System.out.println(isvalid(st));
    }
}
