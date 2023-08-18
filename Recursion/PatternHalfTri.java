package Recursion;

public class PatternHalfTri {
    public static void main(String[] args) {
        int r=5;
        int b=1;
        tri(r,b);
    }
    static void tri(int r,int b){
        if(r==0) return;
        for(int i=0;i<b;i++){
            System.out.print("*");
        }
        System.out.println();
        tri(r-1,b+1);
    }
}
