import java.util.HashMap;
import java.util.Map;

public class Letterfrequency
{
    public static void main(String[] args) 
    {
        String input = "hello world";
        
        input = input.replace(" ", "").toLowerCase();
        
        Map<Character, Integer> letterCount = new HashMap<>();
        
        for (char letter : input.toCharArray()) 
        {
            letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1);
        }
        
        for (Map.Entry<Character, Integer> entry : letterCount.entrySet())
        {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
