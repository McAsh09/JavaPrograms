import java.util.Scanner;

public class mergeSortNew
{

	static void merge(int a[],int lb,int mid,int ub)
	{
		  int i=(mid-lb)+1;
		  int j=ub-mid;
		  
		  int left[] = new int[i];
		  int right[] = new int[j];
		  
		  int h,l;
		  for(h=0;h<i;h++)
		  {
			  left[h]=a[lb+h];
		  }
		  for(l=0;l<j;l++)
		  {
			  right[l]=a[mid+l+1];
		  }
		  
//		  int start=0;
//		  int end=0;
		  h=0;
		  l=0;
		  int k=lb;
		  while(h<i&&l<j)
		  {
			  if(left[h]<=right[l])
			  {
				  a[k]=left[h];
				  h++;
			  }
			  else
			  {
				  a[k]=right[l];
				  l++;
			  }
			  k++;
		  }
		  
		  while (h < i)
		  	{
		        a[k] = left[h];
		        h++;
		        k++;
		    }
		  
		  while (l < j) 
		  	{
	            a[k] = right[l];
	            l++;
	            k++;
	        }
			   
	}
	
	static void mergesort(int a[],int lb,int ub)
	{
		int start=lb;
		int end=ub;
		
		if(start<end)
		{
			int mid;
			mid=(start+end)/2;
			
			mergesort(a,lb,mid);
			mergesort(a,mid+1,ub);
			merge(a,lb,mid,ub);
		}
		
	
	}
	public static void main(String[] args) 
	{

		System.out.println("Enter array size: ");
		int size;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter elements of array: ");
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		mergesort(a,0,size-1);
		System.out.println("Sorted array in mergeSort: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}


	}

}
