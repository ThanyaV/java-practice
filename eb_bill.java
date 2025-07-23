import java.util.Scanner;
class eb_bill
{
 public static void main(String args[])
{
  Scanner in= new Scanner(System.in);
System.out.print("Enter no. of units used : ");
int u=in.nextInt();
System.out.print("Enter type of current (normal=0, commercial=1) : ");
int t=in.nextInt();
int c;
if(t==0)
{
  if(u>0&&u<100)
{
 System.out.print("0 rs");
}
else if(u>100&&u<200)
{
 c=u*5;
System.out.print("Cost = "+c+"rs");
}
else if(u>200&&u<300)
{
 c=u*10;
System.out.print("Cost = "+c+"rs");
}
else if(u>300&&u<400)
{
 c=u*15;
System.out.print("Cost = "+c+"rs");
}
else if(u>400&&u<500)
{
 c=u*20;
System.out.print("Cost = "+c+"rs");
}
else if(u>500)
{
 c=u*25;
System.out.print("Cost = "+c+"rs");
}
else
{
 System.out.print("INVALID");
}
}
else if(t==1)
{
if(u>0&&u<100)
{
c=u*10;
 System.out.print("Cost = "+c+"rs");
}
else if(u>100&&u<200)
{
 c=u*20;
System.out.print("Cost = "+c+"rs");
}
else if(u>200&&u<300)
{
 c=u*30;
System.out.print("Cost = "+c+"rs");
}
else if(u>300&&u<400)
{
 c=u*40;
System.out.print("Cost = "+c+"rs");
}
else if(u>400&&u<500)
{
 c=u*50;
System.out.print("Cost = "+c+"rs");
}
else if(u>500)
{
 c=u*60;
System.out.print("Cost = "+c+"rs");
}
else 
{
System.out.print("INVALID");
}
}
else
{
  System.out.print("INVALID");
}
}
}






  