package COMPANY_QUESTIONS;

public class Workday1 {
        public static int minFlipsToDivideSubstring(String s) {
            int flipsToZero = 0;
            int flipsToOne = 0;

            for (char c : s.toCharArray()) {
                if (c == '0') {
                    flipsToOne++;
                } else {
                    flipsToZero++;
                }
            }

            int minFlips = Math.min(flipsToZero, flipsToOne);
            return minFlips;
        }

        public static void main(String[] args) {
            String password = "000001";
            int result = minFlipsToDivideSubstring(password);
            System.out.println("Minimum flips needed: " + result);
        }
}
