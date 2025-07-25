import java.util.Scanner;

class move_zero
{
public static void main(String args[])
{
int[] a={1,3,0,4,0,8,0};
int l=0;
for(int i=0;i<a.length;i++)
{
if(a[i]!=0)
{
a[l]=a[i];
l++;
}
}
while(l<a.length)
{
a[l]=0;
l++;
}
for(int num:a)
{
System.out.println(num);
}
}
}
