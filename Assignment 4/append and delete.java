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
 
    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */
 
    public static String appendAndDelete(String s, String t, int k) {
           StringBuilder ss=new StringBuilder(s);
           int n=0;
           int no=Math.min(s.length(),t.length());
        
        for(int i=0;i<no;i++)
           {
               if(s.charAt(i)==t.charAt(i))
               n++;    
               else
               break;
           }
           System.out.println(n);
           if(n!=s.length()){
           int diff=ss.length()-n;
           k=k-diff;}
           ss.delete(n,ss.length());
 
      
           if(ss.length()!=t.length()){
           for(int i=ss.length();i<t.length();i++)
           {
                   ss.append(t.charAt(i));
                   k--;
           }
           }
           //System.out.println(ss);
           if(k==0 || k>0)
           return "Yes";
           else
           return "No";
    }
 
}
 
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
 
        String s = bufferedReader.readLine();
 
        String t = bufferedReader.readLine();
 
        int k = Integer.parseInt(bufferedReader.readLine().trim());
 
        String result = Result.appendAndDelete(s, t, k);
 
        bufferedWriter.write(result);
        bufferedWriter.newLine();
 
        bufferedReader.close();
        bufferedWriter.close();
    }
}
 
