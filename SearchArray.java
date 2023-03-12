class SearchArray
{
	public static void main( String arg[])
	{
		int a[]= new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=Integer.parseInt(arg[i]);
		}
		int greatest=a[0];
		for(int i=0;i<5;i++)
		{
			if(a[i]>greatest)
			{
				greatest=a[i];
			}
		}
		System.out.println("Greatest value:" +greatest);
	}
}