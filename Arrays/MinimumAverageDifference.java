package Arrays;

public class MinimumAverageDifference {
    public static void main(String[] args) {
        int[] ar={0,4,3,0,0};
        System.out.println(mins(ar));
    }
    public static int mins(int[] nums) {
        int sum=0;
        int rum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int ans=Integer.MAX_VALUE;
        int ane=-1;
        for(int i=1;i<=nums.length;i++){
            rum=nums[i-1]+rum;
            int go=Math.abs((rum/i)-(sum-rum)/nums.length-i);
            if(ans>go){
                ane=i-1;
                ans=go;
            }
        }
        return ane;
    }
}
