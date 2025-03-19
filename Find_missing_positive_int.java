import java.util.Scanner;

public class Find_missing_positive_int
{
    public int firstMissingPositive(int[] nums)
    {
        if (nums.length == 0)
        {
            return 1;
        }

        for (int i = 0; i < nums.length; i++) 
        {
            while (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i])
            {
                swap(nums, i, nums[i] - 1);
            }
        }

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != i + 1)
            {
                return i + 1;
            }
        }

        return nums.length + 1;
    }

    private void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args)
    {
        Find_missing_positive_int solution = new Find_missing_positive_int();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++)
        {
            nums[i] = scanner.nextInt();
        }

        int result = solution.firstMissingPositive(nums);
        System.out.println("The first missing positive integer is: " + result);
    }
}