import java.util.Scanner;
class Bubble
{
    static void sort()
    {
        int a[]={4,7,3,5};
        int temp,n=a.length;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            
            {
                if(a[j]<a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for (int i=0;i<n;i++)
        System.out.println("Sorted array = "+a[i]);
    }
    public static void main(String arg[])
    {
        Bubble.sort();
    }
}