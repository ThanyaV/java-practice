import java.util.Scanner;
class Letterfrequency
{
   public static void main(String[] args)
   {
    Scanner in =new Scanner(System.in);
     System.out.print("Enter String : ");
     String s = in.nextLine();
     int[] f = new int[s.length()];
     int i, j;
     char string[] = s.toCharArray();
     for(i = 0; i <s.length(); i++)
     {
        f[i] = 1;
          for(j = i+1; j <s.length(); j++)
          {
            if(string[i] == string[j])
            {
            f[i]++;
            string[j] = '0';
          }
       }
    }
    System.out.print("Frequency of a String : ");
    for(i = 0; i <f.length; i++)
    {
       if(string[i] != ' ' && string[i] != '0')
          System.out.println(string[i] + "-" + f[i]);
       }
   }
}