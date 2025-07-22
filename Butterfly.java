import java.util.Scanner;
public class Butterfly 
{
    public static void main(String[] args) 
{
  int N=5;
  int space=2*N-1;
  int star=0;
  for(int i=1;i<=2*N-1;i++) 
{
  if(i<=N) 
{
  space=space-2;
  star++;
 }
else 
{
 space=space+2;
  star--;
}
for(int j=1;j<=star;j++) 
{
  System.out.print("*");
}
for(int j=1;j<=space;j++)
{
  System.out.print(" ");
}
for(int j=1;j<=star;j++) 
{
if(j!=N) 
{
  System.out.print("*");
}
}
System.out.println(); 
}
}
}
