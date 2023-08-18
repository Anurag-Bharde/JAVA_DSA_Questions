package Arrays;

public class secel {
    public static void main(String[] args) {
        int[] ar={2,5,6,20020,2,4435,4545,546,5};
        System.out.println(sec2(ar));
    }
    static int sec(int[] ar){
        int maxx=0;
        int secmax=0;
        for(int i=0;i<ar.length;i++){
          maxx=  Math.max(ar[i],maxx);
        }
        for(int i=0;i<ar.length;i++){
            if(ar[i]<maxx){
                secmax=Math.max(secmax,ar[i]);
            }
        }
        return secmax;
    }
    static int sec2(int[] ar){
        int lar=Integer.MIN_VALUE;
        int secm=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>lar){
                secm=lar;
                lar=ar[i];
            }
            else if (ar[i]>secm && ar[i]!=lar){
                secm=ar[i];
            }
        }
        return secm;
    }

}
