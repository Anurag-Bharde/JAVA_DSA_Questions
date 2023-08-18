package MATRIX;

public class maxareahistogram{
    public static int maxhist(int ar[]){
        int n=ar.length;
           int a=0;
           int b=0;
           int c=0;
           int ct=0;
           int tot=0;
           int left=0;
           int right=0;
           int max=Integer.MIN_VALUE;
           for(b=0;b<n;b++){
            ct=0;
            for(a=b;a>=0;a--){
                if(ar[a]<ar[b]){
                  left=a;
                  break;
                }               
            }
            for(c=b;c<n;c++){
                if(ar[c]<ar[b]){
                    right=c;
                    break;
                }
            }
            ct=right-left+1;
            tot=ar[b]*ct;
            max=Math.max(tot,max);
           }
           return max;   
    }
    public static void main(String[] args) {
        int ar[]={2,1,5,6,2,3};
       System.out.println(maxhist(ar));
    }
}