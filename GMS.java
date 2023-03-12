class GMS 
{
	public static void main( String arg[])
	{
		int a,b,c;
		a=Integer.parseInt(arg[0]);
		b=Integer.parseInt(arg[1]);
		c=Integer.parseInt(arg[2]);
		int large,middle,small;
	
		if(a>b && a>c)
		{
			large=a;
			if(b>c)
			{
				middle=b;
				small=c;
			}
			else
			{
				middle=c;
				small=b;
			}
		}
		else if(b>a && b>c)
		{
			large=b;
			if(a>c)
			{
				middle=a;
				small=c;
			}
			else
			{
				middle=c;
				small=a;
			}
		}
		else
		{
			large=c;
			if(a>b)
			{
				middle=a;
				small=b;
			}
			else
			{
				middle=b;
				small=a;
			}
		}
		System.out.println("Greatest:" +large);
		System.out.println("Middle:" +middle);
		System.out.println("Smallest:" +small);
	}
}
		
