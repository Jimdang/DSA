
public class InfixToPostFix {

	private static Stack stack = new Stack();

	public InfixToPostFix()
	{

	}

	public static String convertToPostfix(String infix)
	{
		String postfix = "";
		char c;
		int index = 0;

		while(index < infix.length()) 
		{
			c = infix.charAt(index);
			if(c == '(') 
			{
				try 
				{
					stack.push(c);
				}
				catch(IndexOutOfBoundsException e) 
				{
					System.out.println("ERROR: List is Empty");
				}
			}

			else if(c == ')') 
			{
				try 
				{
					while(!(stack.peek() == '(') && stack.toString().length() > 1)
					
					{
						if(c == '+' || c == '-' || c == '*' || c == '/' || c == '^')
						{	
							postfix += stack.pop();
						}
					}
					if(c == '(')
					{
						stack.pop();
					}
				}
				catch(NullPointerException e)
				{
					System.out.println("ERROR: List is empty");
				}	
			}
			else if(c == '+' || c == '-' || c == '*' || c == '/' || c == '^') 
			{
				while(!(stack.isEmpty()) && isLowerOrder(c) <= isLowerOrder(stack.peek()) && c != '(') 
				{
					stack.pop();
					postfix += c;
				}
				
			}
			index++;
		}
		
		return postfix;

	}

	private static int isLowerOrder(char op)
	{
		switch(op)
		{
		case '+' :
		case '-' :
			return 1;	//highest order

		case '*' :
		case '/' :
			return 2;	//Second highest order

		case '^' :
			return 3;	//Lowest order

		default :
			return -1;	//
		}
	}

}
