import java.util.*;

public class Lexicograph
{
    public static String[] l(String S, int K) 
    {
        List<String> substrings = new ArrayList<>();
        for (int i = 0; i <= S.length() - K; i++) 
        {
            substrings.add(S.substring(i, i + K));
        }
        Collections.sort(substrings);
     return new String[]{substrings.get(0), substrings.get(substrings.size() - 1)};
    }
    public static void main(String[] args)
    {
        System.out.print("Lexicograph of the string HACKER with length 3 : ");
        System.out.println(String.join(" ", l("hacker", 3))); 
    }
}
