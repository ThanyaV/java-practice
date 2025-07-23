import java.util.Scanner;
class greatest
{
 public static void main(String args[])
{ 
Scanner in=new Scanner(System.in);
  int a=in.nextInt();
  int b=in.nextInt();
  int c=in.nextInt();
int d=in.nextInt();
  if (a>b&&a>c&&a>d)
{
  System.out.println("A is greatest");
}
else if(b>c&&b>a&&b>d)
{ 
  System.out.println("B is greatest");
}
else if(c>a&&c>b&&c>d)
{
  System.out.println("C is greatest");
}
else if(d>a&&d>b&&d>c)
{
 System.out.println("D is greatest");
}
else if(a==b&&a>c&&a>d)
{
  System.out.println("A and B are equal and greatest");
}
else if(a==c&&c>b&&c>d)
{
 System.out.println("A and C are equal and greatest");
}
else if(a==d&&a>b&&a>c)
{
System.out.println("A nad D are equal and greatest");
}
else if(b==c&&c>a&&c>d)
{
 System.out.println("B and C are equal and greatest");
}
else if(b==d&&b>a&&b>c)
{
 System.out.println("B and D are equal and greatest");
}
else if(c==d&&c>a&&c>b)
{
System.out.println("C and D are equal and greatest");
}
else if(a==b&&b==c&&c>d)
{
System.out.println("A, B and C are equal and greatest");
}
else if(b==c&&c==d&&d>a)
{
System.out.println("B, C and D are equal and greatest");
}
else if(c==d&&d==a&&c>b)
{
System.out.println("A, C and D are equal and greatest");
}
else
{
  System.out.println("all are equal");
}
}
}
  