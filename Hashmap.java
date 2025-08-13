package problem;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,Integer> map=new HashMap<>();
map.put("College", 7207);
map.put("College",2377);
map.put("HiCET",7202);
System.out.println(map);
System.out.println(map.get("HiCET"));//key should be given not the value
System.out.println(map.containsKey("College"));
System.out.println(map.getOrDefault("College", 12345));
//find the missing num in the series
int[] nums= {4,3,2,7,8,3,1};
HashMap<Integer,Boolean>i=new HashMap<>();
List<Integer> l=new ArrayList<>();
for(int num:nums)
{
	i.put(num, true);
}
for(int j=1;j<=nums.length;j++)
{
	if(!i.containsKey(j))
	{
		l.add(j);
	}
}
System.out.println(l);

//count the number of letters in string
String str="success";
HashMap<Character,Integer>s=new HashMap<>();
for(char c:str.toCharArray())
{
	s.put(c,s.getOrDefault(c, 0)+1);
}
for(char c:s.keySet())
{
	System.out.println(c+"-"+s.get(c)+" ");
}
	}

}
