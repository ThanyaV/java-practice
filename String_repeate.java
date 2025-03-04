import java.util.Scanner;
class String_repeate
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the String = ");
		String str=in.nextLine();
		StringBuilder result = new StringBuilder();
		for (int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if (Character.isDigit(ch))
			{
				int repeatCount = Character.getNumericValue(ch);
				if (i-1>= 0)
				{
					result.append(String.valueOf(str.charAt(i- 1)).repeat(repeatCount- 1));
				}
			}
			else
			{
				result.append(ch);
			}
		}
		System.out.println(result.toString());
	}
}