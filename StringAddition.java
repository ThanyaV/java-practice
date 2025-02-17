public class StringAddition 
{
    public static void main(String[] args)
    {
        
        String strA = "9,8,7,6,5,4,3,2,1";
        String strB = "9,8,7,6,5,4,3,2,1";

        
        for (int i = 0; i < strA.length(); i++) 
        {
            
            int digitA = strA.charAt(i) -'0';
            int digitB = strB.charAt(i) -'0';

            int sum = digitA + digitB;

            System.out.println(sum);
        }
    }
}