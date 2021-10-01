package module1;

public class sorting {
    public void quicksort(int A[], int low, int high) {
        if(low<high) {
            int pi = partition(A,low,high);
            quicksort(A,low,pi-1);
            quicksort(A,pi+1,high);
        }
    }

    public int partition(int A[], int low, int high) {
        int pivot = A[low];
        int i = low+1;
        int j = high;
        do {
            while(i <= j && A[i] <= pivot)
                i = i + 1;
            while (i <= j && A[j] > pivot)
                j = j - 1;
            if (i <= j)
                swap(A,i,j);
        } while(i<j);
        swap(A,low,j);
        return j;
    }

    public void swap(int A[], int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public void display(int A[], int n) {
        for(int i=0;i<n;i++)
            System.out.print(A[i] + " ");
        System.out.println();
    }
 
/*	public void merge(int a[] , int l , int m , int r)
	{
		int i=l, j=m+1, k=l;
		int b[]= new int[r+1];
		while(i<=m && j<=r)
		{
			
			if(a[i]> a[j])
				{
				b[k] = a[i];
				i++;
				k++;
				}
			else
			{
				b[k] = a[j];
				j++;
				k++;
			}
		}
			while(i<=m)
			{
				b[k] = a[i];
				i++;
				k++;	
			}
			while(j<=r)
			{
				b[k] = a[j];
				j++;
				k++;
			}
			
			for(int x=l;x<r+1;x++)
			{
				a[x]=b[x];
			}
			
	}
	public void merges(int a[] , int l , int r)
	{
		if(r > l)
		{
			int m = (l+r)/2;
			merges(a , l , m);
			merges(a , m+1 , r);
			merge(a , l , m , r);
		}
	}*/
	public static void main(String[] args) {
	
		int a[]= {3,9,0,8,2,6,5,4,4,4,15};
		//Insertion Sort
		/*
		for(int i=1;i<a.length;i++)
		{
			int key = a[i];
			int j=i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
		a[j+1]=key;
		}
		*/
		//Selection Sort
		/*
		for(int i=0;i<a.length-1;i++)
		{
			int p=i;
			for(int j=i+1;j< a.length;j++)
			{
				if(a[j] < a[p])
					p=j;
			}
			a[i] = a[i] + a[p];
			a[p] = a[i] - a[p];
			a[i] = a[i] - a[p];
		}*/
		sorting ob = new sorting();
		ob.quicksort(a, 0, 10);
		for(int i=0;i<a.length;i++)
		System.out.print(a[i] + " ");
		
	}

}

