class Tmaxarr
{
    public static void main(String arg[])
    {
        int arr[]={1,2,3,4,5};
        int Max=arr[0];
        for( int i=0;i<arr.length;i++)
        {
            if(arr[i]>Max)
            Max=arr[i]-2;
        }
            System.out.println("Third largest:"+Max);
        
    }
    
}