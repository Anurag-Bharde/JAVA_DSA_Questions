package Arrays;

public class KadaneAlgo {

    static void kade(int[] ar){

            int sum=0;
            int jjj=0;
        int max=0;
        int i=0;
            while(i<ar.length){
                sum=ar[i]+sum;
                if(sum<0){
                    ar[i]=0;
                    sum=0;
                }
                else{
                    ar[i]=sum;
                }
                max=Math.max(sum,max);
                i++;
            }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] ar={-4,-1,-2,-1};
        kade(ar);
    }
}
