import java.util.Scanner;
class diagonalmat
{
    public static void main(String args[])
    {
        int[][] a={{1,2,3},
                   {4,5,6},
                   {7,8,9}
            
        };
        int m=a.length;
        int n=a[0].length;
        int ele=m*n;
        int[] result=new int[ele];
        int i=0;
        int row=0;
        int col=0;
        boolean isup=true;
        while(i<ele)
        {
            result[i++]=a[row][col];
            if(isup)
            {
              if(col==n-1)
              {
                row++;
                isup=false;
              }
              else if(row==0)
              {
                col++;
                isup=false;
              }
              else
              {
                 row--;
                 col++;
              }
            }
            else{
                if(row==m-1)
                {
                    col++;
                    isup=true;
                }
                else if(col==0)
                {
                  row++;
                  isup=true;
                }
                else
                {
                    row++;
                    col--;
                }
            }
        }
       for(int num:result)
       {
           System.out.println(num+" ");
       }
    }
    
}