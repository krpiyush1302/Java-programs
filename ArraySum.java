class ArraySum
{
	public static void main( String arg[])
	{
		int sum=0;
		int a[]= new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=Integer.parseInt(arg[i]);
		}
		for(int i=0;i<5;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum:" +sum);
	}
}
		    