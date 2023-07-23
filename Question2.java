import java.util.*;
public class Question2
{
    public static void main(String args[])
    {   List<Integer> l=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements in the array:");
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt(); 

        }
       int reqNum=arr[0];
        for(int i=0;i<n;i++)
        {  while(reqNum<arr[i])
           {
             l.add(reqNum);
             reqNum++;
           }
           reqNum++;
        }
        System.out.println("Missing numbers are:");
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i)+" ");
        }
    }
}
