class Super1
{
   int x;
   public Super1()
   {
       x=10;
   }
  public  void display()
   {
       System.out.println("Inside Subclass & x = "+x);
   }
}
class sub extends Super1
{
    int x;
    public sub()
    {
        super();
        x=100;
    }

 public void display()
{
    System.out.println("Subclass & x = "+x);
    System.out.println("Superclass x="+super.x);
    super.display();
}
}
public class Super
{
    public static void main(String arg[])
    {
       sub obj = new sub();
       obj.display();
    }
}











