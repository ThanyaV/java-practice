import java.util.Scanner;

public class Insert_position
{
    public int searchInsert(int[] nums, int target)
    {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) 
            {
                return mid;
            } 
            else if (nums[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args)
    {
        Insert_position obj= new Insert_position();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = in.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array in sorted order:");
        for (int i = 0; i < n; i++) 
        {
            nums[i] = in.nextInt();
        }

        System.out.println("Enter the target value:");
        int target = in.nextInt();

        int result = obj.searchInsert(nums, target);
        System.out.println("Result: " + result);
    }
}