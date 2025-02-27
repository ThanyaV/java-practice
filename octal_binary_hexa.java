import java.util.*;
class convert
{
    public void dec_oct()
    {
        Scanner in= new Scanner(System.in);
        int n=0;
        System.out.print("Enter the number to be converted : ");
        int x=in.nextInt();
        System.out.println();
        in.nextLine();
        System.out.print("enter octal or hexa or binary : ");
        String method=in.nextLine();
        if(method.equalsIgnoreCase("octal"))
        {
            n=8;
        }
        else if(method.equalsIgnoreCase("hexa"))
        {
            n=16;
        }
        else if(method.equalsIgnoreCase("binary"))
        {
            n=2;
        }
        else{
            System.out.println("null");
        }
        System.out.println();
       
        int x1=x;
        int x2=x;
        int q=0;
        int r=0;
        int sum=0;
        int a=0;
        int rem=0;
        int digit=1;
        while(x2>0)
        {
            q=x2/n;
            r=x2%n;
            sum=sum*10+r;
            x2=q;
        }
        //System.out.println(sum);
        int sum1=sum;
        do {
               digit++;
               sum1=sum1/10;
            } while (sum1/10 > 0);
        for(int i=0;i<digit;i++)
        {
            rem=sum%10;
            a=a*10+rem;
            sum=sum/10;
        }
        System.out.println("Convertrd value : "+a);
    }
}

public class octal_binary_hexa
{
public static void main(String[] args) {
   convert o= new convert();
   o.dec_oct();
}
}