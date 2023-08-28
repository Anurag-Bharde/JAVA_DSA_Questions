package Arrays;

public class SecLarg {
    public static void main(String Args[]){
        int[] ar={12,53,62,87,244,2564,9,89,92};
        int max=0;
        int secm=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                secm=max;
                max=ar[i];
            }
            else if(secm<ar[i] && ar[i]<max){
                secm=ar[i];
            }
        }
        System.out.println(max);
        System.out.println(secm);
    }
}
