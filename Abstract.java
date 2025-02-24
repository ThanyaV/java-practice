import java.util.Scanner;
abstract class circle 
{
    protected double area;
    abstract void calc_area();
}
class Abstract extends circle
{
    private double r;
    public Abstract()
    {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter radius : ");
        r=in.nextInt();
    }
    void calc_area()
    {
        area = 3.14*r*r;
        System.out.println("Area = "+area);
    }
    public static void main(String arg[])
    {
        Abstract obj = new Abstract();
        obj.calc_area();
    }
}