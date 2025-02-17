import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class remduparr 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        Set<Integer> set = new HashSet<>();
        
        for (int num : arr) 
        {
            set.add(num);
        }

        int[] a= new int[set.size()];
        int index = 0;
        for (int num : set) 
        {
            a[index++] = num;
        }

        System.out.println("Array without duplicates: " + Arrays.toString(a));
    }
}
