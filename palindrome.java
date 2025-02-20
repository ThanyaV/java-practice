import java.util.Scanner;
public class palindrome
{ 
    public static void main(String arg[])
    {
       Scanner in=new Scanner(System.in);
       System.out.print("Enter a combo of character:");
       int a=in.nextInt();
       if(palindrome(a))
       {
           System.out.print("It is a palindrome");
       }
       else
       {
         System.out.print("It is not a palindrome");  
       }
    }
    public static boolean palindrome(int a)
    {
        int n= a;
        int r=0;
        while(a!=0)
        {
        int d =a%10;
        r =r*10+d;
        a/=10;
        }
        return n==r;
    }
}