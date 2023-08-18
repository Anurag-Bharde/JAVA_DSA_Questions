package MATRIX;

import java.util.*;
public class setMatrixZero {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mtx=new ArrayList<>();
        mtx.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
        mtx.add(new ArrayList<Integer>(Arrays.asList(1,0,1)));
        mtx.add(new ArrayList<Integer>(Arrays.asList(1,1,1)));
        SetZero(mtx);

        for(int i=0; i<mtx.size();i++){
            for(int j=0;j<mtx.get(i).size();j++){
                System.out.print(mtx.get(i).get(j));
            }
            System.out.println();
        }
    }
    public static ArrayList<ArrayList<Integer>> SetZero(ArrayList<ArrayList<Integer>> ar){
        int n= ar.size();
        int m=ar.get(0).size();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(ar.get(i).get(j)==0){
                    row(ar,i);
                    col(ar,j);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(ar.get(i).get(j)==-1){
                    ar.get(i).set(j,0);
                }
            }}
        return ar;
    }
   static void col(ArrayList<ArrayList<Integer>> mtx,int i){
        for(int j=0;j<mtx.get(i).size();j++){
            mtx.get(i).set(j,-1);
        }
    }
    static void row(ArrayList<ArrayList<Integer>> mtx,int j){
        for(int i=0;i<mtx.size();i++){
            mtx.get(i).set(j,-1);
        }
    }
}
