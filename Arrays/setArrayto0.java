package Arrays;
import java.util.Arrays;

public class setArrayto0 {
    public static void main(String[] args) {
        int[][] ar = {{0, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int ans[][]=setter(ar);
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++) {
                if(ar[i][j]==-1){
                    ar[i][j]=0;
                }
            }
            }
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++) {
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }

    }
    static int[][] setter(int[][] ar){

        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[0].length;j++){
                if(ar[i][j]==0){
                    row(i,ar);
                    col(j,ar);
                }
            }
        }
        return ar;
    }
    static int[][] row(int i,int[][] ar){
        for(int j=0;j<ar[i].length;j++){
            ar[i][j]=-1;
        }
        return ar;
    }static int[][] col(int j,int[][] ar){
        for(int i=0;i<ar.length;i++){
            ar[i][j]=-1;
        }
        return ar;
    }
}
