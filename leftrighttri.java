import java.util.Scanner;
class right
{
    public void tri()
    {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter number of rows : ");
        int n=in.nextInt();
     for (int i = 1; i <= n; ++i)
     {

      for (int j = 1; j <= i; ++j)
      {
        System.out.print( " *");
      }
      System.out.println("");
     }
    }
}
class left
{
    public void tir()
    {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter number of rows : ");
        int n=in.nextInt();
    for (int i = 1; i <= n; i++)
    {
      for (int j=1;j<=n-i+1;j++)
      {
          System.out.print("  ");
      }
      for(int j=1;j<=i;j++)
      {
          System.out.print(" *");
      }
      System.out.println(" ");
    }
    }
}
class leftrighttri
{
    public static void main(String arg[])
    {
        System.out.println("Rightangle triangle : ");
        right obj = new right();
        obj.tri();
        System.out.println("");
        System.out.println("Leftangle triangle : ");
        left a = new left();
        a.tir();
        
       
    }
    
}










