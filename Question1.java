import java.util.*;
public class Question1
{
    public static void main(String args[])
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number of elements:");
            int n=sc.nextInt();
            int[] arrNum=new int[n];
            int[] cm=new int[n];
            int mul=1;
            System.out.println("Enter elements in the array:");
            for(int i=0;i<n;i++)
            {
                arrNum[i]=sc.nextInt();
                mul*=arrNum[i];
                cm[i]=mul;
            }
            for(int i=0;i<n;i++)
            {
                arrNum[i]=cm[i];
            }
            System.out.println("Cumulative Multiple of an array:");
            
                System.out.println(Arrays.toString(arrNum));
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
        System.out.println("Array index out of bounds exception");
       }
       catch(ArithmeticException e)
       {
        System.out.println("Arithmetic Exception Occured");
       }
       catch(Exception e)
       {
        System.out.println("Unknown exception");
       }
    }
}
