public class Arradd
{

    public static void main(String[] args)
    {
        int[] a = {5,1,3};
        int[] b = {9,7,7,7};

        int[] result = addArrays(a, b);

        for (int i = 0; i < result.length; i++) 
        {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] addArrays(int[] a, int[] b) 
    {
        int[] sumArray = new int[a.length];

        int carry = 0;

        for (int i = 0; i < a.length; i++)
        {
            int sum = a[i] + b[i] + carry;  
            sumArray[i] = sum % 10;  
            carry = sum / 10;  
        }

        return sumArray;
    }
}
