import java.util.Scanner;
class Combination_sum
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of candidates : ");
        int n=in.nextInt();
        System.out.println();
        int[] candidates=new int [n];
        System.out.println("Enter the Candidates : ");
        for (int i=0;i<n;i++)
        {
            candidates [i]=in.nextInt();
        }
        System.out.println();
        System.out.print("Enter the target : ");
        int target=in.nextInt();
        System.out.println();
        System.out.println("Combinations : ");
        System.out.println();
        sum(candidates,target,0,0,"");
        
        
        
    }
    public static void sum(int[] candidates, int target,int start,int sum,String combinations)
    {
        
        if (sum==target)
        {
            System.out.println(combinations);
            return;
        }
        for(int i=start;i<candidates.length;i++)
        {
            if(sum+candidates[i]<=target)
            {
                sum(candidates,target,i,sum+candidates[i],combinations+candidates[i]+" ");
            }
        }
    }
   
}