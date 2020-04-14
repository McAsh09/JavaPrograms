import java.util.Scanner;

class selectionSort
{
	 public static void main(String args[])
	 {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter size of array: ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements: ");
		for(int y=0; y<n; y++)
		{
			arr[y] = sc.nextInt();
		}
		
		for(int i=0; i<n-1; i++)
		{
			int min = i;
			
			for(int j=i+1; j<n; j++)
			{
				if(arr[j]<arr[min])
				{
					min = j;
				}
			}
			if(min!=i)
			{
				int temp;
				temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
		System.out.println("Sorted array is(ascending order): ");
		for(int k=0; k<n; k++)
		{
			System.out.printf("%d ",arr[k]);
		}
	 }
}