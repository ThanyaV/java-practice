import java.util.Scanner;
class find_First_Last_position_ofint 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the no. of elements in array : ");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.print("Enter the elements of the array : ");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Enter target value : ");
        int target=in.nextInt();
        int fp=findfp(a,target);
        int sp=findsp(a,target);
        System.out.print("position : "+fp+" "+sp);
    }
    static int findfp(int a[],int target)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    static int findsp(int a[],int target)
    {
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]==target)
            {
                return i ;
            }
        }
        return -1;
    }    
}
