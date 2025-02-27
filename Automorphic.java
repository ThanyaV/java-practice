import java.util.Scanner;
class Automorphic
{
    static void c()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=in.nextInt();
        System.out.println();
        int multi=n*n;
        int x=n*n;
        System.out.println(""+x);
        System.out.println();
        if(n<10)
        {
            if(n==multi%10)
            {
                System.out.println(n+" is Automorphic");
            }
            else
            {
              System.out.println(n+" is not Automorphic");  
            }
            
        }
        else
        {
            if(n%10==multi%10)
            {
                System.out.println(n+" is Automorphic");
            }
            else
            {
              System.out.println(n+" is Automorphic") ; 
            }
            
        }
        
    }
    public static void main(String [] arg)
    {
        c();
    }
}









