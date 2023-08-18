import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class VERITASS {

    /*
     * Complete the 'preprocessDate' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY dates as parameter.
     */

    public static List<String> preprocessDate(List<String> dates) {
        String yr="";
        String fin="";
        String mon="";
        String num="";
        String dat="";
        List<String> damt=new ArrayList<String>();
        int k=0;
        for(int i=0;i<dates.size();i++){
            int j=dates.get(i).length()-1;
            while(j>=0){

                if(k<4){
                    yr=dates.get(i).charAt(j)+yr;
                }
                if(k==4){
                    fin=yr+"-";
                }
                if(k<8 && k>4){
                    mon=dates.get(i).charAt(j)+mon;
                }
                if(k==8){
                    String fim= findmon(mon);
                    fin=fin+fim+"-";
                }
                if(j==0){
                    int r=1;
                    dat= String.valueOf(dates.get(i).charAt(1));
                    dat=dates.get(i).charAt(0) + dat;
                    fin=fin+dat;
                }
                j--;
                k++;
            }
            damt.add(fin);
        }
        return damt;
    }


    public static String findmon(String mon){
        switch(mon){
            case ("Jan"): return "01";
            case ("Feb"): return "02";
            case ("Mar"): return "03";
            case ("Apr"): return "04";
            case ("May"): return "05";
            case ("Jun"): return "06";
            case ("Jul"): return "07";
            case ("Aug"): return "08";
            case ("Sep"): return "09";
            case ("Oct"): return "10";
            case ("Nov"): return "11";
            default : return "12";
        }
    }



    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int datesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> dates = IntStream.range(0, datesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<String> result = VERITASS.preprocessDate(dates);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
