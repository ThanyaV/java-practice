class Calculate
{
    static int a=1,n=10;
    static void calc()
    {
        System.out.println("calculation of 1 and 10 are");
        System.out.println();
    }
}
class factorial extends Calculate
{
    static int fac=1;
    static void calc()
    {
        for(int i = a; i <= n; ++i)
        {
            fac=fac*i;
            
        }
        System.out.println("Factorial of given n = "+fac+ " ");
        System.out.println();
    }
}
class fibonacci extends Calculate
{
    static int fib,n1=0,n2=1,n3;
    static void calc()
    {
        System.out.print("Fibonacci = ");
      for(int i=a;i<n;++i)   
       {    
         n3=n1+n2;
         System.out.print(" "+n3);
         n1=n2;    
         n2=n3;    
        } 
          System.out.println();
          System.out.println();
    }
}
class prime extends Calculate
{
    static int prime;
    static void calc()
    {
       int x, y, flg;
        System.out.print( "Prime number = ");
        for (x = 2; x <= n; x++) 
        {
            flg = 1;
            for (y = 2; y * y <= x; y++) 
            {
                if (x % y == 0) 
                {
                    flg = 0;
                    break;
                }
            } 
            if (flg == 1)
                System.out.print(x + " ");
        }  
    }
}
class Factorial_Febonacci_prime
{
    public static void main(String arg[])
    {
       Calculate b=new Calculate();
       Calculate.calc();
       factorial c=new factorial();
       factorial.calc();
       fibonacci d=new fibonacci();
       fibonacci.calc();
       prime e=new prime();
       prime.calc();
    }
}








