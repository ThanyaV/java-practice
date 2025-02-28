import java.util.Scanner;
class pronic_niven_abundant
{
    public static void main(String arg[])
    {
        get();
        pronic();
        niven();
        abundant();
    }
    static int n;
    static void get()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number : ");
        n=in.nextInt();
    }
    static int a;
    static void pronic()
    {
        for(int i=0;i<=n;i++)
        {
            if(i*(i+1)==n)
            {
                a=1;
                break;
            }
        }    
            if(a==1)
            {
                System.out.println(n+" is pronic number");
            }
            else
            {
                System.out.println(n+" is not pronic number");
            }
    }
    static int temp,r,sum=0;
    static void niven()
    {
        temp=n;
        while(temp>0)
        {
            r=temp%10;
            sum=sum+r;
            temp=temp/10;
        }
        if(n%sum==0)
        {
            System.out.println(n+" is Niven number");
        }
        else
        {
           System.out.println(n+" is not Niven number") ;
        }
    }
    static int s=0;
    static void abundant()
    {
        for (int i = 1; i < n; i++)
        {
          if (n % i == 0) 
           { 
            s += i;
           }
        } 
        if(s>n)
        {
            System.out.println(n+" is abundant number");
        }
        else
        {
            System.out.println(n+" is not abundant");
        }
        
    }
}




















