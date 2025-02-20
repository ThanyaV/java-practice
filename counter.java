import java.util.Scanner;
public class counter
{
    public static void main(String arg[])
    {
        counter a=new counter();
        a.display();
        counter b=new counter();
        b.display();
        counter c=new counter();
        c.display();
        counter d=new counter();
        d.display();
    }
    static int count=0;
     counter()
     {
         count++;
     }
     void display()
     {
         System.out.println("Object created! current object = "+count);
     }
    
}
