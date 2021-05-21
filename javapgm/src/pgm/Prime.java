package pgm;

class  prime
{
	public static void main(String[] args) 
	{
		boolean prime=false;
		int n =17;
		for(int i=2;i<n;i++)
		{
			if(n%2==0)
			{
				prime=false;
			}
			else
			{
				prime=true;
			}
			if(prime)
			{
				System.out.println("prime");
			}
			else
			{
				System.out.println("not prime");
			}
		}

	}
}