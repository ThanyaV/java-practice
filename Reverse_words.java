import java.util.Scanner;
class Reverse_words
{
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String a=in.nextLine();
        a=a.replaceAll("\\s+"," ").trim();
        String[] w = a.split(" ");
        StringBuilder reverse=new StringBuilder();
        for(int i=w.length-1;i>=0;i--)
        {
            reverse.append(w[i]).append(" ");
        }
        System.out.println("The reversed Sentence : "+reverse.toString().trim());
        
    }
}