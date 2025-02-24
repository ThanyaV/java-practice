import java.util.Scanner;
abstract class Bankaccount
{
    private static int accountnum;
    private static float balance;
    static int intrestrate=5;
    static float a;
    static int y;
    double i;
    Bankaccount()
     {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter account number : ");
        accountnum=in.nextInt();
        System.out.print("Enter account balance : ");
        balance=in.nextFloat();
    }
     abstract void calculateintrest();
    static void get_bl()
    {
        a=balance;
    }
    static void get_ir()
    {
        y=intrestrate;
    }
    
}
class Savingsaccount extends Bankaccount
{
    Savingsaccount()
    {
        super();
    }
    public void calculateintrest()
    {
      super.i=super.a*super.y/365;
      System.out.println("Intrest = "+super.i);
    }
    public static void main(String arg[])
    {
        Bankaccount.get_bl();
        Bankaccount.get_ir();
        Savingsaccount obj=new Savingsaccount();
        obj.calculateintrest();
    }
}





