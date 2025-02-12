class Main
{ 
     static boolean isprime(int n)
    {
        if (n<=1)
        return false;
        for(int i=2;i<n;i++)
        if(n%i==0)
         return false;
         return true;
        
    }
    public static void main(String args[])
    {
        if (isprime(11))
          System.out.println("true");
        else
           System.out.println("false");
        if(isprime(3))
            System.out.println("true");
        else
           System.out.println("false");
    }
}