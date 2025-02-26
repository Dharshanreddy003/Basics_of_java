interface Interface1
{
    static void display1()
    {
        System.out.println("Interface 1 Static");
    }
    default void display2()
    {
        System.out.println("Interface 1 Default");
    }
    void display3();
}
interface Interface2 extends Interface1
{
    static void display1()
    {
        System.out.println("Interface 2 Static");
    }
    default void display2()
    {
        System.out.println("Interface 2 Default");
    }
    void display3();
}
public class Interface_Methods implements Interface1,Interface2
{
    public void display3()
	{
	    System.out.println("Display 1 Abstract");
	}
	public static void main(String[] args) 
	{
	    Interface_Methods obj=new Interface_Methods();
		Interface1.display1();
		Interface2.display1();
		obj.display2();
		obj.display3();
	}
}