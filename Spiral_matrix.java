import java.util.Scanner;
class Spiral_matrix
{
    static void spiral(int m[][])
    {
        int x=m.length, y=m[0].length;
        int t=0;
        int b=x-1;
        int l=0;
        int r=y-1;
        while(t<=b&&l<=r)
        {
            for(int i=l;i<=r;i++)
            {
                System.out.print(m[t][i]+" ");
            }
            t++;
            for(int i=t;i<=b;i++)
            {
                System.out.print(m[i][r]+" ");
            }
            r--;
            if(t<=b)
            {
                for(int i=r;i>=l;i--)
                {
                    System.out.print(m[b][i]+" ");
                }
                b--;
            }
            if(l<=r)
            {
                for(int i=b;i>=t;i--)
                {
                    System.out.print(m[i][l]+" ");
                }
                l++;
            }
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
        System.out.println("Original Matrix : ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Spiral order : ");
        spiral(m);
    }
}
    
