package Recursion;

public class CtSteps {
        public static void main(String[] args) {
            System.out.println(helpp(8));
        }
        static int helpp(int n){
            return hellper(n,0);
        }
        static int  hellper(int n,int ans){
            if(n==0){
                return ans;
            }
            if(n%2==0) return hellper(n/2,ans+1);
            return hellper(n-1,ans+1);

        }
    }
