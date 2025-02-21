import java.util.Scanner;
class C
{
    private int a,b,c;
    private void get()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter value 1 : ");
        a=in.nextInt();
        System.out.print("Enter value 2 : ");
        b=in.nextInt();
    }
    public void main()
    {
        get();
        c=a+b;
        System.out.println("Sum = "+c);
    }
}
public class Method
{
    public static void main(String arg[])
    {
        C obj=new C();
        obj.main();
    }
}
