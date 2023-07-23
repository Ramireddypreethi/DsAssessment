import java.util.*;
public class Question3
{
    public static void main(String args[])
    {     List<Integer> l=new ArrayList<Integer>();
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter number of elements:");
          int n=sc.nextInt();
          System.out.println("Enter elements in the array:");
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
          Arrays.sort(arr);
          int count=0;
          for(int i=0;i<n-1;i++)
          {
             if(i<n && arr[i]==arr[i+1])
             {
                count++;
                i++;
             }
          }
          System.out.println("Total number of socks="+count);
          
    }
}
