class Prime
{
	public static void main( String arg[])
	{
		int num,count=0;
		num=Integer.parseInt(arg[0]);
		for(int i=2;i<num;i++)
		{
			if(num %i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("This is Prime no.");
		}
		else
		{
			System.out.println("This is not prime no.");
		}
	}	
}
	

		
			
			