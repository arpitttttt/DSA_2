import java.util.Scanner; 
public class a 
{
     public static void main(String[] args)
      { 
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          long ar[]=new long[n];
          for(int i=0;i<n;i++)
          ar[i]=sc.nextInt();
          long sum=0;
          for(int i=0;i<n;i++)
          sum+=ar[i];
          System.out.println(sum);
      }
}          
