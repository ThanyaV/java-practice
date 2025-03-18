import java.util.Scanner;
class Lengthofsubstring
 {
    static int lengthOfLongestSubstring(String s) 
    {
        int n=s.length();
        int a=0;
        int[] index=new int[500];
        int i=0;
        for(int j=0;j<n;j++)
        {
            
                i=Math.max(i,index[s.charAt(j)]);
                a=Math.max(a,j-i+1);
                index[s.charAt(j)]=j+1;
        }
        return a;
    
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("s = ");
        String s=in.nextLine();
        System.out.println("length = "+lengthOfLongestSubstring(s));
    }
}