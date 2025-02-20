import java.util.Scanner;
class get_studentdata_from_user
{
    public static void main(String arg[])
    {
        String name;
        int rollno;
        
        for(int i=1;i<=5;i++)
        {
            Scanner in = new Scanner(System.in);
        System.out.print("Enter Student Name "+i+": ");
        name = in.nextLine();
        System.out.print("Enter Student rollno " +i+": ");
         rollno= in.nextInt();
         System.out.println();
         System.out.println("Student "+i+ " Name: "+name);
         System.out.println("Student "+i+" rollno: "+rollno);
         System.out.println();
         
        }
        System.out.println();
        
    }
}