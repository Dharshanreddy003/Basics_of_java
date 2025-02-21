import java.util.*;
class LeftangleTriangle
{
    void Display(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
class RightangleTriangle
{
    void Display(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>0;j--)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
public class Triangles
{
	public static void main(String[] args) 
	{
	    LeftangleTriangle obj1=new LeftangleTriangle();
	    RightangleTriangle obj2=new RightangleTriangle();
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    obj1.Display(n);
	    obj2.Display(n);
		
	}
}