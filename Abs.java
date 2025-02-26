abstract class than
{
    abstract void disp();
    void display(){
        System.out.println("Outer class");
    }
    static abstract class Inner
    {
        abstract void meth();
        void method()
        {
            System.out.println("Inner");
        }
    }
}
class X extends than.Inner
{
    public void meth(){
        System.out.println("Outer abstract");
    }
}
class Abs
{
    public static void main(String args[])
    {
        X obj=new X();
        obj.method();
        obj.meth();
    }
}