package Arrays;

public class SecLarg {
    public static void main(String Args[]){
        int[] ar={12,2564,53,62,87,244,9,55555,89,92};
       int l=-1;
       int s=-2;
       for(int i=0;i<ar.length;i++){
           if(ar[i]>l){
               s=l;
               l=ar[i];
           }
           else if(ar[i]>s){
               s=ar[i];
           }
       }
        System.out.println(l);
        System.out.print(s);
    }
}
