package problem;
import java.util.ArrayList;
public class ArrayLists {
public static void main(String[] args)
{
	ArrayList<String>list=new ArrayList<>();
	list.add("CSE");
	list.add("IT");
	list.add("ECE");
	list.add("Mech");
	list.add("AIML");
	System.out.println(list);
	System.out.println(list.get(2));
	list.set(1, "Aero");
	System.out.println(list);
	//if length of string is even remove that element
	/*for(String s:list)
	{
		if(s.length()%2==0)
		{
			list.remove(s);
		}
	}
	System.out.println(list);*/
	list.removeIf(lists->lists.length()%2==0);
	System.out.println(list);
}
}
