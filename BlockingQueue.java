

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue 
{
private List<Object> Queue=new LinkedList<Object>();
private int limit=10;
public BlockingQueue(int size)
{
	this.limit=size;
}
public synchronized void enqueue(Object item) throws Exception
{
	while(this.Queue.size()==limit)
	{
		wait();
	}
	this.Queue.add(item);
}
public synchronized Object dequeue() throws Exception
{
	while(this.Queue.size()==0)
	{
		wait();
	}
	return this.Queue.remove(0);

}
public synchronized int size()
{
	return this.Queue.size();
}

}
