public class BitSwap
{
    public static int swapBits(int n,int i,int j) 
    {
        int bitI=(n>>i)&1;
        int bitJ=(n>>j)&1;
        if (bitI!=bitJ) 
        {
            n=n^(1<<i); 
            n=n^(1<<j); 
        }
        return n;
    }
    public static void main(String args[])
    {
        int n=12; 
        int i=1;  
        int j=3;  
        System.out.println("Original number: "+n);
        System.out.println("Binary representation: "+ Integer.toBinaryString(n));
        int swappedNumber=swapBits(n,i,j);
        System.out.println("Number after swapping bits: "+swappedNumber);
        System.out.println("Binary representation: "+Integer.toBinaryString(swappedNumber));
    }
}
