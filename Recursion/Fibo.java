package Recursion;

public class Fibo {
    public static void main(String[] args) {
        int n=7;
        int s=0;
        int e=1;
        System.out.println(fib(n));
    }
    static int fib(int n){

        if(n==0){

            return 0;
        }
        if(n==1){
            return 1;
        }
      int fb= fib(n-1) + fib(n-2);

        return fb;
    }
}
