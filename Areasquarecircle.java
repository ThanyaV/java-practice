import java.util.Scanner;
class shape
{
    protected double area;
    public void calculate_area()
    {
        System.out.println("Area of shapes");
    }
}
class square extends shape
{
    private  int a;
    public void calculate_area()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a : ");
        a = in.nextInt();
        area = a*a;
        System.out.println("Area a square = "+area);
    }
}
class circle extends shape
{
    private  double r;
    public void calculate_area()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter r : ");
        r= in.nextInt();
        area = 3.14*r*r;
        System.out.println("Area a Circle = "+area);
    }
}
public class Areasquarecircle
{
    public static void main(String arg[])
    {
        shape s1=new square();
        s1.calculate_area();
        shape s2=new circle();
        s2.calculate_area();
        
    }
}












