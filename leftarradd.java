public class leftarradd 
{

    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};

        int[] result = addArrays(a, b);

        for (int i = 0; i < result.length; i++) 
        {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] addArrays(int[] a, int[] b)
    {
        int[] sumArray = new int[a.length];

        for (int i = 0; i < a.length; i++) 
        {
            sumArray[i] = a[i] + b[i];
        }

        return sumArray;
    }
}
