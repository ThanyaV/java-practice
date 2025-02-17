public class ConsecutiveOnes 
{
    public static void main(String[] args) 
    {
    
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};

       
        int max = con(arr);
        
        System.out.println("Maximum consecutive 1's: " + max);
    }

    public static int con(int[] arr)
    {
        int c = 0;  
        int p = 0;  
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == 1)
            {
                p++; 
               c = Math.max(c, p);
            } 
            else 
            {
                p = 0;  
            }
        }
        
        return p;
    }
}