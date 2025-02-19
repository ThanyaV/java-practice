import java.util.Arrays;
import java.util.Scanner;
class Arryfromuser
{
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=in.nextInt();
        int[] b=new int[a];
        for(int i=0;i<b.length;i++)
        {
        b[i]=in.nextInt();
        }
       System.out.print(Arrays.toString(b));
       
    }
    
}