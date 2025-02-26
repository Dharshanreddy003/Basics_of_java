abstract class OuterClass
{
	abstract class InnerClass
	{
		abstract void c();
		static void d()
		{
			System.out.println("Inner class");
		}
	}
	abstract void a();
	public void c()
	{
		System.out.println("Outer class");
	}
}
public class InnerAbstractClass extends OuterClass
{
	public void a()
	{
		System.out.println("Hello World");
	}
	public static void main(String[] args)
	{
		InnerAbstractClass obj=new InnerAbstractClass();
		obj.a();
		InnerClass.d();
		obj.c();
	}
}