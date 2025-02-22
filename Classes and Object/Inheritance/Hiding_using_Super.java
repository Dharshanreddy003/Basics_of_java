class Super
{
    int a=10;
    void display()
    {
        System.out.println(5);
    }
}
class Sub extends Super
{
    int a=56;
    void display()
    {
        System.out.println(a);
        System.out.println(super.a);
        super.display();
        System.out.println(a);
    }
}
public class Hiding_using_Super
{
	public static void main(String[] args) 
	{
		Sub obj=new Sub();
		obj.display();
	}
}