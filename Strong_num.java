import java.util.Scanner;
class Strong_num
{
    static int n,r,fac=1,temp;
    static int sum=0;
    static void num()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter n : ");
        n=in.nextInt();
        temp=n;
        while(temp>0)
        {
            fac =1;
            r=temp%10;
             for(int i = 1; i <= r; ++i)
            {
                fac=fac*i;
            }
            System.out.println(fac);
            sum=sum+fac;
            temp=temp/10;
        }
        System.out.println();
        System.out.println("Sum of the factorial of "+n+" = "+sum);
        System.out.println();
        if(sum==n)
        {
          System.out.println(n+" is a Strong number");
        }
        else
        {
            System.out.println(n+"is not a Strong number");
        }
        
    }
    public static void main(String arg[])
    {
       num(); 
    }
}