class Shape
{
    public void area()
    {
       System.out.println("Area of Shapes") ;
    }
}
class Rectangle extends Shape
{
    float length ,breath;
    public Rectangle(float l,float b)
    {
        this.length=l;
        this.breath=b;
    }
    @Override
    public void area()
    {
          float a=length*breath;
        System.out.println("Area of Rectangle = "+a);
    }
}
class Super_key
{
    public static void main(String arg[])
    {
     Rectangle r=new Rectangle(12.0f,13.0f);
     r.area();
     
    }
}
