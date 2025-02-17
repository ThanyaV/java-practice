public class countarr
{
    public static void main(String[] args)
    {
        int[] arr = {3, 3, 5,3,7,5,6}; 
        boolean[] counted = new boolean[arr.length]; 
        for (int i = 0; i < arr.length; i++)
        {
            if (!counted[i]) 
            { 
                int count = 1; 
                for (int j = i + 1; j < arr.length; j++) 
                {
                    if (arr[i] == arr[j])
                    {
                        count++; 
                        counted[j] = true; 
                    }
                }
                System.out.println(arr[i] + " - " + (count ) + ", ");
            }
        }
    }
}
