
public class Stack {

	private Node top;
	
	public Stack()
	{
		top = null;
	}
	
	public void push(char v)
	{
		Node temp = new Node();
		temp.setValue(v);
		temp.setNext(top);
		top = temp;
	}
	
	public char peek()
	{
		return top.getValue();
	}
	
	public char pop()
	{
		char temp = top.getValue();
		top = top.getNext();
		return temp;
	}
	
	public boolean isEmpty()
	{
		return(top == null);
	}
	
	public void makeEmpty()
	{
		top = null;
	}
}
