import java.util.Scanner;
import java.util.Arrays;
public class sortmatrix
{
    public static void main(String arg[])
    {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter number of rows:");
        int r= in.nextInt();
        System.out.print("Enter number of col:");
        int c= in.nextInt();
        int [][] Matrix= new int [r][c];
        System.out.print("Enter the elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                Matrix[i][j]=in.nextInt();
            }
        }
        int[] sort = new int[r*c];
        int k=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                sort [k++] = Matrix[i][j];
            }
        }
        Arrays.sort(sort);
        k=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                Matrix[i][j]=sort[k++];
            }
        }
        System.out.println("The Matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(Matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
}








