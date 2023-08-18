package Strings;
import java.util.Arrays;
public class SortByFreq {
    public String frequencySort(String s) {
        char[] st=s.toCharArray();
        Arrays.sort(st);
        StringBuilder sb=new StringBuilder("");
        for(int i=st.length-1;i>=0;i--){
            sb.append(st[i]);
        }
        return sb.toString();
    }


    public static void main(String[] args) {

    }
}
