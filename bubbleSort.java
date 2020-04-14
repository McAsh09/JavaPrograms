import java.util.Scanner;

class bubbleSort
{
	public static void main(String[] args)
	{	
		int array_size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		array_size = sc.nextInt();
		int arr[] = new int[array_size];
		System.out.println("Enter elements: ");
		for(int y=0; y<array_size; y++)
		{
			arr[y]=sc.nextInt();
		}
		
		for(int i=0; i<array_size-1; i++)
		{	
			int flag = 0;
			for(int j=0; j<array_size-1-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = 1;
				}
			}
			if(flag == 0)
			break;
		}
		
		System.out.println("Sorted array is(ascending order): ");
		for(int k=0; k<array_size; k++)
		{
			System.out.printf("%d ",arr[k]);
		}
		
	}
}