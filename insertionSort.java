import java.util.Scanner;

class insertionSort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,temp,j;
		System.out.println("Enter array size: ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements: ");
		for(int y=0; y<n; y++)
		{
			arr[y] = sc.nextInt();
		}
		
		for(int i=1; i<n; i++)
		{
			temp = arr[i];
			j = i-1;
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		
		System.out.println("Sorted array is(ascending order): ");
		for(int k=0; k<n; k++)
		{
			System.out.printf("%d ",arr[k]);
			
		}
		
	} 
}