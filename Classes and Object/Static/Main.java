public class Main
{
	static int count;
	Main()
	{
		count++;
	}
	public static void main(String[] args)
	{
		Main obj1=new Main();
		Main obj2=new Main();
		Main obj3=new Main();
		System.out.println(count);
	}
}