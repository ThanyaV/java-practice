import java.util.Scanner;
class marksheet
{
 public void marksheet()
{
 Scanner in=new Scanner(System.in);
 System.out.print("Enter name : ");
 String name=in.nextLine();
 System.out.print("Enter reg no. : ");
 int reg=in.nextInt();
 System.out.print("Enter marks of s1 : ");
 int s1=in.nextInt();
System.out.print("Enter marks of s2 :" );
int s2=in.nextInt();
System.out.print("Enter marks of s3 : ");
int s3=in.nextInt();
int total = s1+s2+s3;
int avg=total/3;
System.out.println();
System.out.print("Total = "+total);
System.out.println();
System.out.print("Average = "+avg);
System.out.println();
if(s1>100||s2>100||s3>100)
{
System.out.println("ERROR! INVALID MARKS");
}
else if(s1<=30||s2<=30||s3<=30)
{
 System.out.println("FAIL");
}
else
{
if (total>=290&&total<=300)
{
 System.out.print("GRADE = O");
}
else if(total>=250&&total<290)
{
 System.out.print("GRADE = A");
}
else if(total>=200&&total<250)
{
 System.out.print("GRADE = B");
}
else if(total>=150&&total<200)
{
 System.out.print("GRADE = C");
}
else if(total>=100&&total<150)
{
System.out.print("GRADE = D");
}
else
{
 System.out.print("FAIL");
}
}
}
public static void main(String args[])
{
 marksheet obj=new marksheet();
obj.marksheet();
}
}
 
