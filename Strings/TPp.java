package Strings;

public class TPp {
    public static void main(String[] args) {
        String[] s={"flower","float","floor"};
        String prefix=s[0];
        for(int i=0;i<s.length;i++){
            while(s[i].indexOf(prefix)!=0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

    }
}
