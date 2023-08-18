package Recursion;

public class Count1ToN {
    public static void main(String[] args) {
        int n=5;
        count(n);
    }
    static void count(int n){
        if(n==0){
            return;
        }
        count(n-1);
        System.out.println(n);
    }
}
