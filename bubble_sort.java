import java.util.Scanner;

class bubble_sort
{
	class Node
	{
		int data;
		Node next;
	}
	Node head = null;
	Node temp;
	
	void create()
	{
		Node node = new Node();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter data: ");
		node.data = sc1.nextInt();
		
		if(head == null)
		{
			head = node;
			temp = head;
		}
		else
		{
			temp.next = node;
			temp = node;
		}
		temp.next = null;
	}
	
	void sort()
	{
		Node count = head;
		Node ptr1;
		Node ptr2;
		int count_1 = 0;
		
		
		while(count!=null)
		{	
			count = count.next;
			count_1++;
		}
		
		for(int i=0; i<count_1-1; i++)
		{	
			ptr1 = head;
			
			for(int j=0; j<count_1-1-i;j++)
			{
				ptr2 = ptr1.next;
				
				if(ptr1.data>ptr2.data)
				{
					int temp;
					temp = ptr1.data;
					ptr1.data = ptr2.data;
					ptr2.data = temp;
				}
				ptr1 = ptr2;
			}
		}
		ptr1 = head;
		while(ptr1!=null)
		{
			System.out.print(ptr1.data+"--->");
			ptr1 = ptr1.next;
		}
	System.out.println();
	}
	
	
	
	
	void display()
	{
		Node ptr = head;
		while(ptr!=null)
		{
			System.out.print(ptr.data+"--->");
			ptr = ptr.next;
		}
		System.out.println();
		ptr = head;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		bubble_sort obj = new bubble_sort();
		while(choice == 1)
		{
			obj.create();
			System.out.println("Want to enter more?: ");
			choice = sc.nextInt();
		}
		obj.display();
		obj.sort();
		
	}
}