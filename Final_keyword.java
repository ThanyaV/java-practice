class Shapes
{
    public void area()
    {
        System.out.println("Area of Shapes");
        System.out.println();
    }
}
class square extends Shapes
{
    final int a=5;
    public int area;
    public void sq()
    {
        System.out.println("SQUARE");
        System.out.println();
        area=a*a;
        System.out.println("side = "+a);
        System.out.println("Area of Square = "+area);
        System.out.println();
    }
}
class rectangle extends Shapes
{
    final int l=5,b=6;
    public int area;
    public void re()
    {
         System.out.println("RECTANGLE");
         System.out.println();
        area=l*b;
        System.out.println("length = "+l);
        System.out.println("breath = "+b);
        System.out.println("Area of rectangle = "+area);
        System.out.println();
    }
}
class triangle extends Shapes
{
     
    final int l=3,b=5;
    public float area;
    public void tr()
    {
        System.out.println("TRIANGLE");
        System.out.println();
        area=0.5f*l*b;
         System.out.println("length = "+l);
        System.out.println("breath = "+b);
        System.out.println("Area of triangle = "+area);
        System.out.println();
        
    }
}
class circle extends Shapes
{
    final int r=7;
    public float area;
    public void ci()
    {
         System.out.println("CIRCLE");
         System.out.println();
        area=3.14f*r*r;
        System.out.println("Radius = "+r);
        System.out.println("Area of circle = "+area);
        System.out.println();
    }
}
class Final_keyword
{
    public static void main(String arg[])
    {
        Shapes a=new Shapes();
        a.area();
        square b=new square();
        b.sq();
        rectangle c=new rectangle();
        c.re();
        triangle d=new triangle();
        d.tr();
        circle e=new circle();
        e.ci();
    }
}









