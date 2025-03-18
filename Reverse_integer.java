import java.util.Scanner;

public class Reverse_integer
{
    public int reverse(int x)
     {
        int sign=x<0?-1:1;
        x*=sign;
        int reversed=0;
        while(x>0) 
        {
            int digit=x%10;
            x/=10;
            if(reversed>(Integer.MAX_VALUE-digit)/10)
            {
                return 0;
            }
            reversed=reversed*10+digit;
        }
        return reversed*sign;
    }
    public static void main(String[] args) 
    {
        Reverse_integer solution = new Reverse_integer();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int x=in.nextInt();
        System.out.println("Reversed integer: " + solution.reverse(x));
    }
}