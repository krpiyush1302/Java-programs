class SortArray1
{
	public static void main( String arg[])
	{
		int arr[]=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=Integer.parseInt(arg[i]);
		}
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4-i;j++)
			{
				if(arr[j]>arr[j+i]);
				{	
					int temp=arr[j];
					arr[j]=arr[j+i];
					arr[j+i]=temp;
				}
			}
		}
		System.out.println("Array after sorting:");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]+ " ");
		}
	}
}

