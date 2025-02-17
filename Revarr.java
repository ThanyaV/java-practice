import java.util.*;

public class Revarr {
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = 3;
        
        int[] a = rev(arr, n);
        
        System.out.println(Arrays.toString(a));
    }

    public static int[] rev(int[] arr, int n) 
    {
        int[] result = new int[arr.length];
        
        for (int i = 0; i < arr.length; i += n) 
        {
            int left = i;
            int right = Math.min(i + n - 1, arr.length - 1);
            
            while (left <= right) {
                result[left] = arr[right];
                result[right] = arr[left];
                left++;
                right--;
            }
        }
        
        return result;
    }
}
