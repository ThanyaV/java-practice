
import java.util.LinkedList;
import java.util.Collections;
public class List {
public static void main(String[] args) {
	LinkedList<Integer>list=new LinkedList<>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	//find sum
	int sum=0;
	System.out.println(list);
	for(int i:list)
	{
		sum+=i;
		
	}
	System.out.println("Sum of list : "+sum);
	//find second max
	 int max = Integer.MIN_VALUE;
     int secondMax = Integer.MIN_VALUE;
     for (int num : list) 
     {
         if (num > max)
         {
             secondMax = max;
             max = num;
         } 
         else if (num > secondMax && num != max) 
         {
             secondMax = num;
         }
     }
         System.out.println("Second Max element of list : "+secondMax);
         //find avg
        int avg= sum/list.size();
        System.out.println("average : "+avg);
        //if avg<swcond max reverse the list
	if(avg>secondMax)
	{
		System.out.println("Since the avg of list is greater than second element, the list is reversed"+list.reversed());
	}
	else
	{
		System.out.println("as the avg of list is less than the second element, the list is not reversed "+list);
	}
	//if k is in list remove that elements and print the rest if not remove all element feom list
	int k=10;
	if(k==list.element())
	{
		list.remove(list.get(0));
	   System.out.println(list);
	}
	else
	{
		list.removeAll(list);
	}
	//reverse words
	LinkedList<String> s=new LinkedList<>();
	s.add("Better");
	s.add("than");
	s.add("yeterday");
	System.out.println(s+" ");
	System.out.println(s.reversed());
	//take out the even numbers from the list rotate k times and place the rotated elements in the index of the even numbers
	//input =2,5,8,11,14,7 , k=2, op=8,5,14,11,2,7---2,8,14->8,14,2
	LinkedList<Integer> l=new LinkedList<>();
	LinkedList<Integer> l2=new LinkedList<>();
	l.add(2);
	l.add(5);
	l.add(8);
	l.add(11);
	l.add(14);
	l.add(7);
	int x=2;
	System.out.println(l);
	for(int j:l)
	{
		if(j%2==0)
		{
			l2.add(j);
		}
	}
	Collections.rotate(l2, x);
	int index=0;
	for(int i=0;i<l.size();i++)
	{
		if(l.get(i)%2==0)
		{
			l.set(i, l2.get(index++));
		}
	}
	System.out.println(l);
	
	
}
}

