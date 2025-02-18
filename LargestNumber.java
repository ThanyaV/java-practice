public class LargestNumber
{
    public static void main(String[] args) 
    {
        int[] arr = {9,6,10};  
        int n = arr.length;
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                int num1 = arr[i] * 10 + arr[j];  
                int num2 = arr[j] * 10 + arr[i];  
                if (num2 > num1) 
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++) 
        {
            result = result * 10 + arr[i];
        }
        System.out.println("Maximum number:"+result);
    }
}
