package Recursion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class PhoneKeyPad{
        public static void main(String[] args) {
            String digits = "23"; // Example input
            List<String> result = letterCombinations(digits);
            System.out.println(result);
        }
        public static ArrayList<String> letterCombinations(String digits){
            ArrayList<String> resul=new ArrayList<>();
            if(digits.isEmpty()) return resul;
            HashMap<Character,String> hmap=new HashMap<>();
            hmap.put('2',"abc");
            hmap.put('3',"def");
            hmap.put('4',"ghi");
            hmap.put('5',"jkl");
            hmap.put('6',"mno");
            hmap.put('7',"pqrs");
            hmap.put('8',"tuv");
            hmap.put('9',"wxyz");

            generate(digits,0,"",resul,hmap);
            return resul;
        }
        public static void generate(String digits, int current, String ans, ArrayList<String> resul,HashMap<Character,String> hmapp){
           if(current==digits.length()){
               resul.add(ans);
               return;
           }

            char x=digits.charAt(current);
            String y=hmapp.get(x);

            for(char t:y.toCharArray()){
                generate(digits,current+1,ans+t,resul,hmapp);
            }
        }
    }

