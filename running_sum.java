import java.util.Scanner;
class running_sum
{
public static void main(String args[])
{
int a[]={1,2,3,4};
int n=a.length;
int sum=0;
int result[]=new int[a.length];
for(int i=0;i<n;i++)
{
sum=sum+a[i];
result[i]=sum;
}
for(int num:result)
{
 System.out.println(num);
}
}
}