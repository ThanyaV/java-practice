import java.util.Scanner;
class name_roll_from_user
{
    public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = in.nextLine();
        System.out.print("Enter rollno: ");
        int rollno= in.nextInt();
        System.out.println("Name: "+name);
        System.out.println("rollno: "+rollno);
    }
}