class Super
{
    static void display()
    {
        System.out.println("In Super Class");
    }
}
class Sub extends Super
{
    static void display()
    {
        System.out.println("In Sub Class");
    }
}
public class OverHiding
{
	public static void main(String[] args) 
	{
		Super obj=new Sub();
		Sub  obj1=new Sub();
		obj.display();
		obj1.display();
	}
}