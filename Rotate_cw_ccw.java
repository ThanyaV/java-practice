import java.util.Scanner;
class Rotate_cw_ccw
{
    static void rcw(int m[][])
    {
        int n=m.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            int l=0;
            int r=n-1;
            while(l<r)
            {
                int temp=m[i][l];
                m[i][l]=m[i][r];
                m[i][r]=temp;
                l++;
                r--;
            }
        }
    }
    static void rccw(int m[][])
    {
        int n=m.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
            }
        }
        for(int j=0;j<n;j++)
        {
            int t=0;
            int b=n-1;
            while(t<b)
            {
                int temp=m[t][j];
                m[t][j]=m[b][j];
                m[b][j]=temp;
                t++;
                b--;
            }
        }
    }
    static void print(int m[][])
    {
        int n=m.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int row=in.nextInt();
        System.out.print("Enter the number of cols : ");
        int cols=in.nextInt();
        int m[][]=new int[row][cols];
        System.out.println("Enter the elements of the matrix : ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                m[i][j]=in.nextInt();
            }
        }
         System.out.println();
        System.out.println("Original Matrix : ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Rotate clockwise : ");
        rcw(m);
        print(m);
         System.out.println();
        System.out.println("Rotate Counter clockwise : ");
        rccw(m);
        print(m);
    }
}