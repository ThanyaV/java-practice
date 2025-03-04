import java.util.*;

public class get_palindrome
{
    static void str()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("String Without builtin function ");
        System.out.print("Enter the String : ");
        String s= in.nextLine();
        int n=s.length();
        String rev="";
        for(int i=n-1;i>=0;i--)
        {
            rev+=s.charAt(i);
        }
        if(checkpalindrome(s,rev))
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
        System.out.println();
    }
    static void strbff()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("StringBuffer With builtin function ");
        System.out.print("Enter the String : ");
        String s= in.nextLine();
        StringBuffer str= new StringBuffer(s);
        StringBuffer rev = new StringBuffer(str.reverse());
        if(checkpalindrome(str.toString(),rev.toString()))
        {
           System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
        System.out.println();
    }
    static void strbuild()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("StringBuilder With builtin function ");
        System.out.print("Enter the String : ");
        String s= in.nextLine();
        StringBuilder str= new StringBuilder(s);
        StringBuilder rev = new StringBuilder(str.reverse());
        if(checkpalindrome(str.toString(),rev.toString()))
        {
           System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        } 
        System.out.println();
    }
    static void strbi()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("String With builtin function ");
        System.out.print("Enter the String : ");
        String s= in.nextLine();
        String rev= new StringBuffer(s).reverse().toString();
        if(checkpalindrome(s,rev))
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
        
    }
    
    static boolean checkpalindrome(String x,String y)
    {
        if(x.equals(y))
        {
            return true;
        }
        else
            return false;
    }
    public static void main(String [] args)
    {
        str();
        strbff();
        strbuild();
        strbi();
    }
}