import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static void plusMinus(List<Integer> arr) {
        double positive = 0;
        double negative = 0;
        double nulls = 0;
        for (int i = 0; i < arr.size() ; i++) {
            if (arr.get(i)>0){
                positive++;
            }
            else if(arr.get(i)<0){
                negative++;
            }
            else {
                nulls++;
            }
        }

        System.out.printf("%.6f %n", positive/arr.size());
        System.out.printf("%.6f %n", negative/arr.size());
        System.out.printf("%.6f %n", nulls/arr.size());

    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
