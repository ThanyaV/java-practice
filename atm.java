import java.util.Scanner;
class atm
{
public static void main(String args[])
{
  Scanner in=new Scanner(System.in);
  System.out.print("Insert card");
System.out.println();
System.out.print("Enter pin : ");
int p=in.nextInt();
int b=10000;
if(p==4321)
{
System.out.print(" Choose option (balance =0, withdraw=1, deposit=2, pin change=3, exit=4) : ");
int c=in.nextInt();
 if(c==0)
{
  System.out.print("BALANCE = "+b);
}
else if(c==1)
{
  System.out.print("Enter amount to withdraw : ");
  int w=in.nextInt();
System.out.println();
   b=b-w;
  if(w<b)
{
  System.out.print("Insufficient Balance");
}
else
{
 System.out.print(w+" Withdrawed");
System.out.println();
System.out.print("BALANCE = "+b);
}
}
else if(c==2)
{
  System.out.print("Enter the amount to deposit : ");
 int d=in.nextInt();
b=d+b;
System.out.println();
System.out.print(d+" Deposited");
System.out.println();
System.out.print("BALANCE = "+b);
}
else if(c==3)
{
 System.out.print("Enter old pin : ");
 int o=in.nextInt();
 if(o==p)
{
  System.out.print("Enter new pin : ");
 int n=in.nextInt();
System.out.println();
System.out.print("NEW PIN = "+n);
}
else
{ 
System.out.print("INVALID PIN");
}
}
else if(c==4)
{
 System.out.print("<<<THANKYOU! VISIT AGAIN>>>");
}
else
{
 System.out.print("INVALID OPERATION");
}
}
else
{
 System.out.print("INVALID PIN");
}
System.out.println();
System.out.print("<<<THANKYOU! VISIT AGAIN>>>");
}
}





