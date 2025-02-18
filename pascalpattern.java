public class pascalpattern
{
    public static void main(String[] args) 
    {
        int n = 5; 
        for (int i = 0; i < n; i++) 
        {
            if (i == n) continue; 
            int value = 1; 
            for (int a= 1; a <= n - i- 1; a++) 
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++)
            {
                System.out.print(value + " ");
                value = value * (i- j) / (j + 1);
            }
            System.out.println();
        }
    }
}
