
package stack;

public class StaticDynamicArrayImplementation {
	private int top;
	private int capacity;
	private int[] stack;
	StaticDynamicArrayImplementation()
	{
		top = -1;
		capacity = 10;
		stack = new int[capacity];
	}
	public boolean isEmpty()
	{
		return top == -1;
	}
	public boolean isFull() 
	{
		return top == capacity-1;
	}
	public int push(int data)
	{
		if(isFull()) 
		{
			System.out.println("Stack is Full");
			
		}
		return stack[++top]=data;
		
	}
	public int pop()
	{
		if(isEmpty()) 
		{
			System.out.println("stack is empty");
		}
		return stack[top--];
	}
	public int peek()
	{
		return stack[top];
	}
	public static void main(String[] args) {
		StaticDynamicArrayImplementation st = new StaticDynamicArrayImplementation();
		st.push(34);st.push(108);
		st.push(01);st.push(92);
		st.push(37);st.push(22);
		System.out.println(st.isEmpty());
		System.out.println(st.isFull());
		System.out.println(st.peek());
		System.out.println(st.pop());	
		}
	}
	

	
	


