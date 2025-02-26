public class CrossMark_Prime
{
	static int i=1;
	static int prime(int n)
	{
		boolean prime=false;
		while(!prime)
		{
			++i;
			if(i==2)
				prime=true;
			else 
			{
				for(int j=2;j<i;j++)
				{
					if(i%j==0) {
						prime = false;
						break;
					}
					else
						prime = true;
				}
			}

		}
		return i;
	}
	public static void main(String[] args)
	{
		int n=7;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==i || j==n-i+1)
				{
					if(i<n/2+1)
						System.out.print(n-j+1+" ");
					else
						System.out.print(j+" ");
				}
				else if((i==(n/2)+1 && (j==1 || j==n)) || (j==(n/2)+1 && (i==1 || i==n)))
					System.out.print(prime(n)+" ");
				else
					System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
}