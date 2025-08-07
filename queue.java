package collections;

public class Queue {
private int[] queue;
private int front, rear, maxSize;
public Queue(int size)
{
	maxSize=size;
	queue=new int[maxSize];
	front=-1;
	rear=-1;
}

public boolean isEmpty()
{
	return front==-1||front>rear;
	
}
public boolean isFull()
{
	return rear==maxSize-1;
}
public void enqueue (int data)
{
	if(isFull())
	{
		System.out.println("Queue is Full");
		return;
	}
	if(front==-1)
	{
		front =0;
	}
	queue[++rear]=data;
}
public int dequeue()
{
	if(isEmpty())
	{
		System.out.println("Queue is empty");
		return -1;
	}
	int value=queue[front];
	if(front==rear)
	{
		front=-1;
		rear=-1;
	}
	else
	{
		front++;
	}
	return value;
}
public int poll()
{
	return dequeue();
}
public int element()
{
	if(isEmpty())
	{
		System.out.println("Queue is Empty");
		return -1;
	}
	return queue[front];
}

public void display()
{
	if(isEmpty())
	{
		System.out.println("Queue is Empty");
		return;
	}
	for(int i=front;i<=rear;i++)
	{
		System.out.print(queue[i]+" ");
	}
	System.out.println();
}
}
public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue q=new Queue(4);
q.enqueue(2);
q.enqueue(7);
q.enqueue(4);
q.enqueue(9);
q.enqueue(8);
Queue q1=new Queue(5);
q1.enqueue(3);
q1.enqueue(6);
q1.enqueue(5);
q1.enqueue(2);
q1.enqueue(10);
int k=11;
Queue output=new Queue(5);
while(!q.isEmpty()&&!q1.isEmpty())
{
	int v1=q.poll();
	int v2=q1.poll();
	
	if(v1%2==0)
	{
		output.enqueue(v1+v2);
		
	}
	else
	{
		output.enqueue(v1-v2);
	}
	
}
if(!q.isEmpty())
{
	while(!q.isEmpty()) {
		output.enqueue(q.dequeue());
	}
}
else
{
	while(!q1.isEmpty())
	{
		output.enqueue(q1.dequeue());
	}
}
output.display();
	}

}
