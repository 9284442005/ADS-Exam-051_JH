//Q.2
class LinkedList
{
	Node head;
	
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	void insert(int data)
	{
		Node n = new Node(data);
		if(head == null)
		{
			head = n;
			return;
		}
		Node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = n;
		
	}
	Node reverse(Node head)
	{
		Node prev = null;
		Node temp = head;
		Node next = null;
		
		while(temp != null)
		{
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
		}
		head = prev;
		return head;
	}
	void display(Node head)
	{
		if(head == null)
		{
			System.out.println("Liked list is Empty");
			return;
		}
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
		
		ll.insert(1);
		ll.insert(5);
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		Node head = ll.reverse(ll.head);
		ll.display(head);
		
	}
}