import java.util.Scanner;

public class Remove_element
{
    public int removeElement(int[] nums, int val)
    {
        int k = 0; 

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != val) 
            {
                nums[k++] = nums[i];
            }
        }

        return k;
    }

    public static void main(String[] args) 
    {
        Remove_element solution = new Remove_element();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++)
        {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Enter the value to remove:");
        int val = scanner.nextInt();

        int result = solution.removeElement(nums, val);
        System.out.println("Result: " + result);
    }
}