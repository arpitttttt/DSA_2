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

class Result {
    public static void plusMinus(List<Integer> arr) {
double positive = 0;
double negative = 0;
double zeros = 0;
double total = arr.size();

if(total > 0 && total <= 100)
{
    for(int i = 0; i < arr.size(); i++)
    {
        if(arr.get(i)>=-100 || arr.get(i)<=100)
        {
            if(arr.get(i)<0)
            {
            negative++;
            } else if (arr.get(i)==0)
            {
                zeros++;
            } else
            {
                positive++;
            }
        } 
    } 
}
double plusF = (double)positive/(double)total;
double minusF = (double)negative/(double)total;
double zeroF = (double)zeros/(double)total;

System.out.println(plusF);
System.out.println(minusF);
System.out.println(zeroF);   

}
    }

public class Solution {
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
