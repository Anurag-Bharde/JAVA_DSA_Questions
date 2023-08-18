package Strings;
import java.util.*;
public class Methodzzz {
    public static void main(String args[]){
        String str="                 Zabaxfdad adsa aa adss f             ";
//        String tr="ax";
//        System.out.println(str.strip());
       str= str.strip();
       str= Arrays.toString(str.split(" "));
        System.out.println(str);
        System.out.println(str.subSequence(4,9));
        System.out.println(str.substring(4,9));

        StringBuilder sb=new StringBuilder("");
        sb.append("adfafda");

    }
}
