
public class Node {

	private char value;
	private Node next;
	
	public void setValue(char v)
	{
		value = v;
	}
	
	public char getValue()
	{
		return value;
	}
	
	public void setNext(Node n)
	{
		next = n;
	}
	
	public Node getNext()
	{
		return next;
	}
}
