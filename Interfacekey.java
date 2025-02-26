interface Interface1
{
    static void method ()
    {
        System.out.println("This is a static method");
    }
    default void method1()
    
    {
        System.out.println("This is a default method");
    }
    void method3();
    
}
interface Interface2 extends Interface1
{
   static void method ()
    {
        System.out.println("This is a static method");
    }
    default void method2()
    
    {
        System.out.println("This is a default method");
    }
    void method3();
}
class Interfacekey implements Interface2
{
    public void method3()
    {
       System.out.println("This is a abstract method"); 
    }
    public static void main(String arg[])
    {
       Interfacekey obj = new Interfacekey();
       Interface1.method();
       Interface2.method();
       obj.method1();
       obj.method2();
       obj.method3();
       
    }
}












