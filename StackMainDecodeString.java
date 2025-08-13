package collections;

import java.util.Stack;
public class StackMain {
    public static void main(String[] args) {
    	//input="3[a]2[bc]" op=aaabcbc
        String input = "3[a]2[bc]";
        String output = decode(input);
        System.out.println(output);  
    }

    public static String decode(String s) {
        Stack<Integer> i = new Stack<>();
        Stack<StringBuilder> string = new Stack<>();
        StringBuilder current = new StringBuilder();
        int num = 0;

        for (char c : s.toCharArray()) 
        {
            if (Character.isDigit(c))
            {
                num = num * 10 + (c - '0');
            } 
            else if (c == '[') 
            {
                i.push(num);
                string.push(current);
                current = new StringBuilder();
                num = 0;
            }
            else if (c == ']')
            {
                int repeat = i.pop();
                StringBuilder prev = string.pop();
                for (int j = 0; j< repeat; j++)
                {
                    prev.append(current);
                }
                current = prev;
            } 
            else
            {
                current.append(c);
            }
        }

        return current.toString();
    }
}
