import java.util.Scanner;
public class Getstringfromuser
{
    public static void main(String arg[])
    {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter a string:");
        String a = in.next();
        System.out.println("String:"+a);
        
    }
}