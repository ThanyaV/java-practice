class Calculate
{
    static int a=10,b=5;
    static void calctwonum()
    {
       System.out.println("Calculation of two numbers 10 and 5 are : "); 
    }
}
class sum extends Calculate
{
    static int sum;
    static void calctwonum()
    {
        sum=a+b;
        System.out.println("Sum = "+sum);
    }
}
class diff extends Calculate
{
    static int diff;
    static void calctwonum()
    {
        diff=a-b;
        System.out.println("Difference = "+diff);
    }
}
class pro extends Calculate
{
    static int pro;
    static void calctwonum()
    {
        pro=a*b;
        System.out.println("Product = "+pro);
    }
}
class div extends Calculate
{
    static float div;
    static void calctwonum()
    {
        div=a/b;
        System.out.println("Division = "+div);
    }
}
class Calc
{
  public static void main(String args[])
  {
      Calculate f=new Calculate();
      Calculate.calctwonum();
      sum obj=new sum();
      sum.calctwonum();
      diff n=new diff();
      diff.calctwonum();
      pro p=new pro();
      pro.calctwonum();
      div d=new div();
      div.calctwonum();
  }
}
