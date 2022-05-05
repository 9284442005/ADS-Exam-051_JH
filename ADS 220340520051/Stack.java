// Q3:Java program to implement two stacks in a single array.
class Stack
{
	int arr[];
	int size;
	int top1;
	int top2;
	
	Stack(int n)
	{
		size = n;
		arr = new int[n];
		top1 = -1;
		top2 = size;
	}
	void push1(int x)
	{
		if(top1 < top2-1)
		{
			top1++;
			arr[top1] = x;
		}
		else
		{
			System.out.println("Stack is overflow");
			return;
		}
	}
	int pop1()
	{
		if(top1 >= 0)
		{
			int x = arr[top1];
			top1--;
			return x;
		}
		else
		{
			System.out.println("Stack Underflow");
			
		}
		return 0;
	}
	void push2(int x)
	{
		if(top1 < top2-1)
		{
			top2--;
			arr[top2] = x;
		}
		else
		{
			System.out.println("Stack is overflow");
			return;
		}
		
	}
	int pop2()
	{
		if(top2 < size)
		{
			int x = arr[top2];
			top2++;
			return x;
		}
		else
		{
			System.out.println("Stack is underflow");
			
		}
		return 0;
		
	}
	
	public static void main(String[] args)
	{
		Stack st = new Stack(5);
		
		st.push1(5);
		st.push2(10);
		st.push2(15);
		st.push1(11);
		st.push2(7);
		
		System.out.println("Popped element from stack1 is "+st.pop1());
		st.push2(40);
		System.out.println("Popped element from stack2 is "+st.pop2());
		
	}
}