public class Diamond
{
	public static void main(String[] args)
	{
	    int n=4;
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
	    for(int i=n-1;i>=1;i--)
	    {
	        for(int j=n-i;j>0;j--)
	        {
	            System.out.print(" ");
	        }
	        for(int k=1;k<i;k++)
	        {
	            System.out.print(k);
	        }
	        for(int l=i;l>=1;l--)
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
	            if( k==1 || k==i*2-1)
	                System.out.print("*");
	            else if(k%2==0)
	                System.out.print(" ");
	            else 
	                System.out.print(0);
	        }
	        System.out.print("\n");
	    }
	    for(int i=n-1;i>=1;i--)
	    {
	        for(int j=n-i;j>=1;j--)
	        {
	            System.out.print(" ");
	        }
	        for(int k=1;k<=i*2-1;k++)
	        {
	            if(k==1 || k==i*2-1)
	                System.out.print("*");
	            else if(k%2==0)
	                System.out.print(" ");
	            else
	                System.out.print(0);
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
	    }for(int i=n-1;i>=1;i--)
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
	    
    }
}