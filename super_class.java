class Super
{
    static void disp()
    {
   System.out.println("In super class");
    }
}
class sub extends Super
{
  static void disp()
  {
      System.out.println("In sub class");
  }
}
class super_class
{
    public static void main(String arg[])
    {
        Super obj=new sub();
        obj.disp();
    }
}

