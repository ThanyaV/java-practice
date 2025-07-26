import java.util.Scanner;
class no_of_words
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
      String s=in.nextLine();
      String output="";
      int count=0;
      boolean isWord=false;
      for(int i=0;i<s.length();i++)
      {
          char ch=s.charAt(i);
          if(ch!=' ')
          {
              if(!isWord){
                  count++;
                  isWord=true;
              }
          }
          else
          {
              isWord=false;
          }
      }
      System.out.println(count);
    }
    
}