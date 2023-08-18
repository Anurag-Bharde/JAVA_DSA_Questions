package Strings;

import java.util.Arrays;
import java.util.Collections;

public class orderstring {
    public static void main(String[] args) {
        String st[] = {"hello", "as", "ohok", "hmmmm","haofa"};
        System.out.println(ord(st));
    }

    static String ord(String[] input) {
            Arrays.sort(input, (s1, s2) -> Integer.compare(s2.length(), s1.length()));
//        Arrays.sort(input, Collections.reverseOrder());
//
//        for (int i = 1; i < input.length; i++) {
//            Integer.compare(input[i - 1].length(), input[i].length());

        if (input.length < 3) {
            return ""; // Return empty string if the array has less than three elements
        }
//    }
            return input[2];
//        int max=0;
//        int smax=Integer.MIN_VALUE;
//        int tmax=Integer.MIN_VALUE;
//
//
//        for(int i=0;i<st.length;i++){
//           max= Math.max(st[i].length(),max);
//        }
//        System.out.println(st[max].length());
//        for(int i=0;i<st.length;i++){
//            if(st[i]!=st[max])
//            smax= Math.max(st[i].length(),max);
//        }
//        for(int i=0;i<st.length;i++){
//            if(st[i]!=st[max] && st[i]!=st[smax])
//            tmax= Math.max(st[i].length(),max);
//        }


    }
}
