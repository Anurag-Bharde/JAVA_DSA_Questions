package Arrays;

public class largeElem {

    static int largeme(int ar[]){
        int ans=Integer.MIN_VALUE;
        for(int te:ar){
            if(te>ans){
                ans=te;
            }
        }
        return ans;
    }

    public static void main(String Args[]){
        int ar[]={2,3,4,1,3456,231422,6778,23,411,2432,435,436,5,235425225,444545453};
        int mb=largeme(ar);
        System.out.println(mb);
    }
}
