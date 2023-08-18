package Arrays;

public class nBy3sol {
    public static void main(String[] args) {
        int ar[] = {1, 2, 2,3,2,6,7};
        System.out.println(n3 (ar));
    }
    static int n3(int[] ar){
        int el1=0;
        int el2=0;
        int ct1=0;
        int ct2=0;
        for(int i=0;i<ar.length;i++){
            if(el2!=ar[i] && ct1==0){
                el1=ar[i];
                ct1++;
            }
            else if(el1!=ar[i] && ct2==0){
                el2=ar[i];
                ct2++;
            }
            else if(el1==ar[i]){
                ct1++;
            }
            else if(el2==ar[i]){
                ct2++;
            }
            else{
                ct1--;ct2--;
            }
        }
        ct1=0;
        ct2=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==el1) ct1++;
            if(ar[i]==el2) ct2++;
        }

        int nrk=ar.length/3;
        if(ct1>=nrk) return el1;
        if(ct2>=nrk) return el2;
        return -1;
    }
}

