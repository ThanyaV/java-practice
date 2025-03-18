import java.util.Scanner;
class PalindromeSolution
{
    public boolean isPalindrome(int x)
    {
        if (x<0) {
            return false;
        }
        int rev=0;
        int a=x;
        while (x>0) 
        {
            rev=rev*10+x%10;
            x/=10;
        }
        return a==rev;
    }

    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x=in.nextInt();
        PalindromeSolution solution = new PalindromeSolution();
        System.out.println(solution.isPalindrome(x));
        
    }
}
