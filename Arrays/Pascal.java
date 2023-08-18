package Arrays;

import java.util.ArrayList;

public class Pascal {
    public static void main(String[] args) {
        int n=5;
        ArrayList<ArrayList<Integer>> pascall=new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans=row(pascall,n);
        System.out.println(ans);
    }
   static ArrayList<ArrayList<Integer>> row(ArrayList<ArrayList<Integer>> paad, int n){
        for(int i=0;i<n;i++){
            ArrayList<Integer> ans=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    ans.add(1);
                }
                else{
                    ans.add(paad.get(i-1).get(j-1)+paad.get(i-1).get(j));
                }
            }
            paad.add(ans);
        }
        return paad;
   }
}
