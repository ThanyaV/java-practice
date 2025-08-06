public class stack 
{
private int[] stack;
private int top;
private int maxSize;
public stack(int size)
{
	stack=new int[size];
	maxSize=size;
	top=-1;
}
public void push(int data)
{
	if(isFull())
	{
		System.out.println("Stack Overflow");
		return;
	}
	stack[++top]=data;
}
public int pop()
{
	if(isEmpty())
	{
		System.out.println("Stack UnderFlow");
		return top;
	}
	return stack[top--];
}
public int peek()
{
	if(isEmpty())
	{
		System.out.println("Stack is Empty");
		return -1;
	}
	return stack[top];
}
public void display()
{
	if(isEmpty())
	{
		System.out.println("Stack is Empty");
	}
	for(int i=top;i>=0;i--)
	{
		System.out.print(stack[i]+" ");
	}
}
public boolean isFull()
{
	return top==maxSize-1;
}
public boolean isEmpty()
{
	return top==-1;
}
}
public class StackMain {

	public static void main(String[] args) {
		stack output=new stack(10);
		stack output2=new stack(10);
stack s1=new stack(5);
s1.push(2);
s1.push(4);
s1.push(6);
s1.push(8);
s1.push(10);
System.out.println("Stack 1");
s1.display();
System.out.println();
stack s2=new stack(5);
s2.push(1);
s2.push(3);
s2.push(5);
s2.push(7);
s2.push(9);
System.out.println("Stack 2");
s2.display();
while(!s1.isEmpty()&&!s2.isEmpty())
{
	int v1=s1.pop();
	int v2=s2.pop();
	output.push(v1);
	output.push(v2);
}
System.out.println();
System.out.println("Sorted Stack");

output.display();
while(!output.isEmpty())
{
	output2.push(output.pop());
}
System.out.println();
output2.display();

	}

}