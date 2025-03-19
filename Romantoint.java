import java.util.Scanner;

public class Romantoint
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral : ");
        String rom = scanner.nextLine().toUpperCase();

        int integer = 0;
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < values.length; i++) 
        {
            while (rom.indexOf(roman[i]) == 0)
            {
                integer += values[i];
                rom = rom.substring(roman[i].length());
            }
        }
        System.out.println();
        System.out.println("Integer value: " + integer);
    }
}
