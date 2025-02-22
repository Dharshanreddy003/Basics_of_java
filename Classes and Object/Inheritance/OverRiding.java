class Parent
{
    public int publicmethod()
    {
        int a=1;
        return a;
    }
    private int privatemethod()
    {
        int b=2;
        return b;
    }
    int defaultmethod()
    {
        int c=3;
        return c;
    }
    static int staticmethod()
    {
        int d=4;
        return d;
    }
    protected int protectedmethod()
    {
        int e=5;
        return e;
    }
    int get()
    {
        return privatemethod();
    }
}
class Child extends Parent
{
     public int publicmethod()
    {
        int f=6;
        return f;
    }
    int defaultmethod()
    {
        int g=7;
        return g;
    }
    protected int protectedmethod()
    {
        int h=8;
        return h;
    }
}
public class OverRiding
{
	public static void main(String[] args) 
	{
	    Parent p=new Parent();
	    Child c=new Child();
		System.out.println(c.publicmethod());
		System.out.println(c.get());
		System.out.println(c.defaultmethod());
		System.out.println(c.protectedmethod());
		System.out.println(c.staticmethod());
		
	}
}