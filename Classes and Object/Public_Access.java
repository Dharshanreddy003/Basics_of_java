import java.util.*;
public class Public_Access
{
    public int a,b,c,sum;
    public void display()
    {
        System.out.println("sum : "+sum);
    }
	public static void main(String[] args) 
	{
	    Public_Access obj=new Public_Access();
	    Scanner sc=new Scanner(System.in);
	    obj.a=sc.nextInt();
	    obj.b=sc.nextInt();
	    obj.c=sc.nextInt();
	    obj.sum=obj.a+obj.b+obj.c;
	    obj.display();
	}
}