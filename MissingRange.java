class MissingRange
{
    public static void main(String[] args)
    {
        int[] arr = {2, 8, 11, 12, 15, 18};
        MissingRange(arr);
    }
    public static void main(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - 1 - i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void MissingRange(int[] arr)
    {
        int n = arr.length;
       
        for (int i = 0; i < n - 1; i++)
        {
            int a = arr[i];
            int b = arr[i + 1];
            if (b - a > 1) {
                System.out.print("[" + (a + 1) + "-" + (b - 1) + "] ");
            }
        }

        System.out.println();
    }
}