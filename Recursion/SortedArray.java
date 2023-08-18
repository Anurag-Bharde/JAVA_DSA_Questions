package Recursion;

import java.util.ArrayList;

public class SortedArray {
    public static void main(String[] args) {
        int[] ar={1,2,3,5,6};
        int i=1;
        int k=5;
//        System.out.println(sor(ar,i,k));
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(jump(list,0,"baaadds"));
    }
    static int sor(int[] ar,int i,int k){
//        if(ar[i]<ar[i-1]) return false;
//
//        if(i== ar.length-1) return true;
//        return sor(ar,i+1);
        if(ar[i]==k) return i;
        if(i==ar[ar.length-1]) return -1;
        return sor(ar,i+1,k);
    }

    static ArrayList<Integer> jump(ArrayList<Integer> list,int idx,String s){
        if(s.isEmpty()){
            return list;
        }
        char c=s.charAt(0);
        if(c=='a'){
            list.add(idx);
        }
           return jump(list,idx+1,s.substring(1));
    }
}
