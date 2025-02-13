public class Pyramid_numbers
{
	public static void main(String[] args)
	{
	    int n=5;
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=1;j<=i;j++)
	        {
	            System.out.print("| ");
	        }
	        System.out.print("\n");
	    }
	    
	    
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=1;j<=i;j++)
	        {
	            System.out.print(i);
	        }
	        System.out.print("\n");
	    }
	    
	    
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=1;j<=i;j++)
	        {
	            System.out.print(j);
	        }
	        System.out.print("\n");
	    }
	    
	    
	    int num=1;
	    for(int i=1;i<n;i++)
	    {
	        for(int j=1;j<=i;j++)
	        {
	            System.out.print(num);
	            num++;
	        }
	        System.out.print("\n");
	    }
	    
	    
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=n-i;j>=1;j--)
	        {
	            System.out.print(" ");
	        }
	        for(int k=1;k<=i;k++)
	        {
	            System.out.print("|");
	        }
	        System.out.print("\n");
	    }
	    
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=n-i;j>=1;j--)
	        {
	            System.out.print(" ");
	        }
	        for(int k=1;k<=i;k++)
	        {
	            System.out.print("| ");
	        }
	        System.out.print("\n");
	    }
	    
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=n-i;j>=1;j--)
	        {
	            System.out.print(" ");
	        }
	        for(int k=1;k<=i*2-1;k++)
	        {
	            System.out.print("|");
	        }
	        System.out.print("\n");
	    }
	    
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=n-i;j>=1;j--)
	        {
	            System.out.print(" ");
	        }
	        for(int k=1;k<=i;k++)
	        {
	            System.out.print("* ");
	        }
	        System.out.print("\n");
	    }
	    
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=n-i;j>0;j--)
	        {
	            System.out.print(" ");
	        }
	        for(int k=1;k<=i;k++)
	        {
	            System.out.print(k);
	        }
	        for(int l=i-1;l>=1;l--)
	        {
	            System.out.print(l);
	        }
	        System.out.print("\n");
	    }
	    
	    
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=n-i;j>=1;j--)
	        {
	            System.out.print(" ");
	        }
	        for(int k=1;k<=i*2-1;k++)
	        {
	            if(i==n || k==1 || k==i*2-1)
	                System.out.print("*");
	            else
	                System.out.print(0);
	        }
	        System.out.print("\n");
	    }
		
		
		
	}
}