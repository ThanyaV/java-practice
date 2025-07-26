import java.util.Scanner;
class removevowels
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
      String s=in.nextLine();
      String output="";
      for(char ch:s.toCharArray())
      {
          if("aeiouAEIOU".indexOf(ch)==-1)
          {
              output+=ch;
          }
      }
      System.out.println(output);
     
    }
    
}