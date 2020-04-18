import java.util.Scanner;

class l_List
{
	public class Node
	{
		int data;
		Node next;
	}
	Node head = null;
	Node temp;
	Node ptr2;
	void create()
	{
		Scanner sc = new Scanner(System.in);
		Node node = new Node();
		System.out.println("Enter data: ");		
		node.data = sc.nextInt();
		
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
	
	void delete()
	{	
		Scanner sc2 = new Scanner(System.in);
		int delete_data;
		Node ptr1 = head;
		ptr2 = head;
		
		System.out.println("Enter data to delete: ");
		delete_data = sc2.nextInt();
		while(ptr1.data != delete_data)
		{
			ptr1 = ptr1.next;
			if(ptr1.data != delete_data)
			{
				ptr2 = ptr2.next;
			}
		}
		
		ptr2.next = ptr1.next;
		
		
		
	}
	
	void display()
	{
		Node ptr = head;
		while(ptr!=null)
		{
			System.out.print(ptr.data+ "----->");
			ptr = ptr.next;
		}
		System.out.println();
	}
	
	
	public static void main(String args[])
	{	
		Scanner sc1 = new Scanner(System.in);
		int choice = 1,choice_1;
		l_List obj = new l_List();
		obj.create();
		while(choice == 1)
		{
		
		System.out.println("Want to enter more? ");
		choice = sc1.nextInt();
		if(choice == 1)
		{
		obj.create();
		}
		
		}
		obj.display();
		
		System.out.println("Want to delete an element?: ");
		choice_1 = sc1.nextInt();
		
		do
		{
			obj.delete();
			obj.display();
			System.out.println("Want to delete an element?: ");
			choice_1 = sc1.nextInt();
			
		}
		while(choice_1 == 1);
	
		
		
		
		
	}
}