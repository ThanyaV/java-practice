import java.util.Scanner;
class div_two_int
{
    public static int divide(int dividend, int divisor)
    {
        if(dividend==Integer.MIN_VALUE&&divisor==-1)
        {
            return Integer.MAX_VALUE;
        }
        boolean isNegative=(dividend<0)^(divisor<0);
        long longdividend=Math.abs((long)dividend);
        long longdivisor=Math.abs((long)divisor);
        int quotient=0;
        while(longdividend>=longdivisor)
        {
            long temp=longdivisor;
            int i=1;
            while(longdividend>=(temp<<1))
            {
                temp<<=1;
                i<<=1;
            }
            longdividend-=temp;
            quotient+=i;
        }
        return isNegative?-quotient:quotient;
    }
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the dividend : ");
        int dividend=in.nextInt();
        System.out.print("Enter the divisor : ");
        int divisor=in.nextInt();
        div_two_int obj=new div_two_int();
        int quotient=div_two_int.divide(dividend, divisor);
        System.out.print("Quotient : "+quotient);
    }
}