package Recursion;

public class ProdN {
    public static void main(String[] args) {
        int n=5;
        System.out.println(prid(n));
    }
    static int prid(int n){
        if(n==1) return 1;
        n=n*prid(n-1);
        return n;
    }
}
