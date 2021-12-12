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

class Result3 {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        if(s.contains("AM")){
            if(s.charAt(0)=='1' && s.charAt(1)=='2'){
                s=s.replace(""+s.charAt(0)+s.charAt(1),"00");
                s=s.replace("AM","");
                return s;
            }
            else{
                s=s.replace("AM","");
                return s;
            }
        }
        else{
            if(s.charAt(0)=='1' && s.charAt(1)=='2'){
                    s=s.replace("PM","");
                    return s;
                }
                else{
                    String q = String.valueOf(""+s.charAt(0)+s.charAt(1));
                    s=s.replace(q,String.valueOf(Integer.parseInt(q)+12));
                    s=s.replace("PM","");
                    return s;
                }
        }

    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result3.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
