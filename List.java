public class List
{
	private Node head;
	
	public List()
	{
		head = null;
	}
	/*
	public void disp()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.getKey());
			temp = temp.getNext();
		}
	}
	*/
	private void dispRec(Node temp)
	{
		if(temp != null)
		{
			System.out.println(temp.getKey());
			dispRec(temp.getNext());
		}
	}
	public void disp()
	{
		dispRec(head);
	}

	public void addAtEnd(int key)
	{
		Node t = new Node(key);
		if(head == null)
		{
			head = t;
		}
		else
		{
			Node last = head;
			Node temp = last.getNext();
			while( temp != null)
			{
				last = temp;
				temp = last.getNext();
			}
			last.setNext(t);
		}
	}
	private int getLengthRec(Node temp)
	{
		if(temp == null)
		{
			return 0;
		}
		else
		{
			return 1 + getLengthRec(temp.getNext());
		}
	}
	public int getLength()
	{
	/*
		Node temp = head;
		int i = 0;
		while(temp != null)
		{
			i++;
			temp = temp.getNext();
		}
		return i;
	*/
		return getLengthRec(head);
	}
	private int biggestRec(Node temp, int max)
	{
		Node next = temp.getNext();
		if(next == null)
		{
			return max;
		}
		else
		{
			int val = temp.getKey();
			max = (val > max)? val : max;
			return biggestRec(temp.getNext(), max);
		}
	}
	// list has at least one element
	public int biggest()
	{
		return biggestRec(head, head.getKey());
	}
}




