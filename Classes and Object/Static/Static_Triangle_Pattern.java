import java.util.*;
class Display
{
    static class Pattern
    {
        static void display(int n)
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    if(j%2==0)
                        System.out.print("# ");
                    else
                    {
                        System.out.print("* ");  
                    }
                }
                System.out.println();
            }
        }
    }
}
public class Static_Triangle_Pattern
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		Display.Pattern.display(n);
	}
}