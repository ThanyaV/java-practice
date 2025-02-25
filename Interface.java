import java.util.Scanner;

interface Area
{
    static void display() 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r = in.nextInt();  
        displayArea(r);  
    }

    static void displayArea(int r) 
    {
        double area = 3.14 * r * r;  
        System.out.println("Area of circle: " + area);  
    }
}

public class Interface implements Area
{
    public static void main(String[] args) 
    {
        Area.display();  
    }
}
