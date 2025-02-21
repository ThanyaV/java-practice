import java.util.Scanner;
class get_data
{
    public int a,b,c,d;
    public void display()
    {
       System.out.println("Sum = "+d);
    }
    public static void main(String arg[])
    {
        get_data obj=new get_data();
        Scanner in=new Scanner (System.in);
        System.out.print("Enter element 1 : ");
        obj.a =in.nextInt();
        System.out.print("Enter element 2 : ");
        obj.b=in.nextInt();
        System.out.print("Enter element 3 : ");
        obj.c=in.nextInt();
        obj.d=obj.a+obj.b+obj.c;
        obj.display();
        
    }
}
