package COMPANY_QUESTIONS.Nice;
import java.util.*;
public class parentquestion {
    static void func(int n,int[] ar, int q,int[] x,int[] y,int a){
        HashSet<Integer> hset=new HashSet<>();
        hset.add(a);
       int i=0;
            if(hset.contains(x[i]) || hset.contains(x[i+1])){
                hset.add(x[i]);
                hset.add(x[i]);
            }
        if(hset.contains(y[i]) || hset.contains(y[i+1])){
            hset.add(y[i]);
            hset.add(y[i]);
        }
        int res=0;
        for(int t:hset){
            res=res+t;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        int ar[]={1,2,3};
        int[] y={1,3};
        int[] x={1,2};

        func(3,ar,2,x,y,3);
    }
}
