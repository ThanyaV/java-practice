import java.util.Scanner;
abstract class Abstract_without_inheritance
{
    static float r;
    static float area;
    static float circum;
    static void get()
    {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the value of radius : ");
       r=in.nextFloat();
    }
    static void a_c_circle()
    {
        area = 3.14f*r*r;
        System.out.println("Area of circle : "+area);
        circum = 2*3.14f*r;
        System.out.println("Circumfrance of circle : "+circum);
    }
    public static void main(String arg[])
    {
        Abstract_without_inheritance.get();
        Abstract_without_inheritance.a_c_circle();
    }
}