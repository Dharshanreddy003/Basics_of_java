abstract class Final2
{
    final void display()
    {
        System.out.println("Final");
    }
}
public class Final extends Final2
{
    void display(int a,int b)
    {
        int c=a+b;
        System.out.println("Sum: "+c);
    }
	public static void main(String[] args)
	{
	    Final obj=new Final();
		obj.display();
		obj.display(45,76);
	}
}