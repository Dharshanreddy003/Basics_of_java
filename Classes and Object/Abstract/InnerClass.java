class Final
{
    final static class Inner
    {
        static void display()
        {
            int a=30;
            int b=40;
            System.out.println("sum : "+(a+b));
        }
    }
}
class InnerClass
{
	public static void main(String[] args)
	{
		Final.Inner.display();
	}
}