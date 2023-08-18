package Arrays;
import java.util.Arrays;

public class setArrayto0 {
    public static void main(String[] args) {
        int[][] ar={{0,1,1},{1,1,1},{1,1,1}};

        ar= mar(ar);
        for(int i=0;i< ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
    }
    static int[][] mar(int[][] ar){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                if(ar[i][j]==0){
                    row(ar,i);
                    col(ar,j);
                }
            }
        }
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                if(ar[i][j]==-1)
                    ar[i][j]=0;
            }
        }
        return ar;

    }
    static void row(int ar[][],int j) {
        for (int i = 0; i < ar[j].length; i++) {
             ar[j][i]=-1;
        }
    }
        static void col(int ar[][], int j) {
            for (int i = 0; i < ar.length; i++) {
              ar[i][j]=-1;
            }
        }
}
