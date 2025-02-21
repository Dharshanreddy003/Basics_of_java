import java.util.*;
class Add
{
	private int a,b,c,sum;
	private void get()
	{
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
	}
	public void display()
	{
	    get();
	    sum=a+b+c;
	    System.out.println("Sum :"+sum);
	}
}
class Private_Access
{
	public static void main(String[] args)
	{
        Add obj=new Add();
        obj.display();
	}
}