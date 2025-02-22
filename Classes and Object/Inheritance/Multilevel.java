class Supermost
{
    private int a=10;
    int get()
    {
        return a;
    }
}
class Super extends Supermost
{
    protected int b=20;
    
}
class Sub extends Super
{
    int c=30;
    void display()
    {
        System.out.println(get());
        System.out.println(b);
        System.out.println(c);
    }
}
public class Multilevel
{
	public static void main(String[] args)
	{
	    Sub obj=new Sub();
	    obj.display();
	}
}