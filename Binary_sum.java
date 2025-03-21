import java.util.Scanner;

public class Binary_sum
{
    public String add(String a,String b) 
    {
        StringBuilder result=new StringBuilder();
        int i=a.length()- 1;
        int j=b.length()- 1;
        int carry=0;

        while(i>=0||j>=0) 
        {
            int sum=carry;
            if(i>=0)sum+=a.charAt(i--)-'0';
            if(j>=0)sum+=b.charAt(j--)-'0';

            result.append(sum%2);
            carry=sum/2;
        }

        if(carry!=0)result.append(carry);

        return result.reverse().toString();
    }

    public static void main(String[] args)
    {
        Binary_sum obj=new Binary_sum();
        Scanner in=new Scanner(System.in);

        System.out.print("Enter the first binary number: ");
        String a=in.next();
        System.out.println();
        System.out.print("Enter the second binary number: ");
        String b=in.next();
        System.out.println();
        System.out.println("Result: "+obj.add(a, b));
    }
}
