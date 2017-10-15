class Node
{
	private int key;
	private Node next;
	public Node(int key)
	{
		this.key = key;
		this.next = null;
	}
	public int getKey()
	{
		return key;
	}
	public Node getNext()
	{
		return next;
	}
	public Node setKey(int key)
	{
		this.key = key;
		return this;
	}
	public Node setNext(Node next)
	{
		this.next = next;
		return this;
	}

}
