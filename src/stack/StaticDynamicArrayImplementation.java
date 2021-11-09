
package stack;

public class StaticDynamicArrayImplementation {
	private int[] object;
	private int top;
	private int stackSize = 4;
	StaticDynamicArrayImplementation()
	{
		stackSize = 1;
		top = -1;
		object = new int[stackSize];
	}
	public int isEmpty()
	{
		if(top == -1)
		{
			System.out.println("stack is empty");
		}
		return 0;
	}
	public int isFull()
	{
		if(top == stackSize -1)
		{
			System.out.println("stack is full");
		}
		return 0;
	}
	public int pop()
	{
		return object[top];
	}
	public void push(int item)
	{
		if(top >= stackSize -1)
			resize();
		object[++top]= item;
	}
	
	private void resize() {
		int[] temp = object;
		stackSize = stackSize *2;
		object = new int[stackSize];
		for(int i = 0;i <= top;i++)
		{
			object[i]= temp[i];
		}
		
	}
	public static void main(String[] args) {
		StaticDynamicArrayImplementation st = new StaticDynamicArrayImplementation();
		st.push(34);st.push(787);
		st.push(787);st.push(34);
		st.push(787);st.push(34);
		st.push(787);st.push(12);
		System.out.println(st.pop());
		System.out.println(st.stackSize);
			
			
		
		}
	}


