import java.util.Scanner;

class quickSort
{
	
	public void sort(int a[],int lb, int ub)
	{
		int loc;
		if(lb<ub)
		{
		loc = partition(a,lb,ub);
		sort(a,lb,loc-1);
		sort(a,loc+1,ub);
		}
	}
	
	public static int partition(int a[],int lb, int ub)
	{
		int start=lb,end=ub,pivot;
		pivot = a[lb];
		while(start<=end)
		{
			while(a[start]<=pivot)
			{
				start++;
			}
			
			while(a[end]>pivot)
			{
				end--;
			}
			
			if(start<end)
			{
				int temp_1;
				temp_1 = a[start];
				a[start]= a[end];
				a[end] = temp_1;
			}
		}
		
		int temp_2;
		temp_2 = a[lb];
		a[lb] = a[end];
		a[end] = temp_2;
		
		return end;
			
	}
	
	public static void printarr(int a[],int n)
	{
		System.out.println("Sorted array is(ascending order): ");
		for(int k=0; k<n; k++)
		{
			System.out.printf("%d ",a[k]);
		}
	}
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n;
		n = sc.nextInt();
		int a [] = new int[n];
		System.out.println("Enter elements: ");
		for(int h=0; h<n; h++)
		{
			a[h] = sc.nextInt();
		}
		
		quickSort obj = new quickSort();
		obj.sort(a,0,n-1);
		printarr(a,n);
	}
}