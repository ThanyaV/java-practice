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
public class QueueTwosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue q=new Queue(5);
q.enqueue(1);
q.enqueue(2);
q.enqueue(3);
q.enqueue(4);
q.enqueue(5);
Queue q1=new Queue(5);
q1.enqueue(8);
q1.enqueue(4);
q1.enqueue(8);
q1.enqueue(12);
q1.enqueue(4);
Queue output=new Queue(5);
while(!q.isEmpty()&&!q1.isEmpty())
{
	int v1=q.poll();
	int v2=q1.poll();
	int k=9;
	if(v1+v2==k)
	{
		output.enqueue(v1);
		output.enqueue(v2);
	}
	
}

output.display();
	}

}
