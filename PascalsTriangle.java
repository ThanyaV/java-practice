public class PascalsTriangle
{
    public static void main(String[] args) 
    {
        int n = 5; 
        
        for (int row = 0; row < n; row++) 
        {
            if (row == n) continue; 
            
            int value = 1; 

            for (int space = 1; space <= n - row - 1; space++) 
            {
                System.out.print(" ");
            }

            for (int col = 0; col <= row; col++)
            {
                System.out.print(value + " ");

                value = value * (row - col) / (col + 1);
            }

            System.out.println();
        }
    }
}
