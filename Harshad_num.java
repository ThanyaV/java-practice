import java.util.Scanner;
class Harshad_num
{
    static int n,temp,r,a,sum=0;
    static void num()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        n=in.nextInt();
        temp=n;
        while(temp>0)
        {
            r=temp%10;
            sum=sum+r;
            temp=temp/10;
        }
        System.out.println("Sum of digits : "+sum);
        if(n%sum==0)
        {
            System.out.println(n+" is Harshad number");
        }
        else
        {
           System.out.println(n+" is not Harshad number") ;
        }
    }
    public static void main(String arg[])
    {
        num();
    }
}