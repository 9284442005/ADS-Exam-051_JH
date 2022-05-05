//Q1: Sorting

class Sorting
{
	void insertionSort(int a1[],int n)
	{
		int m = a1[n-1];
		for(int i=n-1;i>0;i--)
		{
			if(a1[i-1]>m)
			{
				a1[i] = a1[i-1];
			}
			else
			{
				a1[i] = m;
			}
			for(int j=0;j<n;j++)
			{
				System.out.print(a1[j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args)
	{
		Sorting s1 = new Sorting();
	    int a1[] = {2,4,6,8,3};
		s1.insertionSort(a1,5);
		
	}
}