class Shape
{
    protected double Area;
    public int calculateArea()
    {
        return 0;
    }
}
class Circle extends Shape
{
    public double calculateArea(int r)
    {
        Area=3.14*r*r;
        return (double)Area;
    }
}
class Square extends Shape
{
    public int calculateArea(int a)
    {
        Area=a*a;
        return (int)Area;
    }
}
public class Protected
{
	public static void main(String[] args)
	{
	    Circle c=new Circle();
	    Square s=new Square();
		System.out.println("Area of Circle : "+c.calculateArea(6));
		System.out.println("Area of Square : "+s.calculateArea(4));
	}
}