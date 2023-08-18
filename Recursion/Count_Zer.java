package Recursion;

public class Count_Zer {
    public static void main(String[] args) {
        System.out.println(helpp(10000001));
    }
    static int helpp(int n){
         return hellper(n,0);
    }
    static int  hellper(int n,int ans){
        if(n==0){
            return ans;
        }
        int as=n%10;
        if(as==0) return hellper(n/10,ans+1);
        return hellper(n/10,ans);

    }
}
